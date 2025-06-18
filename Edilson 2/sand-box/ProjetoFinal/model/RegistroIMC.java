package model;

public class RegistroIMC {

    private String nome;
    private double peso;
    private double altura;
    private double imc;
    private String classificacao;

    public RegistroIMC(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.imc = calcularIMC();
        this.classificacao = classificarIMC();
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String classificarIMC() {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidade grau I";
        } else if (imc < 40) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III (mórbida)";
        }
    }

    @Override
    public String toString() {
        return String.format("%s - IMC: %.2f - %s", nome, imc, classificacao);
    }
}

