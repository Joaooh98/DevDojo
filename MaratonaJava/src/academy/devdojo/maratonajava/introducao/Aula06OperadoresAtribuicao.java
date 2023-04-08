package academy.devdojo.maratonajava.introducao;

public class Aula06OperadoresAtribuicao {
    public static void main(String[] args) {
        System.out.println("= atribui\n");
        double pilotaratribui = 1800;
        pilotaratribui = 2000; 
        System.out.println(pilotaratribui);
        
        System.out.println("\n+= somar e atribui\n");
        double pilotarsoma = 1800;
        pilotarsoma += 2000;
        System.out.println(pilotarsoma);

        System.out.println("\n-= subtrair e atribui\n");
        double pilotarsub = 1800;
        pilotarsub -= 2000;
        System.out.println(pilotarsub);

        System.out.println("\n*= multiplicar e atribuir\n");
        double pilotarmult = 1800;
        pilotarmult *= 2000;
        System.out.println(pilotarmult);
        
        System.out.println("\n/= dividir e atribuir\n");
        double pilotardiv = 1800;
        pilotardiv /= 2000;
        System.out.println(pilotardiv);
        
        System.out.println("\n%= Resto e atribuir\n");
        double pilotarres = 1800;
        pilotarres %= 2000;
        System.out.println(pilotarres);
    }
}
