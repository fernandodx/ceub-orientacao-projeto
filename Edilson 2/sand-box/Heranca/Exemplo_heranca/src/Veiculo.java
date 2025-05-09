public abstract class Veiculo {

    String modelo;
    int ano;

    public Veiculo(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }

    public final String getTipoCombustivel(){
        return "energia";
    }

    // método abstrato a ser implementado por uma sub classe
    abstract void Ligar();

    public void exibirInformacoes(){
        System.out.println("Modelo "+ modelo + " | Ano " + ano);
    }



}
