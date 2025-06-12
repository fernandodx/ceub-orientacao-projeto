import java.util.Scanner;

public class Palavrapalindromo {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a palavra que você quer verificar que é um Palíndromo: ");

    String palavra = scanner.nextLine();

    String invertida = new StringBuilder(palavra).reverse().toString();

    if (palavra.equalsIgnoreCase(invertida)) {
        System.out.println("é um palindromo");
    } else {
        System.out.println("não é um palíndromo");
    }

    scanner.close();
}

}
