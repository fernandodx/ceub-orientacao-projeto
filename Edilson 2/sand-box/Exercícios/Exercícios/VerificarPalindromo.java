import java.util.Scanner;

public class VerificarPalindromo {

    //metodo pra verificar se a palavra é um palindromo
    public static Boolean verificarPalindromo(String palavra) {
        palavra = palavra.toLowerCase(); //método para verificar a palavra sendo maiúscula ou minúscula

        //variável para fazer comparações.
        int inicio = 0; // pra começar do primeiro caractere
        int fim = palavra.length() - 1; //comeca na última letra da palavra

        //Para comparar caracteres
        while (inicio < fim) {
            if (palavra.charAt(inicio) != palavra.charAt(fim)) {  //usar o chartAt() para obter caracteres do início e fim. se não for igual ele retorna false
                return false;
            }
            inicio++;
            fim--;
        } 

        return true; // se retornar sem encontrar diferenças, retornar veradadeiro
    } 

    //Pede para o usuário a palavra que ele quer verificar se é palindromo
    public static String lerPalavra() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a palavra para verificar se é um PALINDROMO ");
        return scanner.nextLine();
    }

    // Para impirmir para o usuário se a infomação é verdadeira o falsa
    public static void main(String[] args) {
        String palavra = lerPalavra();

        if (verificarPalindromo(palavra)) {
            System.out.println(palavra + " é um Palindromo.");
        } else {
            System.out.println(palavra + " Não é um Palindromo");
        } 
    }

    }

