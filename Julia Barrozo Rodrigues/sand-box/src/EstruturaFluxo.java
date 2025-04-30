public class EstruturaFluxo {
    public static void main(String[] args) {
        int idade = 18;

        // If-else
        if (idade >= 18) {
            System.out.println("Maior de idade!");
        } else {
            System.out.println("Sou de menor!");
        }
        
        // Operador ternário (condição) ? operação caso true : caso false 
        String status = (idade >= 18) ? "Maior de idade" : "Sou de menor";
        System.out.println(status);

        int dia = 2;

        switch (dia) {
            case 1: 
                System.out.println("Primeiro dia");
                break;
            case 2: 
                System.out.println("Segundo dia");
                break;
            default:
            System.out.println("Dia não encontrado");
                break;
        }
    }
}
