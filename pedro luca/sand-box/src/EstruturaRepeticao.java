import java.util.List;

public class CiclosDeExecucao {

    public static void main(String[] argumentos) {

        System.out.println("\n>>> Estrutura FOR tradicional <<<\n");

        for (int indice = 1; indice <= 5; indice++) {
            System.out.println("Iteração número: " + indice);
        }

        System.out.println("\n>>> Estrutura WHILE <<<\n");

        int contadorWhile = 0;
        while (contadorWhile < 5) {
            contadorWhile++;
            System.out.println("Valor atual: " + contadorWhile);
        }

        System.out.println("\n>>> FOR com coleção (lista) <<<\n");

        List<String> listaNomes = List.of("Ana", "Bruno", "Carlos", "Diana", "Eduarda");
        for (String pessoa : listaNomes) {
            System.out.println("Nome na lista: " + pessoa);
        }

    }
}