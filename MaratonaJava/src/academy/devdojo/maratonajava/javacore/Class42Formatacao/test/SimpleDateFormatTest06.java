package academy.devdojo.maratonajava.javacore.Class42Formatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest06 {
    public static void main(String[] args) {
        // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/text/SimpleDateFormat.html documentação 
        String pattern = "'Cascavel-PR dia' dd 'de' MMMM 'de' yyyy HH:mm:ss G";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        System.out.println(simpleDateFormat.format(new Date()));	
    }
}
