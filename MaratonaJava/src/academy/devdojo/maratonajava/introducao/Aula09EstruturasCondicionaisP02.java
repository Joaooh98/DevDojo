package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;



public class Aula09EstruturasCondicionaisP02 {
    public static void main(String[] args) {
         try (// idade < 15 categoria infantil
               // idade >= 15 && idade < 18 categoria juvenil
               // idade >= 18 && idade adulto
      Scanner e = new Scanner(System.in)) {
         int idade;
         String categoria;

         System.out.println("So e permitido numeros (ex: 1,2,3,4)\n informe qual a sua idade?");
          idade = e.nextInt();

         if (idade < 15) {
            categoria = "categoria infantil";
         }else if (idade >=15 && idade < 18) {
            categoria = "categoria juvenil";
         }else{
            categoria = "categoria Adulto";
         }
                              // operador tenarnario esse modelo nao e idicado utilizar
             //    condição se>    true(executa)    senao   condição se>           true(executa)        false(executa)
         
             // categoria = idade < 15 ? "categoria infantil": idade >=15 && idade < 18? "categoria juvenil":"categoria Adulto";
   
   
      //    if (idade < 15) {
      //       categoria = "categoria infantil";
      // }else(idade >=15 && idade < 18) {
      //       categoria = "categoria juvenil";
      // }
         System.out.println(categoria);
      }
   }
}
