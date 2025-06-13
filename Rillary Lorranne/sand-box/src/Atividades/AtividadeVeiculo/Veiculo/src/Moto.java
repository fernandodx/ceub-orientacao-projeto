public class Moto extends Veiculo {
    
    public Moto(String modelo, int ano) {
        super(modelo, ano);
    }
    @Override
    public void ligar() {
        System.out.println("A moto foi ligada");
    }
      
}