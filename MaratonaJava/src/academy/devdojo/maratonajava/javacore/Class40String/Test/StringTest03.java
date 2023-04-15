package academy.devdojo.maratonajava.javacore.Class40String.Test;

public class StringTest03 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(1_000);
        long fim = System.currentTimeMillis();
        System.out.println(" tempo gasto para concatString " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(1_000);
        fim = System.currentTimeMillis();
        System.out.println(" tempo gasto para concatStringBuilder " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(1_000);
        fim = System.currentTimeMillis();
        System.out.println(" tempo gasto para concatStringBuffer " + (fim - inicio) + "ms");
    }

    private static void concatString(int tamanho) {
        String text = "\nJoao";
        for (int i = 0; i < tamanho; i++) {
            text += i;
            System.out.println(text);
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        sb.append("\njoao");
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
            System.out.println(sb);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        sb.append("\njoao");
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
            System.out.println(sb);
        }
    }
}
