package model;

import model.contract.IPessoa;
import model.contract.ICalculoIMC;

public abstract class Pessoa implements IPessoa, ICalculoIMC {
    private String nome;
    private double peso;
    private double altura;

    public Pessoa(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() { return nome; }
    public double getPeso() { return peso; }
    public double getAltura() { return altura; }

    public abstract String classificarIMC();
    public abstract String toCSV();
}
