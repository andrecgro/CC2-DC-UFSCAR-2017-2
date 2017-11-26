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
import org.antlr.v4.runtime.Token;

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
          saidaCodigo += "<link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">";
          saidaCodigo += "<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>";
          saidaCodigo += "<link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">";
          saidaCodigo += "<style>";
          saidaCodigo += "/*   \n" +
" * Template Name: Orbit - Responsive Resume/CV Template for Developers\n" +
" * Version: 1.0\n" +
" * Author: Xiaoying Riley\n" +
" * Twitter: @3rdwave_themes\n" +
" * License: Creative Commons Attribution 3.0 License\n" +
" * Website: http://themes.3rdwavemedia.com/\n" +
"*/\n" +
"/* styles.css */\n" +
"/* ======= Base ======= */\n" +
"body {\n" +
"  font-family: 'Roboto', sans-serif;\n" +
"  color: #545E6C;\n" +
"  background: #f5f5f5;\n" +
"  font-size: 14px;\n" +
"  padding: 30px;\n" +
"  -webkit-font-smoothing: antialiased;\n" +
"  -moz-osx-font-smoothing: grayscale;\n" +
"}\n" +
"h1,\n" +
"h2,\n" +
"h3,\n" +
"h4,\n" +
"h5,\n" +
"h6 {\n" +
"  font-weight: 700;\n" +
"}\n" +
"a {\n" +
"  color: #2d7788;\n" +
"  -webkit-transition: all 0.4s ease-in-out;\n" +
"  -moz-transition: all 0.4s ease-in-out;\n" +
"  -ms-transition: all 0.4s ease-in-out;\n" +
"  -o-transition: all 0.4s ease-in-out;\n" +
"}\n" +
"a:hover {\n" +
"  text-decoration: underline;\n" +
"  color: #1a454f;\n" +
"}\n" +
"a:focus {\n" +
"  text-decoration: none;\n" +
"}\n" +
"p {\n" +
"  line-height: 1.5;\n" +
"}\n" +
".wrapper {\n" +
"  background: #42A8C0;\n" +
"  max-width: 960px;\n" +
"  margin: 0 auto;\n" +
"  position: relative;\n" +
"  -webkit-box-shadow: 0px 2px 4px rgba(0, 0, 0, 0.1);\n" +
"  -moz-box-shadow: 0px 2px 4px rgba(0, 0, 0, 0.1);\n" +
"  box-shadow: 0px 2px 4px rgba(0, 0, 0, 0.1);\n" +
"}\n" +
".sidebar-wrapper {\n" +
"  background: #42A8C0;\n" +
"  position: absolute;\n" +
"  right: 0;\n" +
"  width: 240px;\n" +
"  height: 100%;\n" +
"  min-height: 800px;\n" +
"  color: #fff;\n" +
"}\n" +
".sidebar-wrapper a {\n" +
"  color: #fff;\n" +
"}\n" +
".sidebar-wrapper .profile-container {\n" +
"  padding: 30px;\n" +
"  background: rgba(0, 0, 0, 0.2);\n" +
"  text-align: center;\n" +
"  color: #fff;\n" +
"}\n" +
".sidebar-wrapper .name {\n" +
"  font-size: 32px;\n" +
"  font-weight: 900;\n" +
"  margin-top: 0;\n" +
"  margin-bottom: 10px;\n" +
"}\n" +
".sidebar-wrapper .tagline {\n" +
"  color: rgba(255, 255, 255, 0.6);\n" +
"  font-size: 16px;\n" +
"  font-weight: 400;\n" +
"  margin-top: 0;\n" +
"  margin-bottom: 0;\n" +
"}\n" +
".sidebar-wrapper .profile {\n" +
"  margin-bottom: 15px;\n" +
"}\n" +
".sidebar-wrapper .contact-list .fa {\n" +
"  margin-right: 5px;\n" +
"  font-size: 18px;\n" +
"  vertical-align: middle;\n" +
"}\n" +
".sidebar-wrapper .contact-list li {\n" +
"  margin-bottom: 15px;\n" +
"}\n" +
".sidebar-wrapper .contact-list li:last-child {\n" +
"  margin-bottom: 0;\n" +
"}\n" +
".sidebar-wrapper .contact-list .email .fa {\n" +
"  font-size: 14px;\n" +
"}\n" +
".sidebar-wrapper .container-block {\n" +
"  padding: 30px;\n" +
"}\n" +
".sidebar-wrapper .container-block-title {\n" +
"  text-transform: uppercase;\n" +
"  font-size: 16px;\n" +
"  font-weight: 700;\n" +
"  margin-top: 0;\n" +
"  margin-bottom: 15px;\n" +
"}\n" +
".sidebar-wrapper .degree {\n" +
"  font-size: 14px;\n" +
"  margin-top: 0;\n" +
"  margin-bottom: 5px;\n" +
"}\n" +
".sidebar-wrapper .education-container .item {\n" +
"  margin-bottom: 15px;\n" +
"}\n" +
".sidebar-wrapper .education-container .item:last-child {\n" +
"  margin-bottom: 0;\n" +
"}\n" +
".sidebar-wrapper .education-container .meta {\n" +
"  color: rgba(255, 255, 255, 0.6);\n" +
"  font-weight: 500;\n" +
"  margin-bottom: 0px;\n" +
"  margin-top: 0;\n" +
"}\n" +
".sidebar-wrapper .education-container .time {\n" +
"  color: rgba(255, 255, 255, 0.6);\n" +
"  font-weight: 500;\n" +
"  margin-bottom: 0px;\n" +
"}\n" +
".sidebar-wrapper .languages-container .lang-desc {\n" +
"  color: rgba(255, 255, 255, 0.6);\n" +
"}\n" +
".sidebar-wrapper .languages-list {\n" +
"  margin-bottom: 0;\n" +
"}\n" +
".sidebar-wrapper .languages-list li {\n" +
"  margin-bottom: 10px;\n" +
"}\n" +
".sidebar-wrapper .languages-list li:last-child {\n" +
"  margin-bottom: 0;\n" +
"}\n" +
".sidebar-wrapper .interests-list {\n" +
"  margin-bottom: 0;\n" +
"}\n" +
".sidebar-wrapper .interests-list li {\n" +
"  margin-bottom: 10px;\n" +
"}\n" +
".sidebar-wrapper .interests-list li:last-child {\n" +
"  margin-bottom: 0;\n" +
"}\n" +
".main-wrapper {\n" +
"  background: #fff;\n" +
"  padding: 60px;\n" +
"  padding-right: 300px;\n" +
"}\n" +
".main-wrapper .section-title {\n" +
"  text-transform: uppercase;\n" +
"  font-size: 20px;\n" +
"  font-weight: 500;\n" +
"  color: #2d7788;\n" +
"  position: relative;\n" +
"  margin-top: 0;\n" +
"  margin-bottom: 20px;\n" +
"}\n" +
".main-wrapper .section-title .fa {\n" +
"  width: 30px;\n" +
"  height: 30px;\n" +
"  margin-right: 8px;\n" +
"  display: inline-block;\n" +
"  color: #fff;\n" +
"  -webkit-border-radius: 50%;\n" +
"  -moz-border-radius: 50%;\n" +
"  -ms-border-radius: 50%;\n" +
"  -o-border-radius: 50%;\n" +
"  border-radius: 50%;\n" +
"  -moz-background-clip: padding;\n" +
"  -webkit-background-clip: padding-box;\n" +
"  background-clip: padding-box;\n" +
"  background: #2d7788;\n" +
"  text-align: center;\n" +
"  padding-top: 8px;\n" +
"  font-size: 16px;\n" +
"  position: relative;\n" +
"  top: -2px;\n" +
"}\n" +
".main-wrapper .section {\n" +
"  margin-bottom: 60px;\n" +
"}\n" +
".main-wrapper .experiences-section .item {\n" +
"  margin-bottom: 30px;\n" +
"}\n" +
".main-wrapper .upper-row {\n" +
"  position: relative;\n" +
"  overflow: hidden;\n" +
"  margin-bottom: 2px;\n" +
"}\n" +
".main-wrapper .job-title {\n" +
"  color: #3F4650;\n" +
"  font-size: 16px;\n" +
"  margin-top: 0;\n" +
"  margin-bottom: 0;\n" +
"  font-weight: 500;\n" +
"}\n" +
".main-wrapper .time {\n" +
"  position: absolute;\n" +
"  right: 0;\n" +
"  top: 0;\n" +
"  color: #97AAC3;\n" +
"}\n" +
".main-wrapper .company {\n" +
"  margin-bottom: 10px;\n" +
"  color: #97AAC3;\n" +
"}\n" +
".main-wrapper .project-title {\n" +
"  font-size: 16px;\n" +
"  font-weight: 400;\n" +
"  margin-top: 0;\n" +
"  margin-bottom: 5px;\n" +
"}\n" +
".main-wrapper .projects-section .intro {\n" +
"  margin-bottom: 30px;\n" +
"}\n" +
".main-wrapper .projects-section .item {\n" +
"  margin-bottom: 15px;\n" +
"}\n" +
".skillset .item {\n" +
"  margin-bottom: 15px;\n" +
"  overflow: hidden;\n" +
"}\n" +
".skillset .level-title {\n" +
"  font-size: 14px;\n" +
"  margin-top: 0;\n" +
"  margin-bottom: 12px;\n" +
"}\n" +
".skillset .level-bar {\n" +
"  height: 12px;\n" +
"  background: #f5f5f5;\n" +
"}\n" +
".skillset .level-bar-inner {\n" +
"  height: 12px;\n" +
"  background: #7bc2d3;\n" +
"}\n" +
".footer {\n" +
"  padding: 30px;\n" +
"  padding-top: 60px;\n" +
"}\n" +
".footer .copyright {\n" +
"  line-height: 1.6;\n" +
"  color: #545E6C;\n" +
"  font-size: 13px;\n" +
"}\n" +
".footer .fa-heart {\n" +
"  color: #fb866a;\n" +
"}\n" +
"/* Extra small devices (phones, less than 768px) */\n" +
"@media (max-width: 767px) {\n" +
"  .sidebar-wrapper {\n" +
"    position: static;\n" +
"    width: inherit;\n" +
"  }\n" +
"  .main-wrapper {\n" +
"    padding: 30px;\n" +
"  }\n" +
"  .main-wrapper .time {\n" +
"    position: static;\n" +
"    display: block;\n" +
"    margin-top: 5px;\n" +
"  }\n" +
"  .main-wrapper .upper-row {\n" +
"    margin-bottom: 0;\n" +
"  }\n" +
"}\n" +
"/* Small devices (tablets, 768px and up) */\n" +
"/* Medium devices (desktops, 992px and up) */\n" +
"@media (min-width: 992px) {\n" +
"  .skillset .level-title {\n" +
"    display: inline-block;\n" +
"    float: left;\n" +
"    width: 30%;\n" +
"    margin-bottom: 0;\n" +
"  }\n" +
"  .skillset .level-bar {\n" +
"    display: inline-block;\n" +
"    width: 70%;\n" +
"    float: left;\n" +
"    position: relative;\n" +
"    top: 1px;\n" +
"  }\n" +
"}\n" +
"/* Large devices (large desktops, 1200px and up) */\n" +
"/* Ex-Large devices (large desktops, 1200px and up) */";
          saidaCodigo += "</style>";
          saidaCodigo += "<title>";
          visitNome(ctx.nome());
          saidaCodigo += "</title>";
        saidaCodigo += "</head>";
        saidaCodigo += "<body>";
        saidaCodigo += "<div class='wrapper'>";
            saidaCodigo += "<div class='sidebar-wrapper'>";
                saidaCodigo += "<div class='profile-container'>";
                    visitNome(ctx.nome());
                    visitEspecialidade(ctx.especialidade());
                saidaCodigo += "</div>";
        
            saidaCodigo += "<div class='contact-container container-block'>";
                visitContato(ctx.contato());
            saidaCodigo += "</div>";
                visitFormacoes(ctx.formacoes());
                visitIdiomas(ctx.idiomas());
            saidaCodigo += "</div>";
        saidaCodigo += "</div>";
        saidaCodigo += "</body>";
        saidaCodigo += "</html>";
        
        System.out.println(saidaCodigo+"\n\n");
        return saidaCodigo;
    }

    
    @Override
    public String visitEmail(CVLParser.EmailContext ctx) {
        saidaCodigo += "<li class='email'>";
            saidaCodigo += "<i class='fa fa-envelope'></i>";
            saidaCodigo += "<a href='mailto: "+ctx.MAIL().getText()+"'>";
            saidaCodigo += ctx.MAIL().getText();
            saidaCodigo += "</a>";
        saidaCodigo += "</li>";
        return "";
    }

    @Override
    public String visitTel(CVLParser.TelContext ctx) {
        saidaCodigo += "<li class='phone'>";
            saidaCodigo += "<i class='fa fa-phone'></i>";
            saidaCodigo += "<a href='tel: "+ctx.TELEFONE().getText()+"'>";
            saidaCodigo += ctx.TELEFONE().getText();
            saidaCodigo += "</a>";
        saidaCodigo += "</li>";
        return "";
    }

    @Override
    public String visitContato(CVLParser.ContatoContext ctx) {
        saidaCodigo += "<ul class='list-unstyled contact-list'>";
        List <CVLParser.TelContext> telefones = ctx.tel();
        List <CVLParser.EmailContext> emails = ctx.email();
        for(CVLParser.TelContext tel : telefones){
            visitTel(tel);
        } 
        for(CVLParser.EmailContext email : emails){
            visitEmail(email);
        } 
        saidaCodigo += "</ul>";
        return "";
    }

    @Override
    public String visitNome(CVLParser.NomeContext ctx) {
        String aux = ctx.CADEIA().getText();
        saidaCodigo += "<h1 class='name'>";
        saidaCodigo += aux.substring(1, aux.length()-1);
        saidaCodigo += "</h1>";
        return "";
    }
    
    @Override
    public String visitEspecialidade(CVLParser.EspecialidadeContext ctx) {
        String aux = ctx.CADEIA().getText();
        saidaCodigo += "<h3 class='tagline'>"+aux.substring(1, aux.length()-1)+"</h3>";
        return "";
    }

    @Override
    public Object visitIdiomas(CVLParser.IdiomasContext ctx) {
        List <Token> idiomas = ctx.idioma;
        for(Token idioma : idiomas){
            saidaCodigo += "<li>"+idioma.getText()+"</li>";
        }
        return "";
    }

    @Override
    public Object visitFormacoes(CVLParser.FormacoesContext ctx) {
        List <CVLParser.FormacaoContext> formacoes = ctx.formacao();
        for(CVLParser.FormacaoContext formacao : formacoes){
            saidaCodigo += "<p><strong>"+formacao.universidade.getText()+"</strong></p>";
            saidaCodigo += "<p>"+formacao.curso.getText()+"</p>";
            saidaCodigo += "<p>"+formacao.inicio.getText();
            saidaCodigo += " - " + formacao.atual.getText() +"</p>";
        }
        return "";
    }
    
    

      
}
