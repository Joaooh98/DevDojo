package TestJobs.Loops;

import java.util.ArrayList;
import java.util.List;

class Objeto {
    List<Integer> lista;

    public Objeto() {
        lista = new ArrayList<>();
    }

    public List<Integer> getLista() {
        return lista;
    }
}

public class Array {
    public static void main(String[] args) {
        Objeto objeto = new Objeto();
        objeto.getLista().add(10);
        objeto.getLista().add(20);
        objeto.getLista().add(30);

        List<Integer> listaDoObjeto = objeto.getLista();
        int valor = listaDoObjeto.get(1);

        System.out.println("Valor: " + valor);
    }
}
