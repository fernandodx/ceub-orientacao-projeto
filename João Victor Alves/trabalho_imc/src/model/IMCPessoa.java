package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Pessoa {
    protected String nome;
    protected double peso;
    protected double altura;
    protected LocalDate data;

    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.data = LocalDate.now();
    }

    public String getNome() { return nome; }
    public double getPeso() { return peso; }
    public double getAltura() { return altura; }
    public LocalDate getData() { return data; }

    public abstract double calcularIMC();
    public abstract String classificarIMC();
    public abstract String getTipo();

    /**
     * Formata os dados do registro para uma linha de arquivo CSV.
     * @return String formatada como CSV.
     */
    public String toCSV() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%s,%.2f,%.2f,%.2f,%s,%s\n",
                nome, peso, altura, calcularIMC(), data.format(formatter), getTipo());
    }
}
