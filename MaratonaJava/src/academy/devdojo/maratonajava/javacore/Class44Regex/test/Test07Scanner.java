package academy.devdojo.maratonajava.javacore.Class44Regex.test;

import java.util.Scanner;

public class Test07Scanner {
    public static void main(String[] args) {

        String texto ="Levi,Eren,Mikasa,true,200";
        try (Scanner scanner = new Scanner(texto)) {
            scanner.useDelimiter(",");                                  
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    int i = scanner.nextInt();
                    System.out.println("int "+i);
                } else if (scanner.hasNextBoolean()){
                    boolean b = scanner.nextBoolean();
                    System.out.println("boolean "+b);
                }else{
                    System.out.println(scanner.next());
                }
            }
        }
    }
}
