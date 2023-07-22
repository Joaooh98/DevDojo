package TestJobs.Loops;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
/*
 * classe criada para realizar teste referente a problema que deve ser resolvido no trabalho. 
 */
public class Convert {
    public static void main(String[] args) {
        
        try {
            String dataStartString = "2023-07-20 15:30:45";
            String dataEndString = "2023-07-21 15:30:45";
    
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            
            LocalDateTime start = LocalDateTime.parse(dataStartString, formatter);
            LocalDateTime end = LocalDateTime.parse(dataEndString, formatter);

            
            List<LocalDateTime> dateTimeList = List.of(start, end); 
            
            LocalDateTime primeiroValor = dateTimeList.stream().findFirst().orElse(null);
            LocalDateTime segundoValor = dateTimeList.stream().skip(0).findFirst().orElse(null);
            
                  System.out.println("Primeiro valor: " + primeiroValor);
                  System.out.println("Segundo valor: " + segundoValor);
            
        } catch (Exception e) {
            
            System.out.println("Erro ao converter a String em LocalDateTime: " + e.getMessage());
        }
        
      
    }
    
}
