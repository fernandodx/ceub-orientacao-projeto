package poo;

public class Start {

    public static void main(String[] args) {
        
       Carro palio = new Carro("Tubolar", "THP", 2019);
       Carro ferrari = new Carro("Tubolar 2", "v12", 2025);
       ferrari.exibirDados();
       
       ferrari.modelo = "La Ferrari";

       //palio.exibirDados();
       ferrari.exibirDados();

    }

}
