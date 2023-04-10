package academy.devdojo.maratonajava.javacore.Class34Enum.domain;

public enum CustomerTtype { // todos os atributos que nao criado nessa classe e constante
    PESSOA_JURIDICA (1, "pessoa juridica"),
    PESSOA_FISICA (2, "pessoa fisica");   

    private final int VALOR;
    private String NomeRelatorio;

    CustomerTtype(int VALOR, String NomeRelatorio){
        this.VALOR = VALOR;
        this.NomeRelatorio = NomeRelatorio;
    }

    public int getVALOR() {
        return VALOR;
    }

    public String getNomeRelatorio() {
        return NomeRelatorio;
    }
    
    
}