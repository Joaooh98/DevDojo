package academy.devdojo.maratonajava.javacore.Class34Enum.domain;

public enum CustomerTtype { // todos os atributos que nao criado nessa classe e constante
    PESSOA_JURIDICA(1,  "Pessoa fisica"),
    PESSOA_FISICA (2, "Pessoa juridica");

    private int VALOR;
    private String NomeRelatorio;

    

    private CustomerTtype(int vALOR, String nomeRelatorio) {
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
     * @param VALOR the VALOR to set
     */
    public void setVALOR(int VALOR) {
        this.VALOR = VALOR;
    }

    /**
     * @return String return the NomeRelatorio
     */
    public String getNomeRelatorio() {
        return NomeRelatorio;
    }

    /**
     * @param NomeRelatorio the NomeRelatorio to set
     */
    public void setNomeRelatorio(String NomeRelatorio) {
        this.NomeRelatorio = NomeRelatorio;
    }

}
