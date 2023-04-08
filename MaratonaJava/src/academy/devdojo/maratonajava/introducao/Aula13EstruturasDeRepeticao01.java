package academy.devdojo.maratonajava.introducao;

// para trabalhar com estrutura de repetição e sempre necessario informar o valor final

// while //
// Para que sejea executado a estrutura while tem como regra ser um valor booleano como e no IF

// do while 
// idependente de da condição ser verdadeira ou falsa ele vai ser executado pelomenos 1 vez 
public class Aula13EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for 
        
        System.out.println("\n----------------Exmplo 01----while---------------\n");
        
        int cont = 1; // inicio 
         while (cont <10) { // condição para o fim 
            System.out.println(++cont); // oque ele faz caso nao atenda a condição anterior 
            
         }
        System.out.println("\n----------------Exmplo 02------do-while-------------\n");
        int cont1 = 12; // inicio falso nao entra nesse bloco 
         while (cont1 <10) { // condição para o fim 
            System.out.println(++cont1); // oque ele faz caso nao atenda a condição anterior 
            
         }
         do { 
            System.out.println("dentro do do-while"+ ++cont);
         } while (cont < 10); // mesmo que o cont seja menos que 12 sera executado pelomenso 1 vez

         System.out.println("\n----------------Exmplo 03-------do-while------------\n");

         int cont2 = 12; // inicio falso nao entra nesse bloco 
         while (cont <10) { // condição para o fim 
            System.out.println(++cont); // oque ele faz caso nao atenda a condição anterior 
            
         }
         cont2 = 0;
         do { 
            System.out.println("dentro do do-while"+cont2);
            ++cont2;
         } while (cont2 < 10); // mesmo que o cont seja menos que 12 sera executado pelomenso 1
        
         System.out.println("\n----------------Exmplo 04-------for------------\n");
            //valorIn   final   cond
         for (int i = 0; i < 10; i++) {
            System.out.println("estrutura do for "+i);
         }
    }

}
