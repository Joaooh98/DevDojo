package academy.devdojo.maratonajava.javacore.Class30Association.test;

import academy.devdojo.maratonajava.javacore.Class30Association.domain.LocationEX;
import academy.devdojo.maratonajava.javacore.Class30Association.domain.SeminarEX;
import academy.devdojo.maratonajava.javacore.Class30Association.domain.StudentEX;
import academy.devdojo.maratonajava.javacore.Class30Association.domain.TeacherEX;

/* Crie um sistema que genrencie seminarios 
 * 
 * O sistema devera cadastrar seminarios estudantes professores e local onde sera realizado
 * 
 * um aluno podera estar em apenas um seminario 
 * um seminario podera nenhum ou varios alunos 
 * um professor podera ministrar varios seminarios 
 * um seminario deve ter um local 
 * 
 * Campos basicos (excluindo relacionamento)
 * Seminario: titulo 
 * aluno: nome e idade 
 * professor: nome,  especialidade
 * local: endereço
 */
////// em ingles 

/* Create a system that manages seminars
  *
  * The system should register seminars, students, teachers and the place where it will be held
  *
  * a student can attend only one seminar
  * a seminar can have one or more students
  * a teacher can teach several seminars
  * a seminar must have a location
  *
  * Basic fields (excluding relationship)
  * Seminar: title
  * student: name and age
  * teacher: name, specialty
  * location: address
*/
public class Seminarexercise07 {
    public static void main(String[] args) {
        LocationEX loca = new LocationEX("Rua Erechin Nº 1819"); 
        StudentEX student = new StudentEX("Joao Carlos",25);
        TeacherEX teacher = new TeacherEX(" Mayety", "Direito");
        StudentEX [] studentForSeminar = {student};
        SeminarEX semin = new SeminarEX("O Manuscrito Original ", loca, studentForSeminar );     
        SeminarEX [] availableseminars = {semin};
        
        teacher.setseminarsT(availableseminars);

        teacher.show();
    }
    
}
