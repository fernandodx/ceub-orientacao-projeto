package model;

import model.contract.ICalculoIMC;
import java.time.LocalDate;

public class RegistroIMCInfantil extends Pessoa implements ICalculoIMC {

    private int idadeMeses;
    private double imc;
    private String classificacao;
    private LocalDate dataRegistro;

    public RegistroIMCInfantil(String nome, double peso, double altura, int idadeMeses) {
        super(altura, nome, peso);
        this.idadeMeses = idadeMeses;
        this.imc = calcularIMC();
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
        if (imc < 14) return "Abaixo do ideal (Infantil)";
        else if (imc <= 17) return "Peso adequado (Infantil)";
        else return "Acima do ideal (Infantil)";
    }

    public int getIdadeMeses() {
        return idadeMeses;
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
        return "Infantil";
    }

    public String getResumo() {
        return String.format("%s (%d meses) | IMC: %.2f | %s",
                getNome(), idadeMeses, getIMC(), getClassificacao());
    }

    public String toCSV() {
        return String.format("%s,%.2f,%.2f,%.2f,%s,%s",
                getNome(),
                getPeso(),
                getAltura(),
                getIMC(),
                dataRegistro.toString(),
                getTipo());
    }

    @Override
    public String toString() {
        return String.format(
            "\nNome: %s\nIdade: %d meses\nAltura: %.2f m\nPeso: %.2f kg\nIMC: %.2f\nClassificação: %s\nData: %s\nTipo: %s",
            getNome(), idad
        )
    }
}