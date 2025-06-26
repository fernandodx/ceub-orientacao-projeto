public class App {
    public static void main(String[] args) throws Exception {
      
        Caixa<Integer> caixaInteiro = new Caixa<Integer>();
        caixaInteiro.salvar(20);
        Integer retorno = caixaInteiro.get();
        System.out.println(retorno);

        Caixa<String> caixaString = new Caixa<String>();
        caixaString.salvar("Fernando");
        String retornoStr = caixaString.get();
        System.out.println(retornoStr);

        Caixa<Produto> caixaProduto = new Caixa<Produto>();
        caixaProduto.salvar(new Produto("Sabão", "R$ 4,99"));
        String nomeProduto = caixaProduto.get().getNome();
        System.out.println("Nome Produto: "+nomeProduto);




    }
}


//Exemplo classe genérica
class Caixa<T> {
    private T conteudo;

    public void salvar(T item){
        this.conteudo = item;
    }

    public T get(){
        return this.conteudo;
    }
}

class Produto {
    private String nome;
    private String preco;

    public Produto(String nome, String preco){
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome(){
        return this.nome;
    }
    public String getPreco() {
        return this.preco;
    }
}
