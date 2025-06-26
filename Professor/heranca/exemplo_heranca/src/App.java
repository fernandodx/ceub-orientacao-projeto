public class App {

    private static void fiscalizar(Veiculo veiculo) {
        veiculo.ligar();
        veiculo.exibirInformacoes();
    }


    public static void main(String[] args) throws Exception {
       Carro punto = new Carro("punto", 2010);
       Moto moto = new Moto("honnet", 2020);
       Sedan sedan = new Sedan("vovorrola", 2021);
    
       fiscalizar(sedan); 
       fiscalizar(punto);
       fiscalizar(moto);
        

    //    if(punto instanceof Veiculo){
    //     System.out.println("Punto é veiculo");
    //    }

    //    if(moto instanceof Veiculo){
    //     System.out.println("Moto é veiculo");
    //    }

    //    System.out.println(moto.getTipoCombustivel());





    }
}
