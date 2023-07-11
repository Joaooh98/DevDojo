package academy.devdojo.maratonajava.javacore.Class52Internas;

public class OuterClassesC {
    private String name = "Joao Carlos";

    static class Nested{
        private String lastName = "nested";
        void print(){
            System.out.println(new OuterClassesC().name+" "+lastName);
        }
    }

    public static void main(String[] args) {
        var nested = new Nested();
        nested.print();

    }
}
