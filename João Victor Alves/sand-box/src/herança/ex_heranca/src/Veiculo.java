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

    abstract void ligar();

    public void exibirInfo(){
        System.out.println("Modelo: " + modelo + " | Ano: " + ano);
    }
}
