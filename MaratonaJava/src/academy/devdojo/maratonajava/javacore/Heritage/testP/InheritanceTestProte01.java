package academy.devdojo.maratonajava.javacore.Heritage.testP;

import academy.devdojo.maratonajava.javacore.Heritage.domainPro.PersonP;

public class InheritanceTestProte01 extends PersonP{   
    public InheritanceTestProte01(String name, String cpf) {
        super(name, cpf);
        //TODO Auto-generated constructor stub
    }

    public void show() {
        this.name = "joao";
    }
    
}
