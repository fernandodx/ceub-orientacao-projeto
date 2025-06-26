package poo;

public class Carro {
    //Atibutos
    String chassi;
    String motor;
    String marca;
    String modelo;
    Integer ano;
    int qtdPortas;

    //Construtor
    public Carro(String chassi, String motor, Integer ano){
        this.chassi = chassi;
        this.motor = motor;
        this.ano = ano;
        this.qtdPortas = 2;
    }

    //Metodos
    public void LigarCarro(){
        System.out.println("Ligando Carro!");
    }

    public void acelerar() {
        System.out.println("Acelerando!");
    }

    public void freiar() {
        System.out.println("Freiando!");
    }
    public void exibirDados(){
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Chassi: " + chassi);
        System.out.println("Motor: " + motor);
        System.out.println("Modelo: " + modelo);
        System.out.println("Qtd Portas: " + qtdPortas);
    }
}
