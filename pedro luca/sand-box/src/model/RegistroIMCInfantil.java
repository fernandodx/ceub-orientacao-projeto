package model;

import java.time.LocalDate;

public class RegistroIMCInfantil extends Pessoa {
    public RegistroIMCInfantil(String nome, double peso, double altura) {
        super(nome, peso, altura);
    }

    @Override
    public double calcularIMC() {
        return getPeso() / (getAltura() * getAltura());
    }

    @Override
    public String classificarIMC() {
        double imc = calcularIMC();
        if (imc < 14) return "Abaixo do peso";
        if (imc < 18) return "Peso normal";
        return "Acima do peso";
    }

    @Override
    public String toCSV() {
        return getNome() + "," + getPeso() + "," + getAltura() + "," + calcularIMC() + "," + LocalDate.now() + ",Infantil";
    }
}
