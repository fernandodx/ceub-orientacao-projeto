package Atividades.pokemon;

import java.util.List;
import java.util.ArrayList;

public class Pokemon {
    private String nome;
    private int nivel;
    private int ataque;
    private int defesa;
    private int especial;
    private List<Luta> lutas;
    private List<Ginasio> ginasiosTreinados;

    public Pokemon(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
        this.ataque = calcularAtributo(nivel, 2);
        this.defesa = calcularAtributo(nivel, 1);
        this.especial = calcularAtributo(nivel, 3);
        this.lutas = new ArrayList<>();
        this.ginasiosTreinados = new ArrayList<>();
    }

    public void adicionarLuta(Luta luta){
        this.lutas.add(luta);
    }

    public void adicionarGinasio(Ginasio ginasio) {
        this.ginasiosTreinados.add(ginasio);
    }

    private int calcularAtributo(int base, int multiplicador){
        return base + (nivel * multiplicador);
    }

    public void apresentarLutas(){
        System.out.println("Histórico de lutas do Pokémon " + nome + ": ");
        for(Luta luta : lutas) {
            Pokemon oponente = luta.getOponente(this);
            String resultado = luta.getResultado(this);
            System.out.println("Contra " + oponente.getNome() + " - " + resultado);
        }
    }

    public void apresentarGinasios() {
        System.out.println("Ginásios onde " + nome + " treinou:");
        for (Ginasio g : ginasiosTreinados) {
            System.out.println("- " + g.getNome());
        }
    }

    public String getNome(){
        return this.nome;
    }

    public int getAtaque(){
        return this.ataque;
    }

    public int getDefesa(){
        return this.defesa;
    }

    public int getEspecial(){
        return this.especial;
    }
}
