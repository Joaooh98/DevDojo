package academy.devdojo.maratonajava.javacore.Class29StaticModifiers.domain;

public class Carcopy {
    private String name;
    private double maximumSpeed;
    private static double limitSpeed = 250;

    public Carcopy(String name, double maximumSpeed) {
        this.name = name;
        this.maximumSpeed = maximumSpeed;
       
    }
    public void showTheData() {
        System.out.println("---------");
        System.out.println("Name: "+this.name);
        System.out.println("Maximum Speed: "+this.maximumSpeed);
        System.out.println("Limit speed: "+Carcopy.limitSpeed);
    }

    public static void setlimitSpeed(double limitSpeed) {
        Carcopy.limitSpeed = limitSpeed;
    }

    public static void  getlimitSpeed(double limitSpeed){
        Carcopy.limitSpeed = limitSpeed;
    }
    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return double return the maximumSpeed
     */
    public double getMaximumSpeed() {
        return maximumSpeed;
    }

    /**
     * @param maximumSpeed the maximumSpeed to set
     */
    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }
    
}
