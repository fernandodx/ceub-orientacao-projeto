import java.util.Scanner;

public class ImprimeNumeros {
    // 1. Crie um programa que receba dois números inteiros e imprima a soma deles.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite outro número: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;
        System.out.println("Soma dos dois números: " + soma);
    }


}
