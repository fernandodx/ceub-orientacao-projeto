public class App {

    private static void fiscalizar(Veiculo veiculo){
        veiculo.ligar();
        veiculo.exibirInfo();
    }

    public static void main(String[] args) throws Exception {
        Carro punto = new Carro("punto", 2010);
        Moto r18 = new Moto("r18", 2024);
        Sedan corolla = new Sedan("corolla", 2021);

        fiscalizar(punto);
        fiscalizar(r18);
        fiscalizar(corolla);


        punto.ligar();
        punto.exibirInfo();

        r18.ligar();
        r18.exibirInfo();
        
        if(punto instanceof Veiculo){
            System.out.println("Punto é veículo");
        }

        if(r18 instanceof Veiculo){
            System.out.println("Moto é veículo");
        }

        System.out.println(r18.getTipoCombustivel());

    }
}
