import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Features {
    public static void main(String[] args) {

        // Não sei oq tá de errado
        List<Integer> idades = Arrays.asList(1,2,3);
        List<String> novaListaString = Arrays.of();

        // Nem aqui
        for(Integer id : idades){
            novaListaString.add(id.toString("Idade: " + id));
        }

        List<String> idadesString = idades.stream()
        .map(idade -> idade.toString())
        .collect(Collectors.toList());

        LocalDate hoje = LocalDate.now();
        System.out.println("Data de hoje " + hoje.format(
            DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

}
