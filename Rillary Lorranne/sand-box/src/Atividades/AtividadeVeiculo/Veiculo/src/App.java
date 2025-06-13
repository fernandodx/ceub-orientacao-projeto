public class App {
  private static void fiscalizar(Veiculo veiculo) {
      veiculo.ligar();
      veiculo.ExibirInformacoes();
  }
  public static void main(String[] args) throws Exception {
      Carro punto = new Carro("punto", 2010);
      Moto cg = new Moto("CG", 2010);
      if (punto instanceof Veiculo) {
          System.out.println("Punto é veiculo");
      }
      if (cg instanceof Veiculo) {
          System.out.println("CG é veiculo");
      }
      cg.getCombustivel();
  }
}