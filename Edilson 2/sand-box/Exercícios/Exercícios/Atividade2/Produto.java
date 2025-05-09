package Atividade2;

public class Produto {

   String nome;
   Double preco;
   int quantidade;

   private Produto (String nome, Double preco, int quantidade){
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
      this.preco;
   }

   public int getQuantidade(){
      return quantidade;
   }

   public void setQuantidade(){
      this.quantidade;
   }

   public void comprar (int quantidade){
      if (quantidade > 0){
         this.quantidade += quantidade;
         System.out.println("Compra feita! Restam" + this.quantidade "quantidades");
      } else {
         System.out.println("Não há quantidade suficiente em estoque.");
      }
   }

   public void vender(int quantidade){
      if(quantidade > 0){
         System.out.println("Compra realizada. Restam" + this.quantidade);
      } else {
         System.out.println("Quantidade insuficiente em estoque.");
      }
   }

   public void info(){
      System.out.println("Nome do produto: " + nome);
      System.out.println("Preço: R$ " + preco);
      System.out.println("Quantidade em estoque: " + quantidade);
   }


}
