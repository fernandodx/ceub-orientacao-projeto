public class ControleDeFluxoSimples {

    public static void main(String[] argumentos) {

        int idadeUsuario = 18;

        /*
         * Estrutura Condicional: if/else
         *
         * if (condição) {
         *     bloco verdadeiro
         * } else {
         *     bloco falso
         * }
         */

        if (idadeUsuario >= 18) {
            System.out.println("Acesso liberado: maior de idade");
        } else {
            System.out.println("Acesso negado: menor de idade");
        }

        /*
         * Expressão Condicional Ternária:
         * resultado = (condição) ? valor_se_verdadeiro : valor_se_falso;
         */

        String permissao = (idadeUsuario >= 18) ? "Maior de idade confirmado" : "Idade insuficiente";
        System.out.println(permissao);

        /*
         * Estrutura Switch Case
         *
         * switch (variável) {
         *     case valor1:
         *         ações;
         *         break;
         *     case valor2:
         *         ações;
         *         break;
         *     default:
         *         ação padrão;
         *         break;
         * }
         */

        int numeroDoDia = 3;
        switch (numeroDoDia) {
            case 1:
                System.out.println("Hoje é Domingo");
                break;
            case 2:
                System.out.println("Hoje é Segunda-feira");
                break;
            case 3:
                System.out.println("Hoje é Terça-feira");
                break;
            default:
                System.out.println("Dia não identificado no sistema");
                break;
        }

    }
}