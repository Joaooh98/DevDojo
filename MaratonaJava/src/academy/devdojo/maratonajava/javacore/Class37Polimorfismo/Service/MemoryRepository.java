package academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Service;

import academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Repository.Repository;

public class MemoryRepository implements Repository{

    @Override
    public void salvar() {
        System.out.println("salvando em memoria ");
    }
    
}
