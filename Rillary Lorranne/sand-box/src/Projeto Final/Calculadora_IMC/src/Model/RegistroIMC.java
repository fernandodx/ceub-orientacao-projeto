package model;

import java.time.LocalDate;
import model.contract.ICalculoIMC;

public class RegistroIMC extends Pessoa implements ICalculoIMC {

    protected double imc;
    protected String classificacao;
    protected LocalDate dataRegistro;

    public RegistroIMC(String nome, double peso, double altura) {
        super(altura, nome, peso);
        this.imc = calcularIMC(); // calcula automaticamente no construtor
        this.classificacao = classificarIMC();
        this.dataRegistro = LocalDate.now();
    }

    @Override
    public double calcularIMC() {
        if (getAltura() <= 0) return 0;
        return getPeso() / (getAltura() * getAltura());
    }

    @Override
    public String classificarIMC() {
        double imc = this.imc;
        if (imc < 18.5) return "Abaixo do peso";
        else if (imc < 25) return "Peso normal";
        else if (imc < 30) return "Sobrepeso";
        else return "Obesidade";
    }

    public double getIMC() {
        return imc;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public String getTipo() {
        return "Adulto";
    }

    // Método extra: resumo amigável para mostrar na interface
    public String getResumo() {
        return String.format("%s - IMC: %.2f (%s)", getNome(), getIMC(), getClassificacao());
    }

    // Método extra: formato CSV
    public String toCSV() {
        return String.format("%s,%.2f,%.2f,%.2f,%s,%s",
                getNome(),
                getPeso(),
                getAltura(),
                getIMC(),
                dataRegistro.toString(),
                getTipo());
    }
}
