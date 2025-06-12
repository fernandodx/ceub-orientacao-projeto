
    import java.util.Scanner;

public class Calculadoraaa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Simples em Java");
        System.out.println("--------------------------");

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação:");
        System.out.println("1. Adição");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.print("Digite o número da operação: ");
        int operacao = scanner.nextInt();

        double resultado = 0;

        switch (operacao) {
            case 1:
                resultado = adicao(num1, num2);
                break;
            case 2:
                resultado = subtracao(num1, num2);
                break;
            case 3:
                resultado = multiplicacao(num1, num2);
                break;
            case 4:
                resultado = divisao(num1, num2);
                break;
            default:
                System.out.println("Operação inválida!");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }

    public static double adicao(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public static double divisao(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Erro: Divisão por zero!");
            return 0;
        }
        return num1 / num2;
    }
}



