package academy.devdojo.maratonajava.javacore.Heritage.test;

import academy.devdojo.maratonajava.javacore.Heritage.domain.Address;
import academy.devdojo.maratonajava.javacore.Heritage.domain.Employee;
import academy.devdojo.maratonajava.javacore.Heritage.domain.PersonF;

// henração tem um alto acoplamento entre os objetos  
public class InheritanceTest01 {
    public static void main(String[] args) {
        Address address =  new Address();

        address.setRoad("Rua erechim");
        address.setZipCode("85-814480");
        
        PersonF person = new PersonF();
        person.setName(" joao carlos de paiva");
        person.setCpf("10240404963");
        person.setAddress(address);
               System.out.println("-------------person------------");
        person.show();

        Employee employee = new Employee();
               System.out.println("-------------Employee------------");
        employee.setName("Mayety");
        employee.setCpf("10204869325");
        employee.setAddress(address);
        employee.setOffice("Advogada");
        employee.setWage(3000);

        // employee.show();/// metodo do objeto person
        employee.show();// medoto do objeto Employee
     }
}
