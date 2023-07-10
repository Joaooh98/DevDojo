package academy.devdojo.maratonajava.javacore.Class52Internas;

public class OuterClassesB {
    private String name = "Monkey D. Luffy";

    void print(){

        final String lastName = "izuki";

        class LocalClass{
            
            public void printLocal(){
                System.out.println(name);
                System.out.println(lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesB outer = new OuterClassesB();
        outer.print();
    }
}
// https://www.devmedia.com.br/aprendendo-sobre-classes-internas/15581