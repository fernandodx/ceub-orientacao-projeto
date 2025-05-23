public abstract class Veiculo {
    String modelo;
    int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getCombustivel() {
        return "energia";
    }

    abstract void ligar();

    public void exibirInformacoes () {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
