package academy.devdojo.maratonajava.javacore.Class40String.Test;



public class StringTest02 {
    public static void main(String[] args) {
        String name = " L u f f y";
        String numeros = "012345";

        System.out.println(name.charAt(0)); // retorna o caracter na posição 0
        System.out.println(name.length()); // mostra a quantidade de caracter que contem a String 
        System.out.println(name.replace("L", "J")); // subistitui a letra 
        System.out.println(name.toLowerCase()); // passa todas as letras para minuscula 
        System.out.println(name.toLowerCase()); // passa todas as letras para maiuscula 
        System.out.println(numeros.substring(3));
        System.out.println(name.trim());// retira os espaçoes em branco da String que esta no começo e no final 
         
    }
    
}
