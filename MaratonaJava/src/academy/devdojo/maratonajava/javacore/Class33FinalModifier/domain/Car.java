package academy.devdojo.maratonajava.javacore.Class33FinalModifier.domain;

public final class Car { // final e utilizado dentro da classe ou metodo para bloquear o acesso o modificação de outro objeto  
    private String name;
    public static final double LIMIT_SPEED = 250; //  declarando variavel constante nao podera mais ser atribuido valor. 
    public final Buyer BUYER = new Buyer();
    // outras forma de declaração 
    // static{
    //     LIMIT_SPEED = 250;
    // }
    // public Car(){
    //     LIMIT_SPEED = 250;
    // }
        public final void show(){ // dessa forma ele nao pode ser sobrescrito ou modificado por outro objeto
            System.out.println(this.name);
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

}
