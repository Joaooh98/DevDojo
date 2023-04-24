package academy.devdojo.maratonajava.javacore.Class39Wrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10;
        float floatP = 10F;
        double doubleP =10D;
        char charP = 'W';
        boolean booleanP = false;

        // dessa formas nao e mais um tipo primitivo e sim um objeto da classe tipo Wrapper

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW =10D;
        Character charW = 'W';
        Boolean booleanW = false;

        Integer intW1 = 1; // autoboxing 
        int i =  intW; // unboxing, nesse caso o java ta se encarregando de transformar o tipo wrapper em tipo primitivo 

        Integer intW2 = Integer.parseInt("1"); // muda de String para inteiro

        System.out.println(intW2);

        boolean verdade =  Boolean.parseBoolean("trUE");

        System.out.println(verdade);

        System.out.println(Character.isDigit(charP));

        System.out.println(intW1);
        System.out.println(i);

        System.out.println(byteP);
        System.out.println(shortP);
        System.out.println(intP);
        System.out.println(longP);
        System.out.println(floatP);
        System.out.println(doubleP);
        System.out.println(booleanP);

        System.out.println(byteW);
        System.out.println(shortW);
        System.out.println(intW);
        System.out.println(longW);
        System.out.println(floatW);
        System.out.println(doubleW);
        System.out.println(charW);
        System.out.println(booleanW);
        
    }
}
