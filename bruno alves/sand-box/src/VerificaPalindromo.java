import java.util.Scanner;

public class VerificaPalindromo {
    
    //crie um programa que verifica se uma palavra é palindromo

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

            System.out.print("Digite uma palavra: "); //solicita ao usuário que insira uma palavra
            String palavra = scanner.nextLine();
        
         if (verificapalindromo(palavra)) { //verifica se a palavra é um palíndromo e imprime a mensagem correspondente
            System.out.println("É palíndromo");}
         else {
            System.out.println("Não é palíndromo");}
        
         scanner.close(); //fecha o scanner
    } 
   
    private static boolean verificapalindromo(String palavra){
        
        //método que inverte

        String invertida = new StringBuilder(palavra).reverse().toString(); //inverte a palavra e transforma em string
        return palavra.equalsIgnoreCase(invertida); //compara com a palvra armazenada e retorna true ou false
    }
}

    
    
    
    
    
    
    
    
    
    

