import java.util.List;

public class EstruturaRepeticao {
    public static void main(String[] args) {

        System.out.println("\n Loop for, \n comum \n");

        for(int i=1; i<=5; i++) {
            System.out.println("Contador:"+i);
        }

        System.out.println("\n Loop While \n");

        int contador = 0;
        while (contador < 5) {
            contador++;
            System.out.println("Contador: "+contador);
        }

        System.out.println("\n Loop For \n com lista \n");

        List<String>  nomes = List.of("Fernando", "Miguel", "João", "Luiz", "Milena");
        for(String nome : nomes) {
            System.out.println(nome);
        }



    }
}