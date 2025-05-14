public class Carro extends Veiculo {

    protected Carro(String dono, String cpf, String placa, String marca, String modelo) {
        super(dono, cpf, placa, marca, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("\n" +
                            "O CARRO está correndo"+
                            "\n");
    }
    @Override
    public void frear() {
        System.out.printf("\n"+
                            "O CARRO está freando"+
                            "\n");
    }
}