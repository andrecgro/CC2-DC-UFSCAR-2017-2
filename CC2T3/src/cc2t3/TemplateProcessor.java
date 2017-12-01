/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc2t3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author andrecamargorocha
 */
public class TemplateProcessor {
    // retorna uma lista com todas as tags usadas no template
    Map matchedHash = new HashMap();
    public List<String> processTemplateFile(File file) throws IOException {
        String fileContent = "";
        try {
            FileReader fr = new FileReader(file);
            int b = 0;
            while((b = fr.read())!=-1) {
                fileContent += (char)b;
            }
            
            Pattern p = Pattern.compile("%.+%");
            Matcher matchedTokens = p.matcher(fileContent);
            
            while(matchedTokens.find()){
                matchedHash.put(matchedTokens.end(),matchedTokens.group());
            }
            
            System.out.println(matchedHash);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TemplateProcessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean checkTokenReplacing(String token) throws IOException{
        if(matchedHash.containsValue(token)){
            return true;
        }
        return false;
    }
    
    /*public void replaceTags(File template, File output, Map<String, String> resultadoVisitor) {
        String fileContent = "";
        try {
            FileReader fr = new FileReader(template);
            int b = 0;
            while((b = fr.read())!=-1) {
                fileContent += (char)b;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TemplateProcessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       String txt = resultadoVisitor.get("curriculo.nome");
       
        // substituir no fileContent
        
        // escrever fileContent no output
        
    }*/
    
}
