/*
 * crie variaveis pa os campos descritos abaixo entre <> e imprima a seguinte mensagem
 * 
 * Eu <nome>, morando no <endereco>, confirmo que recebi o salario de <salario>, na data de <data>
 */
package academy.devdojo.maratonajava.introducao;

import java.util.Calendar;
import java.util.Scanner;

public class aula03ExerciciosTiposPrimitivos {

    public static void main(String[] args) {
       // exercicio proposto 

       try (Scanner leitor = new Scanner (System.in)) {
        Calendar c = Calendar.getInstance();

               System.out.println("DATA/HORA atual "+c.getTime());
               System.out.println("Ano: "+c.get(Calendar.YEAR));
               System.out.println("Mes: "+c.get(Calendar.MONTH));
               System.out.println("Dia do Mes: "+c.get(Calendar.DAY_OF_MONTH));

                   String nome;
                   String endereco;
                   float salario; 

                   String salarioL; 
                   String dataL; 

               // dados
               System.out.println("Qual o seu nome?\n");
                   nome = leitor.nextLine();
               
               System.out.println("qual o seu endereco?\n");
                   endereco = leitor.nextLine();

               System.out.println("informe o sua media salario: \n");
                   salarioL = leitor.nextLine();// recebe o valor como String 
                   salario = Float.parseFloat(salarioL); // converte para float

               System.out.println("qual a sua data de nascimento?"); 
                   dataL = leitor.nextLine();
                   
   System.out.println("Eu "+nome+" moro nasido na data de "+dataL+", atualmente moro no endereco "+ endereco +" recebi o salario de R$ :"+salario+", na data de "+c.getTime());
    } catch (NumberFormatException e) {
        e.printStackTrace();
        }
    }
}
