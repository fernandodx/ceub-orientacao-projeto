public class Moto extends Veiculo {

    public Moto(String modelo, int ano) {
            super(modelo, ano);
           
        }
    
        @Override
    void Ligar() {
        System.out.println("Moto ligando com botão");
    }


   // public String getTipoCombustivel(){
       // return "Gasolina";
}

