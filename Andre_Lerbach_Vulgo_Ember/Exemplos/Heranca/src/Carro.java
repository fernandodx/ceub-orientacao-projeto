package Exemplos.Heranca.src;

public class Carro extends Veiculo {

    public Carro(String modelo, int ano) {
            super(modelo, ano);
            //TODO Auto-generated constructor stub
        }
    
        @Override
    void ligar() {
        System.out.println("AOOHHH "+modelo+" BOMMM, carro ligadão WOOOOOHHHHH");
    }

}
