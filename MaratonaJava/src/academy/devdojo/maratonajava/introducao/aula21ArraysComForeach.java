package academy.devdojo.maratonajava.introducao;

public class aula21ArraysComForeach {
    public static void main(String[] args) {
        int [] numeros = new int[3];
        int [] numeros2 = {0,1,2,3,4};
        int [] numeros3 = new int[]{4,3,2,1,0};

        System.out.println("\n---------for (int i = 0; i < numeros.length; i++)---------\n");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("\n--------for (int i = 0; i < numeros2.length; i++)----------\n");
        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);            
        }
        System.out.println("\n--------for (int i = 0; i < numeros3.length; i++)----------\n");
        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }
        System.out.println("\n---------------for (int num : numeros3)--------------------\n");
        for (int num : numeros3){
            System.out.println(num);
        }
        System.out.println("o porcesso acima esta realizadno como se fosse isso: \n");
        System.out.println("int num = numeros3 [0];\nSystem.out.println(num)\nint num = numeros3 [1];\nSystem.out.println(num);\nint num = numeros3 [1];\nSystem.out.println(num);");
        
    }
}
