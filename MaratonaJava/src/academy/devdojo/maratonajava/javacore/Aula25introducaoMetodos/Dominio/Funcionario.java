package academy.devdojo.maratonajava.javacore.Aula25introducaoMetodos.Dominio;

/*crie uma classe Funcionario com os seguite atributos 
nome 
idade
salario 
que contenha os seguites metodos 
imprimi dados 
calcular media salarial de cada funcionario
 */
public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imptrimirDados() {
        System.out.println("nome: " + this.nome);
        System.out.println(this.idade + " anos ");
        if (salarios == null) {
            return;
        }
        System.out.println("salario dos utimos 3 meses");
        for (double salario : salarios) {
            System.out.print(salario + ", ");
        }
        System.out.println("\n");
        mediaSalarial();

    }

    public void mediaSalarial() {
        if (salarios == null) {
            return;
        }
            for (double salario : salarios) { // aqui esta sendo somado todos os salarios
            media += salario;
        }
            media /= salarios.length; // esta sendo dividido o valor total dos salarios e dividindo pelo tamanho do
                                 
        System.out.println("media salarial: " + media);
    }
    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return int return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return double[] return the salarios
     */
    public double[] getSalarios() {
        return salarios;
    }

    /**
     * @param salarios the salarios to set
     */
    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    /**
     * @return double return the media
     */
    public double getMedia() {
        return media;
    }
}
