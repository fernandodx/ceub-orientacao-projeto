// Classe Pokemon.java
import java.util.ArrayList;
import java.util.List;

public class Pokemon {
    private String nome;
    private int nivel;
    private List<Luta> lutas = new ArrayList<>();
    private List<Ginasio> ginasiosTreinados = new ArrayList<>();

    public Pokemon(String nome, int nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public void adicionarLuta(Luta luta) {
        lutas.add(luta);
    }

    public void adicionarGinasioTreinado(Ginasio ginasio) {
        if (!ginasiosTreinados.contains(ginasio)) {
            ginasiosTreinados.add(ginasio);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public List<Luta> getLutas() {
        return lutas;
    }

    public List<Ginasio> getGinasiosTreinados() {
        return ginasiosTreinados;
    }

    @Override
    public String toString() {
        return "Pokémon: " + nome + " (Nível: " + nivel + ")";
    }
}


// Classe Luta.java
public class Luta {
    private Pokemon p1;
    private Pokemon p2;

    public Luta(Pokemon p1, Pokemon p2) {
        this.p1 = p1;
        this.p2 = p2;
        p1.adicionarLuta(this);
        p2.adicionarLuta(this);
    }

    @Override
    public String toString() {
        return p1.getNome() + " VS " + p2.getNome();
    }
}


// Classe Treinamento.java
public class Treinamento {
    private String descricao;
    private int duracao; // em minutos

    public Treinamento(String descricao, int duracao) {
        this.descricao = descricao;
        this.duracao = duracao;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDuracao() {
        return duracao;
    }

    @Override
    public String toString() {
        return "Treinamento: " + descricao + " (" + duracao + " min)";
    }
}


// Classe Ginasio.java
import java.util.ArrayList;
import java.util.List;

public class Ginasio {
    private String nome;
    private List<Pokemon> pokemonsTreinados = new ArrayList<>();
    private List<Treinamento> treinamentos = new ArrayList<>();

    public Ginasio(String nome) {
        this.nome = nome;
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

    public void registrarTreinamento(Pokemon pokemon, Treinamento treino) {
        if (!pokemonsTreinados.contains(pokemon)) {
            pokemonsTreinados.add(pokemon);
        }
        treinamentos.add(treino);
        pokemon.adicionarGinasioTreinado(this);
    }

    @Override
    public String toString() {
        return "Ginásio: " + nome + " | Treinamentos: " + treinamentos.size();
    }
}


// Classe App.java
public class App {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", 10);
        Pokemon charmander = new Pokemon("Charmander", 8);

        Luta luta = new Luta(pikachu, charmander);

        Ginasio ginasio = new Ginasio("Ginásio de Pallet");
        Treinamento treino = new Treinamento("Treino de Agilidade", 30);
        ginasio.registrarTreinamento(pikachu, treino);

        System.out.println(pikachu);
        System.out.println(ginasio);
        System.out.println("Histórico de treino do Pikachu:");
        for (Ginasio g : pikachu.getGinasiosTreinados()) {
            System.out.println(" - " + g.getNome());
        }
    }
}