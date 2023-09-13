package academy.devdojo.maratonajava.javacore.DesignPatterns.Factory.UseCase;

import academy.devdojo.maratonajava.javacore.DesignPatterns.Factory.face.Currency;

public class Dollar implements Currency{

    @Override
    public String getSymbol() {
        return "$";
    }
    
}
