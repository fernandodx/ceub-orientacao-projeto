import java.util.ArrayList;  // Pra trabalhar com listas disnamicas
import java.util.Collection; // Pra ordenar a lista
import java.util.Collections; // Pra leitura de dados
import java.util.Scanner;

public class ProgramaListaNomes {
    public static void main(String[] args) {
        
        //Criação do Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);

        // Criar uma lista para armezanar os noms
        ArrayList<String> nomes = new ArrayList<>();

        //Solicita o numero de nomes que vao constar na lista
        System.out.println("Quantos nomes você deseja inserir: ");
        int quantidade = scanner.nextInt(); // le a quantidade de nomes

        //Limpa o buffet de entrada para evitar que a proxima leitura de string falhe
        scanner.nextLine();

        //Pra ler o numero de nomes que o usuario vai inserir
                for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o nome #" + (i +1) + ": ");
            String nome = scanner.nextLine(); // le o nome como uma string
            nomes.add(nome); // adiciona o nome a lista
        }
            Collections.sort(nomes); // pra ordenar os nomes em ordem alfabetica

            //Imprimi a lista de nomes por ordem
            System.out.println("\nNomes em ordem  alfabética:");
            for (String nome : nomes) {
                System.out.println(nome); //imprime cada nome da lista
            }

            scanner.close(); //fecha o scanner
        }
    }


