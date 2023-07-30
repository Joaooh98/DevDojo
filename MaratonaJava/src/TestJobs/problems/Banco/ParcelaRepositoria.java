package TestJobs.problems.Banco;

import java.util.List;

import TestJobs.problems.Object.Parcela;

public class ParcelaRepositoria {
    private static List<Parcela> parcelaRepositorio = List.of(
        new Parcela(1, null, null, null, null),
        new Parcela(2, null, null, null, null),
        new Parcela(3, null, null, null, null),
        new Parcela(4, null, null, null, null),
        new Parcela(5, null, null, null, null),
        new Parcela(6, null, null, null, null),
        new Parcela(7, null, null, null, null),
        new Parcela(8, null, null, null, null),
        new Parcela(9, null, null, null, null),
        new Parcela(10, null, null, null, null)
    );

    public List<Parcela> findAll(){
        return parcelaRepositorio;
    }
}
