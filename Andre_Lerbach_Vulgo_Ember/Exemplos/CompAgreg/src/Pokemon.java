package Exemplos.CompAgreg.src;

import java.util.ArrayList;
import java.util.List;

public class Pokemon {

   private String nome;
   private int nivel;
   private int ataque;
   private int defesa;
   private int especial;
   private List<Luta> lutas = new ArrayList<>(); //falta colocar no diagrama UML

   public Pokemon(String nome, int nivel) {
    this.nome = nome;
    this.nivel = nivel;
    this.ataque = calcularAtributo(nivel, 2); // O método está na linha 24.
    this.defesa = calcularAtributo(nivel, 1); // O método está na linha 24.
    this.especial = calcularAtributo(nivel, 3); // O método está na linha 24.
}
   private int calcularAtributo(int base, int multiplicador){
    return base + (nivel * multiplicador);
   }
   public void adicionarLuta(Luta luta) {
    this.lutas.add(luta);
   }
   public void apresentarLutas() {
        System.out.println("Histórico de lutas do Pokémon " + nome + ":");
        for(Luta luta : lutas) {
            System.out.println("Contra " + luta.getOponente(this).getNome() + " - Resultado: " + luta.getResultado(this));
        }
   }
   public String getNome() {
    return this.nome;
   }
   public int getAtaque() {
    return this.ataque;
   }
   public int getDefesa() {
    return this.defesa;
   }
   public int getEspecial() {
    return this.especial;
   }
}
