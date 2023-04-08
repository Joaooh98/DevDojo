package academy.devdojo.maratonajava.introducao;

public class Aula18Arrays01 {
   public static void main(String[] args) {
    int idade1 = 22; // 0
    int idade2 = 23; // 1
    int idade3 = 24; // 2
    int idade4 = 25; // 3
    System.out.println("imprimindo variavel declada 1 por 1\n");
      System.out.println(idade1);
      System.out.println(idade2);
      System.out.println(idade3);
      System.out.println(idade4);
    // declarando as mesma variaveis utilizado o array 
    // array e variavel do tipo reference
  
    int[] idades = null; // somente tipos reference pode ser inicializado com null 
    System.out.println("\nsomente tipos reference pode ser inicializado com null valor armazenado: "+idades);

    int[] idadess = new int[4];

    idadess [0] = 22;
    idadess [1] = 23;
    idadess [2] = 24;
    idadess [3] = 25;

    System.out.println(idadess[0]);
    System.out.println(idadess[1]);
    System.out.println(idadess[2]);
    System.out.println(idadess[3]);

   } 
}
