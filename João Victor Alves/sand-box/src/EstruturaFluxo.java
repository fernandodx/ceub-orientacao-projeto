public class EstruturaFluxo {
    public static void main(String[] args) {
        int idade = 18;

        // if-else
        if (idade >= 18) {
            System.out.println("Você é de maior!");
        } else {
            System.out.println("Sou de menor!");
        }

        // operador ternário (codição) ? operação caso true : operação caso false;
        String status = (idade >= 18) ? "Maior de idade" : "Sou de menor";
        System.out.println(status);

        int dia = 1;
        switch (dia) {
            case 1:
                System.out.println("Primeiro Dia");
                break;
            case 2:
                System.out.println("Segundo Dia");
                break;
            default:
                System.out.println("Dia não encontrado");
                break;
        }

    }
}
