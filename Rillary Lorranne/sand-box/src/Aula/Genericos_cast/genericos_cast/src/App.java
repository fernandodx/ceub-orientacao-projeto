public class App {
    public static void main(String[] args) throws Exception {
        
        Caixa<Integer> caixaInteiro = new Caixa<Integer>();
        caixaInteiro.salvar(20);
        Integer retorno = caixaInteiro.get();
        System.out.println(retorno);

        Caixa<String> caixaString = new Caixa<String>();
        caixaString.salvar("Rillary");
        String retornoStr = caixaString.get();
        System.out.println(retornoStr);

        Caixa<Produto> caixaProduto = new Caixa<Produto>();
        caixaProduto.salvar(new Produto("Detergente", "R$ 3,00"));
        String nomeProduto = caixaProduto.get().getNome();
        System.out.println("Nome Produto: " + nomeProduto);
    }
}


// EXEMPLO CLASSE GENERICA

class Caixa<T>{
    private T conteudo;

    public void salvar(T item) {
        this.conteudo = item;
    }

    public T get() {
        return this.conteudo;
    }
 }

class  Produto {
    private String nome;
    private String Preco;
    public Produto(String nome, String Preco) {
        this.nome = nome;
        this.Preco = Preco;
    }
    public String getNome() {
        return this.nome;
    }
    public String getPreco() {
        return this.Preco;
    }
 }