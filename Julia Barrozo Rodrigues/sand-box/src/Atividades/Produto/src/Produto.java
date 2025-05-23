public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    // Metodos get
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    // Metodos set
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    // Metodos comprar e vender
    public void comprar(int quantidade) {
        this.quantidade += quantidade;
        System.out.println("Quantidade atualizada após realizar uma compra: " + getQuantidade());
    }
    public boolean vender(int quantidade) {
        if (this.quantidade < quantidade) {
            System.out.println("A quantidade inserida é maior do que a do estoque.");
            return false;
        }
        else {
            this.quantidade -= quantidade;
            System.out.println("Quantidade atualizada após realizar uma venda: " + getQuantidade());
            return true;
        }
    }
}
