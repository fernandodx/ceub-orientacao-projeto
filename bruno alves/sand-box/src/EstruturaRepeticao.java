import java.util.List;

public class EstruturaRepeticao {

    public static void main(String[] args) {
        
        //for
        for (int i = 1; i <= 5; i++) {
            System.out.println("vlor: " + i);
        }

        //while
        int contador = 0;
        while (contador < 5) {
            System.out.println("contador: " + contador);
            contador++;
        }

        //lista
        List<String> nomes = List.of("bruno", "edilson");
        for(String nome : nomes) {
            System.out.println(nome);
        }
    }
}
