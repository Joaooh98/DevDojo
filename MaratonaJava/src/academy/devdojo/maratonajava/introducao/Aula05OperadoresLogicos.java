package academy.devdojo.maratonajava.introducao;

public class Aula05OperadoresLogicos {
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        // ! SE A CONDIÇÃO FOR VERDADEIRA ESSE OPERADOR INVERTE 
        // ^ PARA RETORNAR VERDADEIRO AS CONDIÇOES DEVE POSSUIR RESULTADOS DIFERENTE
        int Conta = 100000;
        int IdadeP = 25; 
        int NecessarioParaIrProCanada = 50000;
        int IdadeNecessaria = 26;
        int ExperienciaNecessaria = 5;
        int TempodeTrabalho = 1;


// && (AND) SO RETORNA VERADADEIRO SE TODAS CONDIÇOES FOR VERDADEIRO

        boolean vai = IdadeP > IdadeNecessaria && Conta >= NecessarioParaIrProCanada;
        boolean NaoVai = IdadeP < IdadeNecessaria && Conta >= NecessarioParaIrProCanada;
            System.out.println("----------------AND---e-------------");
            System.out.println("Entrada permitida:"+vai);
            System.out.println("encaixa nos padroes:"+NaoVai);

// || (OR) SE UMA CONDIÇÃO FOR VERDADEIRA RETORNA VERDADEIRO 
                                
        boolean voceVaiConseguirOr = Conta > NecessarioParaIrProCanada || IdadeP > IdadeNecessaria;
        boolean voceNaoConseguirOr = TempodeTrabalho > ExperienciaNecessaria || IdadeP < IdadeNecessaria;
            System.out.println("----------------OR--ou--------------");
            System.out.println("Entrada permitida:"+voceVaiConseguirOr);
            System.out.println("encaixa nos padroes:"+voceNaoConseguirOr);

// ^ ESSE OPERADOR RETORNA VERDADEIRO CASO OS RESULTADOS SEJA DESTINTOS
            
        boolean SConseguir = Conta > NecessarioParaIrProCanada ^ IdadeP > IdadeNecessaria;
        boolean NConseguir = TempodeTrabalho > ExperienciaNecessaria ^ IdadeP < IdadeNecessaria;
            System.out.println("----------------^---XOU------------");
            System.out.println("Entrada permitida:"+SConseguir);
            System.out.println("encaixa nos padroes:"+NConseguir);

// ! OPERADOR DE NEGAÇÃO INVERTE O VALOR RECEBIDO           
            
        boolean voceVai = Conta > NecessarioParaIrProCanada;
        boolean voceNao = TempodeTrabalho > ExperienciaNecessaria;
            System.out.println("----------------INVERTE !-----negação------");
            System.out.println("Entrada permitida:"+!voceVai);
            System.out.println("encaixa nos padroes:"+!voceNao);    
    }
}
