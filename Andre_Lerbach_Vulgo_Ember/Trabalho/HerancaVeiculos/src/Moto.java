public class Moto extends Veiculo{

    protected Moto(String dono, String cpf, String placa, String marca, String modelo) {
        super(dono, cpf, placa, marca, modelo);
    }

    @Override
    public void acelerar() {
        System.out.println("\n" +
                            "A MOTO está empinando"+
                            "\n");
    }
    @Override
    public void frear() {
        System.out.printf("\n"+
                "A MOTO está freando"+
                "\n");
    }
}
