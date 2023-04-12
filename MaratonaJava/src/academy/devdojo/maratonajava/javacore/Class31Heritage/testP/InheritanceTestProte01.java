package academy.devdojo.maratonajava.javacore.Class31Heritage.testP;

import academy.devdojo.maratonajava.javacore.Class31Heritage.domainPro.PersonP;

public class InheritanceTestProte01 extends PersonP{   
    public InheritanceTestProte01(String name, String cpf) {
        super(name, cpf);
    }

    public void show() {
        this.name = "joao";
    }
    
}
