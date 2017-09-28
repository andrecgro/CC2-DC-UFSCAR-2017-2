package cc2t1;

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
    // Deve haver dois subdiretorios: entrada e saida
    private final static String CAMINHO_CASOS_TESTE = "/Users/andrecamargorocha/Documents/UFSCar/Compiladores II/CC2T1/casosDeTesteT1/1.arquivos_com_erros_sintaticos";
    
    // As flags GERA e VERIFICA são de uso do professor
    // GERA = true significa que a saída vai ser gerada, sobrescrevendo qualquer
    // conteudo do subdiretorio saida
    // VERIFICA = true gera a saída junto com o conteúdo da entrada, para
    // verificação
    // Alunos: deixem ambas como "false"
    private final static boolean GERA = false;
    private final static boolean VERIFICA = false;

    
    // Descomente o método abaixo para testar
    // Obs: este é o mesmo método que será usado pelo professor na correção
    // A nota que você obtiver aqui será usada no cálculo de sua nota do trabalho
    
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
            diretorioCasosTeste = new File(CAMINHO_CASOS_TESTE + "/entrada");
            casosTeste = diretorioCasosTeste.listFiles();
        }
        
        
        for (File casoTeste : casosTeste) {

            SaidaParser out = new SaidaParser();
            
            //TabelaDeSimbolos.limparTabela();
            try {
                ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(casoTeste));
                LALexer lexer = new LALexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                LAParser parser = new LAParser(tokens);
                parser.addErrorListener(new T1ErrorListener(out));
                parser.programa();
             } catch (ParseCancellationException pce) {
                if (pce.getMessage() != null) {
                   out.println(pce.getMessage());
                }
             }

            if (!out.isModificado()) {
                //casos sem erro : Gerar còdigo C
                out.println("Fim da analise. Sem erros sintaticos.");
                out.println("Tabela de simbolos:");

                //TabelaDeSimbolos.imprimirTabela(out);
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