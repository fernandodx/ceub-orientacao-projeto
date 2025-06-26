public class App {

    public static void main(String[] args) throws Exception {

     Pokemon pikachu = new Pokemon("Bulbasaur", 2);
     Pokemon pikachu2 = new Pokemon("Charizard", 4);
     Pokemon charmander = new Pokemon("Charmander", 3); 

     Luta luta = new Luta(pikachu, charmander);
     Luta luta2 = new Luta(pikachu, pikachu2);

     luta.iniciarLuta();
     luta2.iniciarLuta();

     pikachu.apresentarLutas();
     charmander.apresentarLutas();

    }
}