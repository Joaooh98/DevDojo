package academy.devdojo.maratonajava.javacore.Class52Internas;

public class OuterClasses {
    private String name = "Monkey D. Luffy";

    class Inner {
        public void printOuterClassAttribute() {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        OuterClasses outer = new OuterClasses();
        var inner = outer.new Inner();

        inner.printOuterClassAttribute();

        Inner inner2 = new OuterClasses().new Inner();

        inner2.printOuterClassAttribute();

    }
}
