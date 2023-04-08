package academy.devdojo.maratonajava.javacore.Class29StaticModifiers.test;

import academy.devdojo.maratonajava.javacore.Class29StaticModifiers.domain.Car;

public class CarTest01 {
    public static void main(String[] args) {
        Car car1 = new Car("BMW",280);
        Car car2 = new Car("Mercedes",300);
        Car car3 = new Car("Audi",320);

        Car.limitSpeed = 200; /// devido ser um atributo static pode ser alterado o parametro do atributo direto do metodo main 

        car1.showTheData();
        car2.showTheData();
        car3.showTheData();

    }
}
