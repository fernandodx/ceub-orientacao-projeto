package Exemplos.Heranca.src;

public class Moto extends Veiculo {

    public Moto(String modelo, int ano) {
            super(modelo, ano);
        }
    
        @Override
    void ligar() {
        System.out.println("CORTANDO GIROOOOWW, "+modelo+" ligada");
    }

        // Bo pudemos reescrever pq o método é final na Classe Abstrata;

    //     @Override
    // public String getTipoCombustivel(){
    //     return "Gasolina";
    // }

}
