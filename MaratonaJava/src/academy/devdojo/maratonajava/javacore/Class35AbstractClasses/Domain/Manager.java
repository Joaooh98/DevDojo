package academy.devdojo.maratonajava.javacore.Class35AbstractClasses.Domain;

public class Manager extends Employee{

    public Manager(String name, double wage) {
        super(name, wage);
    }

    @Override
    public String toString() {
        return "Manager [name=" + name + ", wage=" + wage + "]";
    } 

    @Override
    public void calculateBonus() {
        this.bonus = wage * 0.00;
        System.out.println("seu bonus e de: "+bonus);
    } 
    
}
