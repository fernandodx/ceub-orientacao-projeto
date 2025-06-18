public class Carro extends Veiculo {

    public Carro(String modelo, int ano) {
            super(modelo, ano);
            
        }
    
        @Override
    void Ligar() {
        System.out.println("Carro ligando com chave");
    }

    


}
