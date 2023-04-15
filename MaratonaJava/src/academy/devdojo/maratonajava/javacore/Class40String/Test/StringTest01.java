package academy.devdojo.maratonajava.javacore.Class40String.Test;

public class StringTest01 {
    public static void main(String[] args) {
        String name = "Joao"; // String constant pool onde esta armazenado "Joao"
        String name2 = "Joao";

        name.concat("jao"); // o valor nao e alterado devido ser imutavel a String, dessa forma so e criado
                            // o valor "jao" para dentro do Pool de String mais se uma varialvel de referencia
                            

        System.out.println(name);

        name = name.concat("jao"); // assim possivel concatenar o valor "Joao" com "jao"

        System.out.println(name);

        System.out.println(name.equals(name2)); // compara se o valor das String são iguais
        System.out.println(name == name2); // dessa forma validade se a referencia e a mesma
    }
}
