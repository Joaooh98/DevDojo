package academy.devdojo.maratonajava.javacore.DesignPatterns.Factory.domain;

import academy.devdojo.maratonajava.javacore.DesignPatterns.Factory.face.Currency;

public class Real implements Currency{

    @Override
    public String getSymbol() {
        return "R$";
    }
    
}
