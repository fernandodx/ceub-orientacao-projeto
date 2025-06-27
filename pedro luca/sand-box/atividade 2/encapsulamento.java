public class Produto {

    // Atributos privados
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Métodos Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Métodos Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Método comprar: aumenta a quantidade
    public void comprar(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        }
    }

    // Método vender: diminui a quantidade, se houver estoque suficiente
    public boolean vender(int quantidade) {
        if (quantidade > 0 && this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            return true;
        }
        return false; // Estoque insuficiente
    }

    // Opcional: método toString para visualizar
    @Override
    public String toString() {
        return String.format("Produto: %s | Preço: R$ %.2f | Estoque: %d", nome, preco, quantidade);
    }
}