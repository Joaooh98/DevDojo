package academy.devdojo.maratonajava.javacore.Class31Heritage.testP;

import academy.devdojo.maratonajava.javacore.Class31Heritage.domainPro.EmployeeP;

public class InheritanceTestProte02 {
    public static void main(String[] args) {
        EmployeeP employeeP = new EmployeeP("Jiraya");
        System.out.println(employeeP);
    }
}
/* 0 - Bloco de inicialização estatico da super classe é executado quando a JVM carregar classe Pai 
 * 1 - Bloco de inicialização estatico da subclasse e executado quando a JVM carregar a filha 
 * 2 - Alocado o espaço em memoria para o objeto da superClasse 
 * 3 - Cada atributo de superClasse é criado e inicializado com valores default ou que for passado da classe Pai
 * 4 - Bloco de inicialização da superClasse e executado na ordem que aparece
 * 5 - Construtor da superClasse é executado 
 * 6 - Alocado o espaço em memoria para o objeto da subClasse
 * 7 - cada atributo de superClasse é criado e inicializado com valores default ou o quer  for passado
 * 8 - Bloco de inicialização da subClasse é executado na ordem em que aparece
 * 9 - Construtor da subClasse é executado
 */