

public class GerenciadorDeErros {

    public static void main(String[] parametros) {

        System.out.println("Iniciando verificação de operação matemática...");

        try {
            int calculo = 10 / 0;
            System.out.println("Resultado: " + calculo);

        } catch (ArithmeticException excecaoAritmetica) {
            System.out.println("Erro: Divisão por zero detectada. Operação inválida!");
        }

        
    }

}
