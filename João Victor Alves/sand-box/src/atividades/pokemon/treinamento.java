package Atividades.pokemon;

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
}
