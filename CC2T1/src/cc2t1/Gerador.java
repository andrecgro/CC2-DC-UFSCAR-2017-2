/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc2t1;

import java.util.ArrayList;

/**
 *
 * @author andrecamargorocha
 */
public class Gerador extends LABaseVisitor <String>{
    String saidaCodigo = "";
    
    @Override
    public String visitPrograma(LAParser.ProgramaContext ctx) {
        
        //padrão para todo início de programa
        saidaCodigo =   "#include <stdio.h>\n" +
                        "#include <stdlib.h>\n" +
                        "#include <stdbool.h>\n" + //adicionando biblioteca para valores booleanos (a partir de C99)
                        "\n";
        
        //segue fluxo de acordo com regra gramatical
        visitDeclaracoes(ctx.declaracoes());
        
        saidaCodigo +=  "\nint main() {";
        visitCorpo(ctx.corpo());
        
        
        
        //padrão para todo fim de programa
        
        saidaCodigo +=   "\nreturn 0;\n" +
                        "}";
        
        System.out.println(saidaCodigo+"\n\n");
        return "";
    }

    @Override
    public String visitValor_constante(LAParser.Valor_constanteContext ctx) {
        if(ctx.getText() ==  "verdadeiro"){
            saidaCodigo += "true";
            return null;
        }
        if(ctx.getText() ==  "falso"){
            saidaCodigo += "false";
            return null;
        }
        if(ctx.CADEIA() !=  null){
            saidaCodigo += ctx.CADEIA().getText();
            return null;
        }
        if(ctx.NUM_INT() !=  null){
            saidaCodigo += ctx.NUM_INT().getText();
            return null;
        }
        return "";
    }

    @Override
    public String visitDeclaracao_local(LAParser.Declaracao_localContext ctx) {
        if (ctx.variavel() != null){//árvore na regra 'variavel'
            visitVariavel(ctx.variavel());
            return null;
        }
        if (ctx.valor_constante()!= null){//árvore na regra 'constante'
            saidaCodigo += "\n#define " + ctx.IDENT() + " ";
            visitValor_constante(ctx.valor_constante());
            return null;
        }
        if (ctx.tipo()!= null){//árvore na regra 'tipo'
            visitTipo(ctx.tipo(0));
            saidaCodigo += " "+ ctx.IDENT();
            visitTipo(ctx.tipo(0));
            return null;
        }
        
        return "";
    }

    
    
    
    @Override
    public String visitRegistro(LAParser.RegistroContext ctx) {// struct
        saidaCodigo += "struct{";
        visitVariavel(ctx.variavel());
        visitMais_variaveis(ctx.mais_variaveis());
        saidaCodigo += "\n} "+ ctx.variavel().IDENT();
        return "";
    }
    
    @Override
    public String visitParametro(LAParser.ParametroContext ctx) {
        visitTipo_estendido(ctx.tipo_estendido());
        visitIdentificador(ctx.identificador());
        visitMais_parametros(ctx.mais_parametros());
        return "";
    }

    @Override
    public String visitMais_parametros(LAParser.Mais_parametrosContext ctx) {
        if(ctx.getText() == null  || ctx.getText() == ""){
            return null;
        }
        saidaCodigo += ", ";
        visitParametro(ctx.parametro());
        return "";
    }

    @Override
    public String visitParametros_opcional(LAParser.Parametros_opcionalContext ctx) {
        if(ctx.getText() == null  || ctx.getText() == ""){
            return null;
        }
        visitParametro(ctx.parametro());
        return "";
    }
    
    
    @Override
    public String visitVariavel(LAParser.VariavelContext ctx) {
        saidaCodigo +=  "\n" +visitTipo(ctx.tipo()) + " ";
        saidaCodigo += ctx.IDENT().getText();
        visitDimensao(ctx.dimensao());
        visitMais_var(ctx.mais_var());
        saidaCodigo += ";";
        return "";
    }

