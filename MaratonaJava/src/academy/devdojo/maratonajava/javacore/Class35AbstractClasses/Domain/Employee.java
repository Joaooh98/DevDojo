package academy.devdojo.maratonajava.javacore.Class35AbstractClasses.Domain;

public abstract class Employee extends Person{
    protected String name;
    protected double wage;
    protected double bonus;
        
    public Employee(String name, double wage) {
        this.name = name;
        this.wage = wage;
    }
    
    public Employee(String name, double wage, double bonus) {
        this.name = name;
        this.wage = wage;
        this.bonus = bonus;
    }
    
    public abstract void calculateBonus();

    @Override
    public void showTheDate() {
        System.out.println("----------Employee----------");
        System.out.println(name);
        System.out.println(wage);
        System.out.println(bonus);
    }
}
