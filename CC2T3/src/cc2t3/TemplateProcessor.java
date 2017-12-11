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
import java.io.PrintWriter;
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
    Map<Integer, String> matchedHash = new HashMap<Integer,String>();
    public Map processTemplateFile(File file) throws IOException {
        String fileContent = "";
        try {
            FileReader fr = new FileReader(file);
            int b = 0;
            while((b = fr.read())!=-1) {
                fileContent += (char)b;
            }
            
            Pattern p = Pattern.compile("%[^%(\\n)]+%");
            Matcher matchedTokens = p.matcher(fileContent);
            Integer key;
            while(matchedTokens.find()){
                key = matchedTokens.end()-matchedTokens.group().length();
                matchedHash.put(key,matchedTokens.group());
            }
            
            return matchedHash;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TemplateProcessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void replaceTags(File template, File output, Map<String, String> resultadoGerador) throws IOException {
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
        
        Pattern p = Pattern.compile("%[^%(\\n)]+%");
        Matcher matchedTokens = p.matcher(fileContent);
        StringBuffer sb = new StringBuffer();
        
        while(matchedTokens.find()){
            matchedTokens.appendReplacement(sb, resultadoGerador.get(matchedTokens.group()));
        }
        matchedTokens.appendTail(sb);
        PrintWriter writer = new PrintWriter(output, "UTF-8");
        writer.print(sb);
        writer.close();
    }
    
}
