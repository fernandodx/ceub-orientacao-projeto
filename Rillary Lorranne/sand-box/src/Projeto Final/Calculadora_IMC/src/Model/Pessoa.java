package Model;

import Model.contract.IPessoa;

public class Pessoa implements IPessoa {

    private String Nome;
    private Double Peso;
    private Double Altura;

    public Pessoa(String Nome, Double Peso, Double Altura) {
        this.Nome = Nome;
        this.Peso = Peso;
        this.Altura = Altura;
    }

    @Override
    public String getNome() {
       return this.Nome;
    }

    @Override
    public Double getPeso() {
        return this.Peso;
    }

    @Override
    public Double getAltura() {
        return this.Altura;
    }


}
