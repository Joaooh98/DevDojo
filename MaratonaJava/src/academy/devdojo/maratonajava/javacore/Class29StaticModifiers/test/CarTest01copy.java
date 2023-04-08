package academy.devdojo.maratonajava.javacore.Class29StaticModifiers.test;

import academy.devdojo.maratonajava.javacore.Class29StaticModifiers.domain.Carcopy;

public class CarTest01copy {
    public static void main(String[] args) {

        Carcopy.setlimitSpeed(200);

        Carcopy car1 = new Carcopy("BMW",280);
        Carcopy car2 = new Carcopy("Mercedes",300);
        Carcopy car3 = new Carcopy("Audi",320);

        car1.showTheData();
        car2.showTheData();
        car3.showTheData();

    }
}
