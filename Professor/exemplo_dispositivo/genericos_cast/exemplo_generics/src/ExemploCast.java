
import java.util.ArrayList;
import java.util.List;

public class ExemploCast {

    public static void main(String[] args) {
        List<Pagamento> listaPagamento = new ArrayList<>();
        listaPagamento.add(new CartaoCredito(100.0, 1000.0));
        listaPagamento.add(new Boleto(250.0, "123123123.123123..123123..1.23123123..123123"));

        for(Pagamento p : listaPagamento) {
            p.processar();

            if(p instanceof CartaoCredito){
                CartaoCredito cartao = (CartaoCredito) p;
                Double limite = cartao.getLimiteDisponivel();
                System.out.println("Meu Limite é: "+limite);
            }

            if(p instanceof Boleto){
                Boleto boleto = (Boleto)p;
                String codbar = boleto.getCodigoBarra();
                System.out.println("Meu CodBar: "+codbar);
            }
        }
    }

}

class Pagamento {
    private Double valor;

    public Pagamento(Double valor){
        this.valor = valor;
    }

    public void processar(){
        System.out.println("Processando pagamento R$"+valor);
    }

    public Double getValor(){
        return this.valor;
    }
}

class CartaoCredito extends Pagamento {

    private Double valorLimite;

    public CartaoCredito(Double valor, Double valorLimite) {
        super(valor);
        this.valorLimite = valorLimite;
    }
    public Double getLimiteDisponivel(){
        return valorLimite - super.getValor();
    }
}
class Boleto extends Pagamento {

    private String codBar;

    public Boleto(Double valor, String codBar) {
        super(valor);
        this.codBar = codBar;
    }

    public String getCodigoBarra(){
        return this.codBar;
    }

}


