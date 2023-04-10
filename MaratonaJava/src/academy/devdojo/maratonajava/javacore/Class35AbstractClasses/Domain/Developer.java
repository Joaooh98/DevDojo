package academy.devdojo.maratonajava.javacore.Class35AbstractClasses.Domain;

public class Developer extends Employee{

    public Developer(String name, double wage) {
        super(name, wage);
    }


    @Override
    public String toString() {
        return "Developer [name=" + name + ", wage=" + wage + "]";
    }

    @Override
    public void calculateBonus() {
        this.bonus = wage * 0.15;
        System.out.println("seu bonus e de: "+bonus);
    }  
    
}
