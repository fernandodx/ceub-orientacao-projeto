package Atividades.pokemon;

import java.util.List;
import java.util.ArrayList;

public class Ginasio {
    private String nome;
    private List<Pokemon> pokemonsTreinados;
    private List<Treinamento> treinamentos;

    public Ginasio(String nome) {
        this.nome = nome;
        this.pokemonsTreinados = new ArrayList<>();
        this.treinamentos = new ArrayList<>();
    }

    public void registrarTreinamento(Pokemon p, Treinamento t) {
        if (!pokemonsTreinados.contains(p)) {
            pokemonsTreinados.add(p);
            p.adicionarGinasio(this);
        }
        treinamentos.add(t);
    }

    public String getNome() {
        return nome;
    }

    public List<Pokemon> getPokemonsTreinados() {
        return pokemonsTreinados;
    }

    public List<Treinamento> getTreinamentos() {
        return treinamentos;
    }
}
