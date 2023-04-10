package academy.devdojo.maratonajava.javacore.Class35AbstractClasses.Test;

import academy.devdojo.maratonajava.javacore.Class35AbstractClasses.Domain.Developer;
import academy.devdojo.maratonajava.javacore.Class35AbstractClasses.Domain.Employee;
import academy.devdojo.maratonajava.javacore.Class35AbstractClasses.Domain.Manager;

public class EmployeeTest00 {
    public static void main(String[] args) {
 
        Manager manager = new Manager("Project Manager", 4000);
        System.out.println(manager);
        Developer developer = new Developer("developer java", 2000);
        System.out.println(developer);
        developer.calculateBonus();
        manager.calculateBonus();
        developer.showTheDate();
        manager.showTheDate();
    }
}
