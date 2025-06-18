public class ContaBancaria {
    protected String numero;
    protected double saldo;

    public ContaBancaria(String numero){
        this.numero = numero;
        this.saldo = 0.0;
    }

    public final void depositar(double valor){
        if (valor > 0){
            saldo += valor;
        System.out.println("Depósito realizado. Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void consultarSaldo(){
        System.out.println("Número da conta: " + numero);
        System.out.println("Salto atual: " + saldo);
    }
}
