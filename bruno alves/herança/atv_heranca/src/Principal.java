public class Principal {
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca("11111-3");
        cp.depositar(5000.0);
        cp.consultarSaldo();
    }
}
