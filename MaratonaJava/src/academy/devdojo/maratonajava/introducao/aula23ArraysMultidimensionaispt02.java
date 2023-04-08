package academy.devdojo.maratonajava.introducao;

public class aula23ArraysMultidimensionaispt02 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3 };

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = array; /// esta declado acima
        arrayInt[2] = new int[] { 1, 2, 3, 4, 5, 6 };

        System.out.println("\nArrayInt2");
        int[][] ArrayInt2 = { { 1, 2, 3, 4, 5, 6 }, { 4, 5, 6 }, { 9, 8, 7, 8 } };

        for (int[] arrayBase : ArrayInt2) {
            System.out.println("-------");
            for (int num : arrayBase) {
                System.out.println(num);

            }
        }
        System.out.println("\narrayInt");
        for (int[] arrayBase : arrayInt) {
            System.out.println("-------");
            for (int num : arrayBase) {
                System.out.println(num);

            }
        }

    }

}
