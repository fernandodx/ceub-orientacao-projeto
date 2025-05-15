public final class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca(String numero) {
        super(numero);
    }

    // @Override
    // public void depositar(double valor){
    //    System.out.println("Tentando sobrescrever o método depositar...");
    //}
    // A tentativa de sobrescrever o método 'final' causa um erro de compilação
}
