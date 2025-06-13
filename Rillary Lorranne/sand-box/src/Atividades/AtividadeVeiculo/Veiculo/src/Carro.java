import java.util.ArrayList;
import java.util.List;

public class Carro extends Veiculo {

    private String Cor;
    List<Carro> listaCarros = new ArrayList<>();

    public Carro(String Placa, int Ano, int QtdPortas, String Marca, String Cor) {
        super(Placa, Ano, QtdPortas, Marca);  // super é classe mae
        this.Cor = Cor;
        //TODO Auto-generated constructor stub
    }

    public String getCor() {
        return Cor;
    }

    @Override  // reescreve um metodo , que esta na classe mae
    public void ExibirInformacoes(){
        System.out.println( "cor: " + getCor());
    }
    @Override
    void ligar() {
        System.out.println("O carro foi ligado");
    }
    
    public void adicionarCarro(Carro carro) {
        listaCarros.add(carro);
    }
}
