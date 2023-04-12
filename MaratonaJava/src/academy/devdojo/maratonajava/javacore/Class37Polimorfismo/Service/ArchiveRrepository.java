package academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Service;

import academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Repository.Repository;

public class ArchiveRrepository implements Repository {

    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
