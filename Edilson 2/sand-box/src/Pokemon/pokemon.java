package Pokemon;

import java.util.List;

public class pokemon {

    private String nome;
    private int nivel;
    private int ataque;
    private int defesa;
    private int especial;
    private List<luta> lutas; // falta colocar no diagrama UML

    public void adicionarLuta(Luta luta){
        this.lutas.add(lutas)
    }
    
    private int calcularAtributo(int base, int multiplicador){
        return base + (nive * multiplicador)
    }


    public void apresentarLutas(){
        System.out.println("Histórico de lutas do pokémon " + nome + ":");
        for(Luta luta : lutas) {
            System.out.println("contra");
        }


        public String getNome(){
            return this.nome
        }

        public int getAtaque(){
            return this.ataque
        }

        public int getNivel(){
            return this.nivel
        }

        public int getDefesa(){
            return this.defesa
        }

        public int getEspecial(){
            return this.especial
        }

    

    }





}
