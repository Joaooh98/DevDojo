package academy.devdojo.maratonajava.javacore.Class34Enum.domain01;

public enum CustomerType01 { // todos os atributos que nao criado nessa classe e constante
    PESSOA_JURIDICA(1,  "Pessoa juridic"),
    PESSOA_FISICA (2, "Pessoa fisica");

    private int valor;
    private String nomeRelatorio;
   
    CustomerType01(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public static CustomerType01 tipoClientePorNomeRelatorio(String nomeRelatorio){
        for (CustomerType01 customerType01 : values()){
            if(customerType01.getNomeRelatorio().equals(nomeRelatorio)){
                return customerType01;
            }
        }
        return null;
    }
    /**
     * @return int return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @return String return the nomeRelatorio
     */
    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

}
