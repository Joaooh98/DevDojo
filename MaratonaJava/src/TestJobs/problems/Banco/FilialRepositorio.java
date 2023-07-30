package TestJobs.problems.Banco;

import java.util.List;

import TestJobs.problems.Object.Filial;

@SuppressWarnings("all")
public class FilialRepositorio {
    private static List<Filial> filialRepositorio = List.of(
            new Filial(1, null),
            new Filial(2, null),
            new Filial(3, null),
            new Filial(4, null),
            new Filial(5, null),
            new Filial(6, null),
            new Filial(7, null),
            new Filial(8, null),
            new Filial(9, null),
            new Filial(10, null));

    public List<Filial> findAll() {
        return filialRepositorio;
    }
}
