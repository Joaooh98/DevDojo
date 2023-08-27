package academy.devdojo.maratonajava.javacore.Competition.test;

public class CalcMemory {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println();
            
        long totalMemory = Runtime.getRuntime().totalMemory();
        System.out.println(totalMemory);
        long freMemory = Runtime.getRuntime().freeMemory();
        System.out.println(freMemory);

        System.out.println(totalMemory-freMemory);
    }
}
