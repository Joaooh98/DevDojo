package academy.devdojo.maratonajava.javacore.Class33FinalModifier.test;

import academy.devdojo.maratonajava.javacore.Class33FinalModifier.domain.Car;

public class Cartest00 {
    public static void main(String[] args) {
        Car car = new Car();
        
        System.out.println(Car.LIMIT_SPEED);
        System.out.println(car.BUYER);

        car.BUYER.setName("Sr. João");

        System.out.println(car.BUYER);
        // https://www.devmedia.com.br/trabalhando-com-singleton-java/23632
        
        car.show();
    
    }
}
