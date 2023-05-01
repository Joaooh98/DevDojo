package academy.devdojo.maratonajava.javacore.Class44Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test02PatternMatche {
    public static void main(String[] args) {
        /* Expressões regulares (meta caractere)
         * \d = todos os digitos numericos
         */
        String regex = "\\d";
        String text = "a1s2s3s4s5s6fdf465s45fa4413f5d4f6";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        
        System.out.println("  text:"+text);
        System.out.println("indcie:0123456789");
        System.out.println("Regex: "+regex);
        System.out.println("posições encontradas: ");
        while (matcher.find()) {
            System.out.print("posição "+matcher.start()+" valor:"+matcher.group()+"\n");
        }
    
    } 
}
