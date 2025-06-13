public class App {
    public static void main(String[] args) throws Exception {
// CRIAR OBJETO
  Carro carro1 = new Carro("pkj546", 2011, 4, "Nissan");
  
// EXIBIR INFORMACOES
carro1.ExibirInformacoes();

carro1.setAno(2025);

carro1.ExibirInformacoes();

carro1.setMarca("Ferrari");
System.out.println(carro1.getMarca());
    }
}
