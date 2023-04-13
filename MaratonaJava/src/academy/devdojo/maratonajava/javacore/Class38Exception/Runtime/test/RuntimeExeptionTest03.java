package academy.devdojo.maratonajava.javacore.Class38Exception.Runtime.test;

public class RuntimeExeptionTest03 {
    public static void main(String[] args) {
        abreconexao();
    }
 
    private static String abreconexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");

            return "conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("fechando recurso liberado pelo SO");
        }
        return null;
    }
}
