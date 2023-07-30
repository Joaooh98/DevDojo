package TestJobs.problems.Banco;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import TestJobs.problems.Object.Carteira;
import TestJobs.problems.Object.Parcela;

@SuppressWarnings("all")
public class CarteiraRepositorio {
    private static List<Carteira> carteiraRepositorio = List.of(
            new Carteira(1, "CAR"),
            new Carteira(2, "BOL"));

       public List<Carteira> findAll(){
        return carteiraRepositorio;
    }
}
