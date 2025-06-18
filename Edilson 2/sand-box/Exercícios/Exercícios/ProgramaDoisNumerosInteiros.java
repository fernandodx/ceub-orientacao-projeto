import java.util.Scanner;
//Classe Scanner para leitura de dados
public class ProgramaDoisNumerosInteiros {

public static void main(String[] args) {
    //Criação de uma Scanner para leitura de dados
    Scanner scanner = new Scanner(System.in);

    //Solicita o 1 número para o usuário
    System.out.println("Digite o primeiro número ");
    int numero1 = scanner.nextInt(); // le o número e armazena na várial numero1

    //Solicita o segundo número para o usuário
    System.out.println("Digite o segundo número ");
    int numero2 = scanner.nextInt(); //le o número e armazena na variál numero2

    //Soma os dois números
    int soma = numero1 + numero2;

    //Imprimi o resultado da soma
    System.out.println("A soma dos dois números é: " + soma);

    //fecha o scanner
    scanner.close();
}

}
