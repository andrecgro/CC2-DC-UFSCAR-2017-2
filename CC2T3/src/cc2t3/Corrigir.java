package cc2t3;

import java.io.BufferedReader;
import java.io.File;
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
        File   template = null;
        boolean arqUnico = false;
        

        if ( args[0] != null && !"".equals(args[0]) && args[1] != null && !"".equals(args[1]) && args[2] != null && !"".equals(args[2])){
            casosTeste = new File[1];
            casosTeste[0] = new File(args[0]);
            template = new File(args[1]);
            arquivoSaida = new File(args[2]);
            arqUnico = true;
        }
        
        for(File casoTeste : casosTeste){
            System.out.println("Começando análise do arquivo: "+ casoTeste.getName());
            SaidaParser out = new SaidaParser();
            
            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(casoTeste));
            CVLLexer lexer = new CVLLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CVLParser parser = new CVLParser(tokens);
            parser.addErrorListener(new T3ErrorListener(out));
            
            CVLParser.DocumentoContext arvore = null;
            
            try {
                arvore = parser.documento();
             } catch (ParseCancellationException pce) {
                if (pce.getMessage() != null) {
                   out.println(pce.getMessage());
                }
             }
            System.out.println(out.conteudo);
            
            try{
                AnalisadorSemantico analisadorSemantico = new AnalisadorSemantico();
                TabelaDeSimbolos tabela = (TabelaDeSimbolos) analisadorSemantico.visitDocumento(arvore);
                Gerador ger = new Gerador(tabela);
                if(!ger.fileHasKeys(template, casoTeste, arquivoSaida)){
                     System.out.println("\nArquivo "+ casoTeste.getName() +" não compilado, contém erros.\n");
                    return;
                }
            }catch(ClassCastException c){
                System.out.println("\nArquivo "+ casoTeste.getName() +" não compilado, contém erros.\n");
                return;
            }
            
            System.out.println("\nFim da análise do arquivo: "+ casoTeste.getName() +"\nCompilado com sucesso!\n");
        }
    }
}