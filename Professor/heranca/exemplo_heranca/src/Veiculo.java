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

    //Método abstrato a ser implmentado por uma subclasse
    abstract void ligar();

    public void exibirInformacoes() {
        System.out.println("Modelo "+ modelo + " | Ano: " + ano);
    }

}
