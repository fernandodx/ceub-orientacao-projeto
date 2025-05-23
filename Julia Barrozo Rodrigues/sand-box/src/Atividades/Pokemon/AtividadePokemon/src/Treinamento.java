import java.util.ArrayList;
import java.util.List;

public class Treinamento {
    private String descricao;
    private int duracao;

    public Treinamento (String descricao, int duracao) {
        this.descricao = descricao;
        this.duracao = duracao;
    }

    public void treinoDeForca(Pokemon pokemon1) {
        System.out.println("Treino de força inciado.");
    }
}
