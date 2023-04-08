package academy.devdojo.maratonajava.introducao;

public class aula04Operadores {
   public static void main(String[] args) {
    // +, -, /, *, % //
   
            int numero1 = 10;
            int numero2 = 20;
            int resultadosub = numero1-numero2;
            int resultadodiv = numero1/numero2;
            int resultadosoma = numero1+numero2;
            int resultadomult = numero1*numero2;
            int resultadoresto = numero1%numero2;

         System.out.println("\n Operadores Aritimetricos +, -, /, *, % \n");
            
         System.out.println(resultadosub);
         System.out.println(resultadodiv);
         System.out.println(resultadomult);
         System.out.println(resultadosoma);  
         System.out.println(resultadoresto);
  
         System.out.println("\nOperadores realacionais <, >, <=, >=, ==, != \n");
     // < > <= >= == != // esses operadores sempre vai retornor valor booleano 
            boolean isDezMaiorQueVinte = numero1 > numero2;
            boolean isDezMenorQueVinte = numero1 < numero2;
            boolean isDezMenorouigualVinte = numero1 <= numero2;
            boolean isDezMaiorOuIgualaVinte = numero1 >= numero2;
            boolean isDezIgualaVinte = numero1 == numero2;
            boolean isDezDiferenteVinte = numero1 != numero2;

         System.out.println("10 > 20: "+isDezMaiorQueVinte);
         System.out.println("10 < 20: "+isDezMenorQueVinte);
         System.out.println("10 <= 20: "+isDezMenorouigualVinte);
         System.out.println("10 >= 20: "+isDezMaiorOuIgualaVinte);
         System.out.println("10 == 20: "+isDezIgualaVinte);
         System.out.println("10 != 20: "+isDezDiferenteVinte);
      

   }
}
