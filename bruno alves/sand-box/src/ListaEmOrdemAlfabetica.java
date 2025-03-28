import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ListaEmOrdemAlfabetica {
    public static void main(String[] args) {

        //crie um programa que solicite nomes e os imprima em ordem alfabética

        Scanner scanner = new Scanner(System.in); //'scanner' conversa com o usuário

        ArrayList<String> nomes = new ArrayList<>(); //cria uma lista

        System.out.println("Digite os nomes: [Digite 'parar' para encerrar]"); //solicita os nomes

        while (true) { //mantém o comando rodando até que o usuário pare
            String nome = scanner.nextLine(); //guarda o nome na variável "nome"

            if(nome.trim().equalsIgnoreCase("parar")){
                break; //para o loop caso o usuário digite "parar"
            }
            nomes.add(nome); //guarda o nome digitado na lista
        }

        Collections.sort(nomes, (nome1, nome2) -> nome1.compareTo(nome2)); //ordena a lista em ordem alfabética

        for(String nome: nomes){
            System.out.println(nome); //imprime a lista ordenada
        }
        scanner.close();
    }
}
