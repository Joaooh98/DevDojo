package academy.devdojo.maratonajava.javacore.ColecoesClass50.test;

import academy.devdojo.maratonajava.javacore.ColecoesClass50.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        var s1 = new Smartphone("1ABC1", "IPHONE");
        var s2 = new Smartphone("1ABC1", "IPHONE");
        
        System.out.println(s1.equals(s2));
    }
}
