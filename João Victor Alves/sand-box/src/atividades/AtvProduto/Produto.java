package Atividades.AtvProduto;

public class Produto {
    private String nome;
    private Double preco;
    private int quantidade;

    public Produto(String nome, Double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(){
        this.nome = nome;
    }

    public Double getPreco(){
        return preco;
    }

    public void setPreco(){
        this.preco = preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(){
        this.quantidade = quantidade;
    }

    public void comprar(int quantidade){
        if (quantidade > 0){
            this.quantidade += quantidade;
            System.out.println("Compra realizada. Quantidade restante em estoque: " + this.quantidade);
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    public void vender(int quantidade){
        if (quantidade > 0 && quantidade <= this.quantidade){
            this.quantidade -= quantidade;
            System.out.println("Venda realizada. Quantidade restante em estoque: " + this.quantidade);
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    public void showInfo(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço: R$  " + preco);
        System.out.println("Quantidade em estoque: " + quantidade);
    }
}
