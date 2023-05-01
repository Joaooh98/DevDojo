package academy.devdojo.maratonajava.javacore.Class44Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test03PatternMatche {
    public static void main(String[] args) {
            /* segue os exemplos basicos de algumas expressoes regulares 
            * 
            * \d = todos os digitos exemplo: "a1s2s3s4s5s6fdf".
            * \D = tudo que nao for digito exemplo: "a1s2s3s4s5s@#6fdf".
            * \s = Espacos em branco exemplo: "a1s2s3s4s 5s@#\t6fdf". 
            * \S = tudo que nao tem espaco em branco exemplo: "a1 s2s 3s4s 5s@#6fdf".
            * \w = a-z, A-Z, digitos, _ exemplo: "a#_1s2s_abcde3s4s%5s@#6fdf".
            * \W = retorna somente os caracteres exemplo: "a#_1s2s_abcde3s4s%5s@#6fdf".
            */
            String regex = "\\W";
            String text = "a#_1s2s_abcde3s4s%5s@#6fdf";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            System.out.println("  text:" + text);
            System.out.println("indcie:0123456789");
            System.out.println("Regex: " + regex);
            System.out.println("posições encontradas: ");
            while (matcher.find()) {
                System.out.print("posição " + matcher.start() + " valor:" + matcher.group() + "\n");
            }

    }
}
