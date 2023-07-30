package TestJobs.problems.Banco;

import java.util.List;

import TestJobs.problems.Object.ExtratoConta;

@SuppressWarnings("all")
public class ExtratoContaRepositorio {
        private static List<ExtratoConta> carteiraRepositorio = List.of(
                        new ExtratoConta(1, null, null),
                        new ExtratoConta(2, null, null),
                        new ExtratoConta(3, null, null),
                        new ExtratoConta(4, null, null),
                        new ExtratoConta(5, null, null),
                        new ExtratoConta(6, null, null),
                        new ExtratoConta(7, null, null),
                        new ExtratoConta(8, null, null),
                        new ExtratoConta(9, null, null),
                        new ExtratoConta(10, null, null));

        public List<ExtratoConta> findAll() {
                return carteiraRepositorio;
        }
}
