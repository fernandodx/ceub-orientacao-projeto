import java.util.Scanner;

public class Palindromo {
    public Boolean verificaPalindromo(String palavra) {
        String invertida = new StringBuilder(palavra).reverse().toString();
        return palavra.equalsIgnoreCase(invertida);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Palindromo palindromo = new Palindromo();

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        boolean resultado = palindromo.verificaPalindromo(palavra);

        if (resultado) {
            System.out.println("É um palindromo!");
        } else {
            System.out.println("Não é um palindromo!");
        }
    }
    
}
