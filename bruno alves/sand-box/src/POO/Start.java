package POO;

public class Start {
    public static void main(String[] args) {
        
        Carro palio = new Carro("tubolar", "THP", 2019);
        Carro ferrari = new Carro("tubolar 2", "v12", 2025);

       palio.exibirDados();
       ferrari.exibirDados();
    }
}
