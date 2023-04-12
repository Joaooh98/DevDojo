package academy.devdojo.maratonajava.javacore.Class37Polimorfismo.Domain;

public class Tomate extends Product {
    public static final double IMPOSTO_POR_CENTO = 0.21;
    private String datadevalidade;

    public Tomate(String name, double valor) {
        super(name, valor);
    }
    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do tomate");
        return this.valor * IMPOSTO_POR_CENTO;
    }
    
    /**
     * @return String return the datadevalidade
     */
    public String getDatadevalidade() {
        return datadevalidade;
    }

    /**
     * @param datadevalidade the datadevalidade to set
     */
    public void setDatadevalidade(String datadevalidade) {
        this.datadevalidade = datadevalidade;
    }

}
