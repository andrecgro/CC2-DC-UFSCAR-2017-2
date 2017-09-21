/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc2t1;

import java.io.FileInputStream;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;

/**
 *
 * @author andrecamargorocha
 */

public class CC2T1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        SaidaParser out = new SaidaParser();
        try {
            ANTLRInputStream input = new ANTLRInputStream(CC2T1.class.getResourceAsStream("exemplos/casosDeTesteT1/1.arquivos_com_erros_sintaticos/entrada/1-algoritmo_2-2_apostila_LA_1_erro_linha_3_acusado_linha_10.txt"));
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
            out.println("Fim da analise. Sem erros sintaticos.");
            //out.println("Tabela de simbolos:");

            //TabelaDeSimbolos.imprimirTabela(out);
            System.out.print(out);
        } else {
            out.println("Fim da analise. Com erros sintaticos.");
        }
        
    }
    
}
