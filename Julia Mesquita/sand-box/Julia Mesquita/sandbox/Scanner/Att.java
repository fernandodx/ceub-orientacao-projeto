import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Att {

    public static void main(String[] args) {
        // somaDoisNumeros();
        // reordenarLista();
        // System.out.println(verificaPalindromo("civic"));
        checkPalindromo();
    }

    private static void somaDoisNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número :");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número :");
        int num2 = scanner.nextInt();
        System.out.println("A soma é " + (num1 + num2));
    }

    private static void reordenarLista() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Digite o nomes: [Digite 'parar' para encerrar]");

        while (true) {
            String nome = scanner.nextLine();
            if (nome.trim().equalsIgnoreCase("parar")) {
                break;
            }
            nomes.add(nome);
        }


        Collections.sort(nomes, (nome1, nome2) -> nome2.compareTo(nome1));

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

    private static boolean verificaPalindromo(String palavra) {
        String invertida = new StringBuilder(palavra).reverse().toString();
        return palavra.equalsIgnoreCase(invertida);
    }

    private static void checkPalindromo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: "); 
        String palavra = scanner.nextLine();

        if (verificaPalindromo(palavra)) { 
            System.out.println("É palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        }

        scanner.close(); 
    }
}