

public class ContaBancaria {
    String nomeDoTitular;
    double saldo;
    String tipoConta;

    public ContaBancaria (String nomeDoTitular, double saldo, String tipoConta) {
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public void depositarValor(double valor) {
        if(valor>0) {
            saldo += valor;
            System.out.println("O saldo atual é "+ saldo);
        }
        else {
            System.out.println("Insira um valor positivo");
        }

    }
    public void sacarValor(double valor) {
        if (saldo>=valor) {
            saldo-= valor;
            System.out.println("O saldo atual é "+ saldo);
        } 
        else {
            System.out.println("Não é possivel realizar o saque, insira um valor maior");
        }
    }
    public void exibirInformacoes() {
        System.out.println("Nome: "+ nomeDoTitular);
        System.out.println("Saldo: "+ saldo);
        System.out.println("Tipo da Conta: "+ tipoConta);
    }
}

