import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Revolver {
    private List<Cartucho> carregador;
    private int capacidade;

    public Revolver(int capacidade) {
        this.capacidade = capacidade;
        this.carregador = new ArrayList<>(capacidade);
    }

    public void carregar(Cartucho cartucho) {
        if (carregador.size() < capacidade) {
            this.carregador.add(cartucho);
        } else {
            System.out.println("O tambor do revólver está cheio!");
        }
    }

    public void embaralhar() {
        Collections.shuffle(carregador);
    }

    public Cartucho atirar() {
        if (!carregador.isEmpty()) {
            return carregador.remove(0);
        } else {
            System.out.println("O tambor está vazio!");
            return null;
        }
    }

    public int getQuantidadeCartuchos() {
        return carregador.size();
    }

    public int getCapacidade() {
        return capacidade;
    }

    @Override
    public String toString() {
        return "Revólver com " + carregador.size() + "/" + capacidade + " cartuchos.";
    }
}