package cc2t3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
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
        boolean arqUnico = false;
        
        try{
            if ( args[0] != null && !"".equals(args[0]) && args[1] != null && !"".equals(args[1])){
                casosTeste = new File[1];
                casosTeste[0] = new File(args[0]);
                arquivoSaida = new File(args[1]);
                arqUnico = true;
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Sem argumentos de entrada");
        }
        
        if(!arqUnico){
            diretorioCasosTeste = new File(CAMINHO_CASOS_TESTE);
            casosTeste = diretorioCasosTeste.listFiles();
        }
        
        
        for (File casoTeste : casosTeste) {

            SaidaParser out = new SaidaParser();
            
            

            ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(casoTeste));
            CVLLexer lexer = new CVLLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            CVLParser parser = new CVLParser(tokens);
            parser.addErrorListener(new T3ErrorListener(out));
            
            CVLParser.CurriculoContext arvore = null;
            
            try {
                arvore = parser.curriculo();
             } catch (ParseCancellationException pce) {
                if (pce.getMessage() != null) {
                   out.println(pce.getMessage());
                }
             }

            if (!out.isModificado()) {
                //casos sem erro : Gerar código C
                Gerador ger = new Gerador();
                System.out.println(casoTeste.getName());
                String codigo = ger.visitCurriculo(arvore);

                if(arqUnico){
                    PrintWriter writer = new PrintWriter(arquivoSaida, "UTF-8");
                    writer.print(codigo);
                    writer.close();
                    arqUnico = false;
                }
                System.err.print(out);
            } else {
                out.println("Fim da compilacao");
                
                if(arqUnico){
                    PrintWriter writer = new PrintWriter(arquivoSaida, "UTF-8");
                    writer.print(out);
                    writer.close();
                    arqUnico = false;
                }
            }
        }
    }
}