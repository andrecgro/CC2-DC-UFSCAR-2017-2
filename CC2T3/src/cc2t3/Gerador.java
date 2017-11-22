/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc2t3;

/**
 *
 * @author andrecamargorocha
 */

import java.util.List;

public class Gerador extends CVLBaseVisitor{
      String saidaCodigo = "";

    @Override
    public String visitCurriculo(CVLParser.CurriculoContext ctx) {
        saidaCodigo += "<!DOCTYPE html>";
        saidaCodigo += "<html lang='en'>";
        saidaCodigo += "<head>";
          saidaCodigo += "<meta charset='UTF-8'>";
          saidaCodigo += "<meta name='viewport' content='width=device-width, initial-scale=1.0'>";
          saidaCodigo += "<meta http-equiv='X-UA-Compatible' content='ie=edge'>";
          saidaCodigo += "<title>";
          visitNome(ctx.nome());
          saidaCodigo += "</title>";
        saidaCodigo += "</head>";
        saidaCodigo += "<body>";
        
        
            visitNome(ctx.nome());
            visitEspecialidade(ctx.especialidade());
            visitContato(ctx.contato());
            
            
        saidaCodigo += "</body>";
        saidaCodigo += "</html>";
        
        System.out.println(saidaCodigo+"\n\n");
        return saidaCodigo;
    }

    
    @Override
    public String visitEmail(CVLParser.EmailContext ctx) {
        saidaCodigo += "<p>"+ctx.MAIL().getText()+"</p>";
        return "";
    }

    @Override
    public String visitTel(CVLParser.TelContext ctx) {
        saidaCodigo += "<p>"+ctx.TELEFONE().getText()+"</p>";
        return "";
    }

    @Override
    public String visitContato(CVLParser.ContatoContext ctx) {
        saidaCodigo += "<h3><stronger>Contato: </stronger><br/></h3>";
        List <CVLParser.TelContext> telefones = ctx.tel();
        List <CVLParser.EmailContext> emails = ctx.email();
        for(CVLParser.TelContext tel : telefones){
            visitTel(tel);
        } 
        for(CVLParser.EmailContext email : emails){
            visitEmail(email);
        } 
        return "";
    }

    @Override
    public String visitNome(CVLParser.NomeContext ctx) {
        saidaCodigo += "<h1>";
        saidaCodigo += ctx.CADEIA();
        saidaCodigo += "</h1>";
        return "";
    }
    
    @Override
    public String visitEspecialidade(CVLParser.EspecialidadeContext ctx) {
        saidaCodigo += "<h2>"+ctx.CADEIA().getText()+"</h2>";
        return "";
    }

      
}
