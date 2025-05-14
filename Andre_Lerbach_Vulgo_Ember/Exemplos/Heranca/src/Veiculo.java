package Exemplos.Heranca.src;

public abstract class Veiculo {

    String modelo;
    int ano;

    public Veiculo(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }

    public final String getTipoCombustivel(){
        return "Energia";
    }

    //Método abstrato a ser implementado por uma subclasse
    abstract void ligar();

    public void exibirInfo(){
        System.out.println("Modelo: " + modelo+
                            "\n Ano: "+ ano);
    }
}
