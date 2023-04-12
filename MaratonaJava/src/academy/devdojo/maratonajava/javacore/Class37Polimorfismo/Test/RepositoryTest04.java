package academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Repository.Repository;
import academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Service.ArchiveRrepository;
import academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Service.DatabaseRepository;
import academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Service.MemoryRepository;

public class RepositoryTest04 {
    public static void main(String[] args) {
        Repository repositoryD = new DatabaseRepository();
        repositoryD.salvar();

        List<String> nomes = new ArrayList<>();
        nomes.add("Joao");
        nomes.add("Mayety");
        nomes.add("Lucas");

        System.out.println(nomes);

        Repository repositoryA = new ArchiveRrepository();
        repositoryA.salvar();

        Repository repositoryM = new MemoryRepository();
        repositoryM.salvar();
    }
}
