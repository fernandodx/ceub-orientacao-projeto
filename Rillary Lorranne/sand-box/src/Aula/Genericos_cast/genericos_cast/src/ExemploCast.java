import java.util.ArrayList;
import java.util.List;

public class ExemploCast {

    public static void main(String[] args) {
        List<Pagamento> listaPagamento = new ArrayList<Pagamento>();
        listaPagamento.add(new CartaoCredito(100.0, 1000.0));
        listaPagamento.add(new Boleto(250.0, "123123123.123123..123123..1.23123123..123123"));

        for(Pagamento p : listaPagamento) {
            p.Processar();

            if(p instanceof CartaoCredito) {
                CartaoCredito cartao = (CartaoCredito) p;
                 Double getLimiteDisponivel = cartao.getLimiteDisponivel();
                System.out.println("Meu Limite é: " +getLimiteDisponivel); 

            }

            if(p instanceof Boleto) {
                Boleto boleto = (Boleto) p;
                String CodBarra = boleto.getCodBarra();
                System.out.println("Codigo de Barra: " + CodBarra);
            }
        }
    }

}

class Pagamento {
    private Double Valor;

    public Pagamento(Double Valor) {
        this.Valor = Valor;
    }

    public void Processar() {
        System.out.println("Processando pagamento R$" + Valor);
    }

    public Double getValor() {
        return this.Valor;
    }
}

class CartaoCredito extends Pagamento {

    private Double ValorLimite;

    public CartaoCredito(Double Valor, Double ValorLimite) {
        super(Valor);
        this.ValorLimite = ValorLimite;
    }

    public Double getLimiteDisponivel() {
        return ValorLimite - super.getValor();
    }

}

class Boleto extends Pagamento {
    
    private String CodBarra;

    public Boleto(Double Valor, String CodBarra) {
        super(Valor);
        this.CodBarra = CodBarra;
    }

    public String getCodBarra() {
        return this.CodBarra;
    }
    
}
