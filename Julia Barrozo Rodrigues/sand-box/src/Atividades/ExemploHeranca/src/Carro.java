public class Carro extends Veiculo{

    public Carro(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    void ligar() {
        System.out.println("O carro foi ligado");
    }
    
}
