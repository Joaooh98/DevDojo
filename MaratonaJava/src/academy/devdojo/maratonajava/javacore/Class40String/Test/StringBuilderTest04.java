package academy.devdojo.maratonajava.javacore.Class40String.Test;

public class StringBuilderTest04 {
    public static void main(String[] args) {
        
        String name = "Joao Carlos de Paiva";
        
        name = name.concat(" Desenvolvedor");
        System.out.println(name);

        // name = name.substring(0,3);
        // System.out.println(name);
        
        StringBuffer sbr = new StringBuffer(name); // pode ser passado o valor da String direto no objeto tbm 
        System.out.println(sbr+"\n");
        sbr.append(" concatena "+name+" concatena ").append(name);
        System.out.println(sbr);
        sbr.reverse();
        System.out.println(sbr); //mostra o nome ao contrario
        sbr.reverse();
        sbr.delete(0, 2); //  deleta o caracter informado
        System.out.println(sbr);
    }
}
