package Exemplos.Heranca.src;

public class App {

    // Encapsulamento (agora entendível);
    private static void fiscal(Veiculo veiculo){
        veiculo.ligar();
        veiculo.exibirInfo();
    }

    public static void main(String[] args) throws Exception {

        Carro Honda = new Carro("NSX", 2000);
        Moto Yamaha = new Moto("1000CC", 2015);

        Sedan BMW = new Sedan("M3 Competition", 2022);


        // IF's não necessários, apenas para conferir se Honda e Yamaha são, definitivamente, instancias de Veiculo
        // Que são subclasses de Veiculo;

        if (Honda instanceof Veiculo) {
            System.out.println("NSX é Veículo");
        }

        if (Yamaha instanceof Veiculo) {
            System.out.println("Yamaha é veículo");
        }


        // Honda.ligar();
        // Yamaha.ligar();

        // System.out.println("\n"+Yamaha.getTipoCombustivel());

        //Honda.exibirInfo();

        fiscal(Honda);
        System.out.println("");
        fiscal(Yamaha);
        System.out.println("");
        fiscal(BMW);
    }
}
