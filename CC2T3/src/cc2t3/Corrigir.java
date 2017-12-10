package cc2t3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class Corrigir {

    // Especifique o caminho dos casos de teste.
    private final static String CAMINHO_CASOS_TESTE = "/Users/andrecamargorocha/Documents/UFSCar/Compiladores2/CC2T3/caminhoCasosDeTeste/entrada";
    
     
    public static void main(String[] args) throws IOException, RecognitionException {
        File diretorioCasosTeste = null;
        File[] casosTeste = null;
        File   arquivoSaida = null;
        File[]   template = null;
        
        boolean arqUnico = false;
        
        try{
            if ( args[0] != null && !"".equals(args[0]) && args[1] != null && !"".equals(args[1]) && args[2] != null && !"".equals(args[2])){
                casosTeste = new File[1];
                casosTeste[0] = new File(args[0]);
                template = new File[1];
                template[0] = new File(args[1]);
                arquivoSaida = new File(args[2]);
                arqUnico = true;
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Sem argumentos de entrada");
        }
        
        if(!arqUnico){
            diretorioCasosTeste = new File(CAMINHO_CASOS_TESTE);
            casosTeste = diretorioCasosTeste.listFiles(new FileFilter() {
                public boolean accept(File pathname) {
                    return pathname.getName().toLowerCase().endsWith(".cvl");
                } 
            });
        }
        
        for(File casoTeste : casosTeste){
            if(!arqUnico){
                template = diretorioCasosTeste.listFiles(new FileFilter() {
                    public boolean accept(File pathname) {
                        String fileName = pathname.getName().split("\\.(?=[^\\.]+$)")[0];
                        String fileExtension = pathname.getName().split("\\.(?=[^\\.]+$)")[1];
                        
                        System.out.println(fileName);
                        System.out.println(fileExtension);
                        
                        return pathname.getName().toLowerCase().startsWith(casoTeste.getName().toString().substring(0,casoTeste.getName().length()-4), 0);
                    } 
                });
            }
            
            System.out.println("Começando análise do arquivo: "+ casoTeste.getName()+"\n");
            SaidaParser out = new SaidaParser();
            
            try{
                ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(casoTeste));
                CVLLexer lexer = new CVLLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                CVLParser parser = new CVLParser(tokens);
                parser.addErrorListener(new T3ErrorListener(out));

                CVLParser.DocumentoContext arvore = null;
                
                if(!arqUnico){
                template = diretorioCasosTeste.listFiles(new FileFilter() {
                    public boolean accept(File pathname) {
                        return pathname.getName().toLowerCase().startsWith(casoTeste.getName().substring(0,casoTeste.getName().length()-4), 0);
                    } 
                });
                AnalisadorSemantico analisadorSemantico = new AnalisadorSemantico();
                TabelaDeSimbolos tabela = (TabelaDeSimbolos) analisadorSemantico.visitDocumento(arvore);

                Gerador ger = new Gerador(tabela);
                ger.fileHasKeys(template[0], casoTeste, arquivoSaida);
            }
            } catch(FileNotFoundException fnf){
               System.out.println("Arquivo "+template[0].getName()+" não encontrado\n");
               continue;
            }
            
            System.out.println("Fim da compilação do arquivo: "+ casoTeste.getName() +"\n");
        }
        
    }
}