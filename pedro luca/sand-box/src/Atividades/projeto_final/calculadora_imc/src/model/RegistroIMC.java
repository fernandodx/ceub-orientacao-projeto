package model;

import model.contract.ICalculoIMC;

public class RegistroIMC extends Pessoa implements ICalculoIMC {

    private double imc;
    private String classificacao;

    public RegistroIMC(double altura, String nome, double peso) {
        super(altura, nome, peso);
        this.imc = calcularIMC();  // Calcula IMC no construtor
        this.classificacao = classificarIMC();  // Classifica no construtor
    }

    @Override
    public double calcularIMC() {
        // IMC = peso / (altura * altura)
        return getPeso() / (getAltura() * getAltura());
    }

    @Override
    public String classificarIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Magreza";
        } else if (imc < 25) {
            return "Normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obeso";
        }
    }

    public double getImc() {
        return imc;
    }

    public String getClassificacao() {
        return classificacao;
    }
}