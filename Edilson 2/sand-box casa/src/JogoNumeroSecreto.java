import java.util.Random;
import java.util.Scanner;

public class JogoNumeroSecreto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa;
        int tentativasRestantes = 5;

        System.out.println("Seja bem vindo ao jogo do número secreto");

        System.out.println("Tente adivinhar o número entre 1 e 100");

        System.out.println("Vocë tem  "  + tentativasRestantes + "  tentativas");

        while (tentativasRestantes > 0) {
            System.out.println("Digite seu palpite ");
            tentativa = scanner.nextInt();
            tentativasRestantes--;

            if (tentativa == numeroSecreto) {
                System.out.println("parabéns você acertou o número secreto.");
                break; 
            } else if (tentativa < numeroSecreto) {
                System.out.println("O Número secreto é maior!");
            } else  if (tentativa > numeroSecreto) {
                System.out.println("O Número secreto é menor!");
            }

            if (tentativasRestantes > 0) {
                System.out.println("Tentatvias restantes  " + tentativasRestantes);
                
            } else {
                System.out.println("Suas tentativas acabaram! O número secreto era  " + numeroSecreto);
            }
        }

       scanner.close();


    }

}
