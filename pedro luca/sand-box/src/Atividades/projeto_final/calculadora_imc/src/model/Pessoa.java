package model;

import model.contract.IPessoa;

public class Pessoa implements IPessoa {

    private String nome;
    private double peso;
    private double altura;

    public Pessoa(double altura, String nome, double peso) {
        this.altura = altura;
        this.nome = nome;
        this.peso = peso;
    }

    @Override
    public String getNome() {
       return this.nome;
    }

    @Override
    public double getPeso() {
      return this.peso;
    }

    @Override
    public double getAltura() {
       return this.altura;
    }

}
