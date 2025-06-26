package pokemon;

import java.util.Random;

public class Luta {

    private Pokemon pokemon1;
    private Pokemon pokemon2;
    private Pokemon vencedor;

    public Luta(Pokemon pokemon1, Pokemon pokemon2) {
        this.pokemon1 = pokemon1;
        this.pokemon2 = pokemon2;
    }

    public void iniciarLuta() {
        this.vencedor = determinarVencedor();
        pokemon1.adicionarLuta(this);
        pokemon2.adicionarLuta(this);
    }

    private int calcularForca(Pokemon p){
        return (p.getAtaque() * 2) + (p.getDefesa() + (p.getEspecial() * 3));
    }

    private Pokemon determinarVencedor() {
        int forca1 = calcularForca(pokemon1);
        int forca2 = calcularForca(pokemon2);
        
        if(forca1 > forca2){
            return pokemon1;
        }else if(forca2 > forca1){
            return pokemon2;
        }else{
            return new Random().nextBoolean() ? pokemon1 : pokemon2;
        }
    }
    public Pokemon getOponente(Pokemon pokemon) {
        return (pokemon == pokemon1) ? pokemon2 : pokemon1;
    }
    public String getResultado(Pokemon pokemon) {
        return (pokemon == vencedor) ? "Vitória" : "Derrota";
    }



}
