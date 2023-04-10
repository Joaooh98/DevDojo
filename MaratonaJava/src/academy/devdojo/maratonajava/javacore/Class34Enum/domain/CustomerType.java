package academy.devdojo.maratonajava.javacore.Class34Enum.domain;

public enum CustomerType { // todos os atributos que nao criado nessa classe e constante
    PESSOA_JURIDICA(1,  "Pessoa fisica"),
    PESSOA_FISICA (2, "Pessoa juridica");

    private int VALOR;
    private String NomeRelatorio;
    
    private CustomerType(int vALOR, String nomeRelatorio) {
        VALOR = vALOR;
        NomeRelatorio = nomeRelatorio;
    }
    /**
     * @return int return the VALOR
     */
    public int getVALOR() {
        return VALOR;
    }
    /**
     * @return String return the NomeRelatorio
     */
    public String getNomeRelatorio() {
        return NomeRelatorio;
    }

}
