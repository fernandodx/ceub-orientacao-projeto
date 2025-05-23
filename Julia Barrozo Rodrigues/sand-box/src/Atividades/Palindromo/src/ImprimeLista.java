import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections; 

public class ImprimeLista {
// 2. Desenvolva um programa que leia uma lista de nomes e os imprima em ordem alfabética. 
        public static void main(String[] args) {
        ArrayList<String> ListaNomes = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Digite o nome: ");
            String nome = scanner.nextLine().trim(); // trim ignora espaço em branco
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            ListaNomes.add(nome);;
        }
        
        Collections.sort(ListaNomes); // metodo sort ordena

        for (String nome : ListaNomes) { // para cada nome em ListaNomes
            System.out.println(nome);
            
        }
        scanner.close();
    }


}
