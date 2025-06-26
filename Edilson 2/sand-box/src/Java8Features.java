import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Features {

    public static void main(String[] args) {
        
        List<Integer> idades = Arrays.asList(1, 2, 3, 4, 5);
        List<String> novaListaString = List.of();

        LocalDate hoje = LocalDate.now();
        System.out.println("Data de hoje: " + hoje.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        }

    
       
    }

