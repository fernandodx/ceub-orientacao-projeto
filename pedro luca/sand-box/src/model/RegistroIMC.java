package model;

import java.time.LocalDate;

public class RegistroIMC extends Pessoa {
    public RegistroIMC(String nome, double peso, double altura) {
        super(nome, peso, altura);
    }

    @Override
    public double calcularIMC() {
        return getPeso() / (getAltura() * getAltura());
    }

    @Override
    public String classificarIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) return "Abaixo do peso";
        if (imc < 24.9) return "Peso normal";
        if (imc < 29.9) return "Sobrepeso";
        return "Obesidade";
    }

    @Override
    public String toCSV() {
        return getNome() + "," + getPeso() + "," + getAltura() + "," + calcularIMC() + "," + LocalDate.now() + ",Adulto";
    }
}
