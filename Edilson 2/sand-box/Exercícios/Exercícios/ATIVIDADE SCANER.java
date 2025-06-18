package Atividades.Scanner.src;
import java.util.Scanner;

public class AtividadeScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("[------------------]");

        System.out.println("Digite o segundo número");
        int num2 = scanner.nextInt();

        System.out.println("[-----Resultado-----]");
        System.out.println(num1+num2);

        scanner.close();
    }
}