package TestJobs.problems.Banco;

import java.util.List;

import TestJobs.problems.Object.Titulo;

public class TituloRepositorio {
    private static List<Titulo> tituloRepositorio = List.of(
            new Titulo(null, null, null, null, null),
            new Titulo(null, null, null, null, null),
            new Titulo(null, null, null, null, null),
            new Titulo(null, null, null, null, null),
            new Titulo(null, null, null, null, null),
            new Titulo(null, null, null, null, null),
            new Titulo(null, null, null, null, null),
            new Titulo(null, null, null, null, null),
            new Titulo(null, null, null, null, null),
            new Titulo(null, null, null, null, null),
            new Titulo(null, null, null, null, null)
            );

            public List<Titulo> findAll() {
                return tituloRepositorio;
            }
}
