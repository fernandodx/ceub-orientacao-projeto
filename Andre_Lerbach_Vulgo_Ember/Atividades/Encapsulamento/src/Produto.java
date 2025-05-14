package Atividades.Encapsulamento.src;

public class Produto {
    private String nome;
    private Double preco;
    private int quantidade;


    // Get e setters
    public String getNome(){
        return this.nome;
    }

    public void setNome(){
        this.nome = nome;
    }

    public Double getPreco(){
        return this.preco;
    }

    public void setPreco(){
        this.preco = preco;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public void setQuantidade(){
        this.quantidade = quantidade;
    }

    // Construtor
    public Produto(String nome, Double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade =  quantidade;
    }

    //Métodos
    public String toString(){
        return "\n Nome: "+getNome()+
                "\n Preço: "+getPreco()+
                "\n Quantidade: "+getQuantidade();
    }
}