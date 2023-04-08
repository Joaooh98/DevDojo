package academy.devdojo.maratonajava.javacore.Heritage.domain;

public class Employee extends PersonF{
    private String  office;
    private double wage;


    public void show() {
        super.show(); // chama o metodo do objeto PersonF
        System.out.println("Profissão: "+this.getOffice());
        System.out.println("Salario: "+this.getWage());
    }

    /**
     * @return String return the office
     */
    public String getOffice() {
        return office;
    }

    /**
     * @param office the office to set
     */
    public void setOffice(String office) {
        this.office = office;
    }

    /**
     * @return double return the wage
     */
    public double getWage() {
        return wage;
    }

    /**
     * @param wage the wage to set
     */
    public void setWage(double wage) {
        this.wage = wage;
    }

}
