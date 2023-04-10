package academy.devdojo.maratonajava.javacore.Class34Enum.domain01;

public enum TypeOfPayment01 {
    DEBITO{
        @Override
        public double calculateDiscount(double valor) {
                return valor * 0.01;
        }
        
    }, CREDITO{

        @Override
        public double calculateDiscount(double valor) {
                return valor * 0.05;
        }
        
    };
    
    public abstract double calculateDiscount(double valor) ;

    public char[] getNomeRelatorio() {
        return null;
    }

    public static TypeOfPayment01 TypeOfPayment01PorNomeRelatorio(String string) {
        return null;
    }
        
} 
 