    @Override
    public String visitMais_expressao(LAParser.Mais_expressaoContext ctx) {
        if(ctx.getText() == null || ctx.getText() == ""){
            return null;
        }
        visitExpressao(ctx.expressao());
        visitMais_expressao(ctx.mais_expressao());
        return "";
    }

    @Override
    public String visitSenao_opcional(LAParser.Senao_opcionalContext ctx) {
        if(ctx.getText() == null || ctx.getText() == ""){
            return null;
        }
        saidaCodigo += "\nelse{" + visitComandos(ctx.comandos()) + "\n}";
        return "";
    }
    

    
    @Override
    public String visitMais_var(LAParser.Mais_varContext ctx) {
        if( ctx == null || ctx.getText() == "" ){
         return null;
        }
        saidaCodigo += ", " + ctx.IDENT().getText() ;
        visitDimensao(ctx.dimensao());
        visitMais_var(ctx.mais_var());
        return "";
    }
    
    @Override
    public String visitDimensao(LAParser.DimensaoContext ctx) {
        if( ctx == null || ctx.getText() == "" ){
         return null;
        }
        saidaCodigo += "[" + visitExp_aritmetica(ctx.exp_aritmetica()) + "]";
        return "";
    }
    
    
    
    
    @Override
    public String visitTipo_basico(LAParser.Tipo_basicoContext ctx) { 
        switch (ctx.getText()){
            case "literal":
                return "char";
            case "inteiro":
                return "int";
            case "real":
                return "float";
            case "logico":
                return "bool";
        }
        return "";
    }

    @Override
    public String visitOp_opcional(LAParser.Op_opcionalContext ctx) {
        if("".equals(ctx.getText())){
            return null;
        }
        saidaCodigo += visitOp_relacional(ctx.op_relacional());
        visitExp_aritmetica(ctx.exp_aritmetica());
        return "";
    }

    @Override
    public String visitOutros_fatores_logicos(LAParser.Outros_fatores_logicosContext ctx) {
        if("".equals(ctx.getText())){
            return null;
        }
        saidaCodigo += "&&";
        visitFator_logico(ctx.fator_logico());
        visitOutros_fatores_logicos(ctx.outros_fatores_logicos());
        return "";
    }

    @Override
    public String visitOutros_termos_logicos(LAParser.Outros_termos_logicosContext ctx) {
        if("".equals(ctx.getText())){
            return null;
        }
        saidaCodigo += "||";
        visitTermo_logico(ctx.termo_logico());
        visitOutros_termos_logicos(ctx.outros_termos_logicos());
        return "";
    }

    @Override
    public String visitExp_aritmetica(LAParser.Exp_aritmeticaContext ctx) {
        saidaCodigo += " " + ctx.getText() + " ";
        return super.visitExp_aritmetica(ctx);
    }

    @Override
    public String visitIdentificador(LAParser.IdentificadorContext ctx) {
        saidaCodigo += visitPonteiros_opcionais(ctx.ponteiros_opcionais());
        saidaCodigo += ctx.IDENT().getText();
        saidaCodigo += ctx.dimensao().getText();
        visitOutros_ident(ctx.outros_ident());
        return "";
    }

    @Override
    public String visitOutros_ident(LAParser.Outros_identContext ctx) {
        if(ctx == null || ctx.getText() == ""){
            return "";
        }
        saidaCodigo += ".";
        visitIdentificador(ctx.identificador());
        return "";
    }
    

    @Override
    public String visitPonteiros_opcionais(LAParser.Ponteiros_opcionaisContext ctx) {
        if( ctx == null || ctx.getText() == "" ){
            return "";
        }
        return "*" + visitPonteiros_opcionais(ctx.ponteiros_opcionais());
    }
    
    @Override
    public String visitParcela_logica(LAParser.Parcela_logicaContext ctx) {
        if(ctx.getText() ==  "verdadeiro"){
            saidaCodigo += "true";
            return null;
        }
        if(ctx.getText() ==  "falso"){
            saidaCodigo += "false";
            return null;
        }
        visitExp_relacional(ctx.exp_relacional());
        return "";
    }
    
    
    
