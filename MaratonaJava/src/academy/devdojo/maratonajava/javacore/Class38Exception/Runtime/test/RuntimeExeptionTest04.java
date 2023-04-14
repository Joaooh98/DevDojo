package academy.devdojo.maratonajava.javacore.Class38Exception.Runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExeptionTest04 {
    
    public static void main(String[] args) {
        try {
            // throw new ArrayIndexOutOfBoundsException();
            // throw new IndexOutOfBoundsException();
            // throw new ArithmeticException();
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("dentro do ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e){
            System.out.println("dentro do IndexOutOfBoundsException");
        } catch (IllegalArgumentException e){
            System.out.println("dentro do IllegalArgumentException");
        } catch (ArithmeticException e){
            System.out.println("dentro do ArithmeticException");
        } catch (RuntimeException e){ // se RuntimeException for o primeiro catch todas a outras Exception nao sao validas visto que ele e o mais generico
            System.out.println("dentro do RuntimeException");
        }

        try {
            talvezlanceException();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        
    } 

    private static void talvezlanceException() throws SQLException, FileNotFoundException{

    }
}