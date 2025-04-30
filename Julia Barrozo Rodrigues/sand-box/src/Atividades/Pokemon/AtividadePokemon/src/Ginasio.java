import java.util.List;

public class Ginasio {
    private String nome;
    private List<Pokemon> PokemonsTreinados;
    private List<Treinamento> ListaTreinamentos;


    public Ginasio (String nome, List PokemonsTreinados, List ListaTreinamentos) {
        this.nome = nome;
        this.PokemonsTreinados = PokemonsTreinados;
        this.ListaTreinamentos = ListaTreinamentos;
    }
    public void adicionarPokemons(Pokemon pokemon) {
        this.PokemonsTreinados.add(pokemon);
    }
    public void adicionarTreinamento(Treinamento treinamento) {
        this.ListaTreinamentos.add(treinamento);
    }
    public void ExibirPokemonsTreinados() {
        System.out.println(PokemonsTreinados);
    }
    public void ExibirListaTreinamentos() {
        System.out.println(ListaTreinamentos);
    }
}
