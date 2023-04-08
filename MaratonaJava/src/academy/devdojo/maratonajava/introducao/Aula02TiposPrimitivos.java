package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    /**
     * @param args
     */
    public static void main(String[] args) {


           //// tipos primitivos //// 

            int valorintpositivo = 648;
            int valorintnegativo = -648;

            long numeroGrandepositivo =  2146999999;
            long numeroGrandenegativo  =  -2146999999; // 8byte

            double doublepositivo = 1.7e+308;
            double doublenegativo = 1.7e-308;

            float valorFloatpositivo = 3.4e+038f;
            float valorFloatnegativo = 3.4e-038f;

            byte valortipobytepositivo = 127;
            byte valortipobytenegativo = -128;

            short valortiposhortpositivo = 32767;
            short valortiposhortnegativo = -32768;

            boolean verdadeiro = true;
            boolean falso = false;
            
            char tipochar = '\u0041'; // buscar valores na tabela ask

            // String nao e um tipo pirmitivo e uma classe//

            String nome1 = "String nao e um tipo primitivo e uma classe";
            ////////////////////////mostrando na tela//////////////////////////////

            System.out.println("\nMateria atual tipos primitivos\n");

            System.out.println("--------------int-----------------\n");

            System.out.println("valor int positivo: "+valorintpositivo);
            System.out.println("valor int negativo: "+valorintnegativo);

            System.out.println("------------long------------------\n");

            System.out.println("valor long positivo: "+numeroGrandepositivo);
            System.out.println("valor long negativo: "+numeroGrandenegativo);

            System.out.println("--------------double--------------\n");

            System.out.println("valor double positivo: "+doublepositivo);
            System.out.println("valor double negativo: "+doublenegativo);

            System.out.println("--------------float---------------\n");

            System.out.println("valor float positivo: "+valorFloatpositivo);
            System.out.println("valor float negativo: "+valorFloatnegativo); 
            
            System.out.println("--------------short----------------\n");

            System.out.println("valor short positivo: "+valortiposhortpositivo);
            System.out.println("valor short negativo: "+valortiposhortnegativo);

            System.out.println("--------------byte -----------------\n");

            System.out.println("valor byte positivo: "+valortipobytepositivo);
            System.out.println("valor byte negativo: "+valortipobytenegativo);

            System.out.println("---------------boolean-------------\n");

            System.out.println("valor boolean verdadeiro: "+verdadeiro);
            System.out.println("valor boolean falso: "+falso);

            System.out.println("---------------char----------------\n");

            System.out.println("valor char: "+tipochar);

            System.out.println("-------------Classe String---------\n");

            System.out.println(nome1);

                      
        }
    }

