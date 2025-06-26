<<<<<<< HEAD
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá OO");
=======

import pokemon.Luta;
import pokemon.Pokemon;


public class App {
    public static void main(String[] args) throws Exception {
       
     Pokemon pikachu = new Pokemon("Pikachu", 3);
     Pokemon pikachu2 = new Pokemon("Pikachu", 3);
     Pokemon charmander = new Pokemon("Charmander", 4); 
     
     Luta luta = new Luta(pikachu, charmander);
     Luta luta2 = new Luta(pikachu, pikachu2);
        
     luta.iniciarLuta();
     luta2.iniciarLuta();

     pikachu.apresentarLutas();
     charmander.apresentarLutas();


    // System.out.println("Pikachu Resultado: " + luta.getResultado(pikachu)); 
    


>>>>>>> c0d9003 (Adiciona minha pasta com os exercícios)
    }
}
