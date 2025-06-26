public class ContaBancaria {

    private double saldo;


    public void setSaldo(double valor) {
        this.saldo = valor;
    }

    public double getSaldo() {
        return this.saldo;
    }


    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
        }
    }

    private boolean sacar() {
        return false;
    }

    public void imprimirSaldo(){
        System.out.println("SALDO: " + saldo);
    }
}


