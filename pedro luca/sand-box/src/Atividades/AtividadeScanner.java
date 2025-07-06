package Atividades;

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

        System.out.println("");
        System.out.println("");
        System.out.println("Atividade Palíndromo");

        System.out.println("Digite o primeiro número :");
        int Num1 = scanner.nextInt();
        System.out.println("Digite o segundo número :");
        int Num2 = scanner.nextInt();
        System.out.println("A soma é " + (Num1 + Num2));
        
        scanner.close();
    }
}
