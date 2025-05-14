public class App {
    public static void main(String[] args) throws Exception {

        // Criando os jogadores
        Jogador jogador1 = new Jogador("Ember");
        Jogador jogador2 = new Jogador("Fernando");



        // Criando o revolver e carregando com munição viva e munições vazias.
        Revolver colt = new Revolver(3);
        colt.carregar(new Cartucho(true));
        colt.carregar(new Cartucho(true));
        colt.carregar(new Cartucho(false));

        // Giando o tambor do revolver
        colt.embaralhar();

        // Tentativa de tiros:
        jogador1.tentarAtirar(colt);
        System.out.println("--------------------------------");
        System.out.println(colt);
        System.out.println("--------------------------------");

        jogador2.tentarAtirar(colt);
        System.out.println("--------------------------------");
        System.out.println(colt);
        System.out.println("--------------------------------");

        jogador1.tentarAtirar(colt);
        System.out.println("--------------------------------");
        System.out.println(colt);
        System.out.println("--------------------------------");

        jogador2.tentarAtirar(colt);
        System.out.println("--------------------------------");
        System.out.println(colt);
        System.out.println("--------------------------------");
    }
}
