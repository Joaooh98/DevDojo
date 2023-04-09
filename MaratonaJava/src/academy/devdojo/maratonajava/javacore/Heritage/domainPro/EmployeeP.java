package academy.devdojo.maratonajava.javacore.Heritage.domainPro;

public class EmployeeP extends PersonP{
    private String  office;
    private double wage;

    static{
        System.out.println("dentro do bloco estatico estatico EmployeeP00");
    }
    {
        System.out.println("dentro do bloco  estatico EmployeeP01");
    }
    {
        System.out.println("dentro do bloco  estatico EmployeeP02");
    }
    
    public EmployeeP (String name){
        super(name);
        System.out.println("dentro do construtor EmploeeP");
    }
    
    public EmployeeP(String name, String office, double wage) {
        super(name);
        this.office = office;
        this.wage = wage;
    }

    public EmployeeP(String name, String cpf, String office, double wage) {
        super(name, cpf);
        this.office = office;
        this.wage = wage;
    }
        public void show() {
        super.show(); // chama o metodo do objeto PersonP 
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