    //Regra de operadores relacionais
    @Override
    public String visitOp_relacional(LAParser.Op_relacionalContext ctx) {
        switch (ctx.getText()){
            case "=":
                return "==";
            case "<>":
                return "!=";
            case ">=":
                return ">=";
            case "<=":
                return "<=";
            case ">":
                return ">";
            case "<":
                return "<";
        }
        return "";
    }

    // Método sobreescrito par achecar se op_nao era diferente de vazio,
    // caso seja diferente precisava acrescentar o ponto de exclamação e os parêntesis
    @Override
    public String visitFator_logico(LAParser.Fator_logicoContext ctx) {
        String op_nao = ctx.op_nao().getText();
        
        if (!"".equals(op_nao)){
            saidaCodigo += "!(";
            visitParcela_logica(ctx.parcela_logica());
            saidaCodigo += ")";
        }
        else{
            visitParcela_logica(ctx.parcela_logica());
        }
        return "";
    }

    @Override
    public String visitCmd(LAParser.CmdContext ctx) {
        if ( ctx.identificador() != null ){//árvore na regra 'leia'
            saidaCodigo += "\nscanf(%s, &";
            visitIdentificador(ctx.identificador());
            visitMais_ident(ctx.mais_ident());
            saidaCodigo += ");";
            return null;
        }
        if (ctx.exp_escreva != null ){//árvore na regra 'escreva'
        }
        if (ctx.exp_se != null){//árvore na regra 'se'
            saidaCodigo += "\nif(";
            visitExpressao(ctx.expressao());
            saidaCodigo += "){";
            visitComandos(ctx.comandos());
            saidaCodigo += "}";
            visitSenao_opcional(ctx.senao_opcional());
            return null;
        }
        if (ctx.exp_a_caso != null ){//árvore na regra 'caso'
            
            return null;
        }
        if (ctx.exp_a_para != null ){//árvore na regra 'para'
            saidaCodigo += "\nfor(" + ctx.IDENT().getText();
            saidaCodigo += " = " + ctx.exp_a_para.getText();
            saidaCodigo += "; " + ctx.IDENT().getText();
            saidaCodigo += " <= " + ctx.exp_a_ate.getText();
            saidaCodigo += "; " + ctx.IDENT().getText();
            saidaCodigo += "++){\n" + visitComandos(ctx.comandos());
            saidaCodigo += "\n}";
            return null;
        }
        if (ctx.exp_enquanto != null ){//árvore na regra 'enquanto'
            saidaCodigo += "\nwhile(" + ctx.exp_enquanto.getText() + "){";
            saidaCodigo += "\n" + visitComandos(ctx.comandos());
            saidaCodigo += "\n}";
            return null;
        }
        if (ctx.exp_faca != null ){//árvore na regra 'faca'
            saidaCodigo += "do{";
            saidaCodigo += "\n" + visitComandos(ctx.comandos());
            saidaCodigo += "\n}";
            saidaCodigo += "\nwhile(" + visitExpressao(ctx.expressao()) + ");";
            return null;
        }
        if (ctx.exp_dimen != null ){//árvore na regra 'ponteiro (^)'
            saidaCodigo += "\n*" + ctx.IDENT().getText();
            visitOutros_ident(ctx.outros_ident());
            visitDimensao(ctx.dimensao());
            saidaCodigo += " = " + ctx.exp_dimen.getText();
            return null;
        }
        if (ctx.chamada_atribuicao() != null){//árvore na regra 'IDENT'
            saidaCodigo += "\n" + ctx.IDENT().getText();
            visitChamada_atribuicao(ctx.chamada_atribuicao());
            return null;
        }
        if (ctx.exp_retorne != null){//árvore na regra 'retorne'
            saidaCodigo += "\nreturn" + visitExpressao(ctx.expressao());
            return null;
        }
        return ""; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String visitChamada_atribuicao(LAParser.Chamada_atribuicaoContext ctx) {
        if(ctx.argumentos_opcional() != null){ // árvore na regra outros_ident
            
        }
        return ""; 
    }
    
    
}
