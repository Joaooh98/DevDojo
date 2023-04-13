package academy.devdojo.maratonajava.javacore.Class38Exception.Runtime.test;

public class RuntimeExeptionTest02 {
    public static void main(String[] args) {
        divisao(50, 5);
        
    }
    /*
     * @param a nao pode ser zero 
     * @param b nao pode ser zero 
     * @return
     * @throws IllegalArgument
     */
    private static int divisao(int a, int b) {
        if (b==0 || a==0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        System.out.println(a/b);
        return 0;
        
    }
    
}
