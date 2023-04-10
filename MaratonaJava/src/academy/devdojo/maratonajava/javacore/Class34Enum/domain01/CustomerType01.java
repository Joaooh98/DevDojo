package academy.devdojo.maratonajava.javacore.Class34Enum.domain01;

public enum CustomerType01 { // todos os atributos que nao criado nessa classe e constante
    PESSOA_JURIDICA(1,  "Pessoa fisica"),
    PESSOA_FISICA (2, "Pessoa juridica");

    private int VALOR;
    private String NomeRelatorio;

    

  
    private CustomerType01(int vALOR, String nomeRelatorio) {
        VALOR = vALOR;
        NomeRelatorio = nomeRelatorio;
    }

    public static CustomerType01 TypeOfPayment01PorNomeRelatorio(String nomeRelatorio) {
        for (CustomerType01 customerType01 : values()){
            if(customerType01.getNomeRelatorio().equals(nomeRelatorio)){
                return customerType01;
            }
        }
        return null;
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
