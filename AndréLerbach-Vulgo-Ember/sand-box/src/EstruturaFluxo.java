public class EstruturaFluxo {
    public static void main(String[] args) {

        int idade = 18;

        /*
         * Condicional IF:
         *
         * if (status) {
         *     Condição
         * } else {
         *     Condição
         * }
        */

        if (idade >= 18){
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }

        /*
        * Condicional Ternária (IF)
        * clarar variável = (condição) ? "condição true" : "condição false";
         */

        String status = (idade >= 18) ? "Você é maior de idade":"sou de menor";
        System.out.println(status);

        /*
         * Condicional Switch
         *
         * Switch (status) {
         *      case (valor):
         *          Condição;
         *      break;
         *      case (valor2):
         *          Condição 2;
         *      break;
         *
         *      [...]
         *
         *      default:
         *          Condição padrão;
         *      break;
         * }
         */

        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            default:
                System.out.println("Você ainda está em um dia da semana... Não foi dessa vez...");
                break;
        }

    }

}