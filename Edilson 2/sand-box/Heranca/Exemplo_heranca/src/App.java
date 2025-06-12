public class App {

private static void fiscalizar(Carro carro){
    carro.Ligar();
    carro.exibirInformacoes();
}

private static void fiscalizar(Moto moto){
    moto.Ligar();
    moto.exibirInformacoes();
}

public static void fiscalizar(Suv suv) {
    suv.Ligar();
    suv.exibirInformacoes();
}



    public static void main(String[] args) throws Exception {
       Carro punto = new Carro ("punto", 2010);
       Moto moto = new Moto("honnet", 2020);
       Suv suv = new Suv("Jeep Compass", 2025);

       fiscalizar(punto);
       fiscalizar(moto);


       if(punto instanceof Veiculo){
        System.out.println("Punto é veiculo");
       }

       if(moto instanceof Veiculo){
        System.out.println("Moto é veiculo");
       }

       System.out.println(moto.getTipoCombustivel());

    }
}
