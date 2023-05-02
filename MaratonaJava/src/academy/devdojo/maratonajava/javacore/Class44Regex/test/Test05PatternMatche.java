package academy.devdojo.maratonajava.javacore.Class44Regex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test05PatternMatche {
    public static void main(String[] args) {
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";

        String text = "luffy@hotmail.com, 123jotaro@gmail.com,  #@!zoro@gmail.com, teste@gmail.com, sakura@gmail.com.br";

        System.out.print("\n o e-mail : #@!zoro@gmail.com : e valido: ");
        System.out.println("#@!zoro@gmail.com".matches((regex))); // verifica se esta de acordo com o regex
        System.out.println(text.split(",")[3].trim());

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("text:" + text);
        System.out.println("Regex: " + regex);
        System.out.println("posições encontradas: \n");
        while (matcher.find()) {
            System.out.print("posição " + matcher.start() + " valor:" + matcher.group() + "\n");
        }
    }
}
