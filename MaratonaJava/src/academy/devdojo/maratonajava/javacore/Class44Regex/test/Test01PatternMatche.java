package academy.devdojo.maratonajava.javacore.Class44Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test01PatternMatche {
    public static void main(String[] args) {
        String regex = "aba";
        String text = "abaaba";
        String text1 = "abababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("  text:" + text);
        System.out.println("indcie:0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("posições encontradas: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

        Matcher matcher1 = pattern.matcher(text1);
        System.out.println("  text:" + text1);
        System.out.println("indcie:0123456789");
        System.out.println("Regex: " + regex);
        System.out.println("posições encontradas: ");
        while (matcher1.find()) {
            System.out.print(matcher1.start() + " " + matcher1.group() + "\n");
        }
    }
}
