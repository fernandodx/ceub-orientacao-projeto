import java.util.List;

public class EstruturaRepeticao {
    public static void main(String[] args) {

        // i = i + 1 == i++
        // for
        for (int i = 1; i <= 5; i++) {
            // System.out.println("valor: " + i);
        }

        // Proxima Aula Lista e for melhor

        int contador = 0;
        while (contador < 5) {
            System.out.println("contador: " + contador);
            contador++;
        }

        List<String> nomes = List.of("fernando", "Fulano", "João");
        for(String n : nomes) {
            System.out.println(n);
        }
    }
}
