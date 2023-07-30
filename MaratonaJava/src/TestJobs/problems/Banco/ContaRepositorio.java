package TestJobs.problems.Banco;

import java.util.List;

import TestJobs.problems.Object.Contas;

@SuppressWarnings("all")
public class ContaRepositorio {
    private static List<Contas> contaRepositorio = List.of(
            new Contas(1, null, null),
            new Contas(2, null, null),
            new Contas(3, null, null),
            new Contas(4, null, null),
            new Contas(5, null, null),
            new Contas(6, null, null),
            new Contas(7, null, null),
            new Contas(8, null, null),
            new Contas(9, null, null));

    public List<Contas> findAll() {
        return contaRepositorio;
    }
}
