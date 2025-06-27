package pokemon;

import java.util.List;

public class Pokemon {

    private String nome;
    private int nivel;
    private int ataque;
    private int defesa;
    private int especial;
    private List<Luta> lutas; // Falta colocar no diagrama UML

    public void adicionarLuta(Luta luta) {
        this.lutas.add(luta);
    }

    private int calcularAtributo(int base, int multiplicador){
    return base + (nivel * multiplicador);
    }

    public void apresentarLutas(){
      System.out.println("Historico de lutas do Pokémon" + nome + ":");
      for(Luta luta : luta) {
        System.out.println("Contra");

      }
    }

    public Pokemon(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
        this.ataque = calcularAtributo(nivel, multiplicador:2);
        this.defesa = calcularAtributo(nivel, multiplicador:1);
        this.especial = calcularAtributo(nivel, multiplicador3);
    }

    public int getAtaque () {
        return this.ataque;
    }

    public int getDefesa() {
        return this.defesa;
    }

    public int getEspecial() {
        return this.especial;
    }
}

