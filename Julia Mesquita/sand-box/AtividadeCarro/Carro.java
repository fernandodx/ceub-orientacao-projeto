public class Carro {


    private String placa; 
    private String marca;
    private int ano;
    private int qtdPorta;


    public Carro (String placa, String marca, int ano, int qtdPorta){
        this.placa = placa;
        this.marca = marca;
        this.ano = ano;
        this.qtdPorta = qtdPorta;

    }

    public String getPlaca(){
        return placa;
    }
    public String getMarca(){
        return marca;
    }
    public int getAno(){
        return ano;
    }
    public int getQtdPorta(){
        return qtdPorta;

    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setQtdPorta(int qtdPorta){
        this.qtdPorta = qtdPorta;
    }

    public void ExibirInformacoes(){
        System.out.println("Placa: "+ getPlaca() + "\nMarca: "+ getMarca());
    }

    }