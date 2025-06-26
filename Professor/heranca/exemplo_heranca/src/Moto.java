public class Moto extends Veiculo {

    public Moto(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    void ligar() {
        System.out.println("Moto ligando com botão!");
    }

    //override proibido porque o metodo é final 
    // @Override
    // public String getTipoCombustivel(){
    //     return "Gasolina";
    // }



}
