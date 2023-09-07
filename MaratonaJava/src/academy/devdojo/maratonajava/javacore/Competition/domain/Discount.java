package academy.devdojo.maratonajava.javacore.Competition.domain;

public class Discount {
    public enum Code{
        NONE(0),
        SAYAJIN(5),
        POWER_SAYAJIN(10);

        private final int percentege;

        Code(int percentege) {
            this.percentege = percentege;
        }

        public int getPercentege(){
            return percentege;
        }
    }
}
