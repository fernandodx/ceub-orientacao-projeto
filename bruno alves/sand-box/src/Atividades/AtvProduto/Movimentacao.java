package Atividades.AtvProduto;

public class Movimentacao {
    public static void main(String[] args){
        Produto produto = new Produto("Novalgina", 29.99, 20);

        produto.showInfo();

        produto.comprar(10);

        produto.vender(15);
    }
}
