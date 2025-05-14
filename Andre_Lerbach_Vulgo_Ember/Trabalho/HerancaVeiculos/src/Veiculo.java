public abstract class Veiculo {

    // Variaveis.
    private String dono;
    private String cpf;
    private String placa;
    private String marca; // Ideal fazer por Composição.
    private String modelo; // Ideal fazer por Composição.

    // Construtor
    protected Veiculo(String dono, String cpf, String placa, String marca, String modelo) {
        this.dono = dono;
        this.cpf = cpf;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters e Setters (Encapsulamento)
    public String getDono() {
        return dono;
    }
    public String getCpf() {
        return cpf;
    }
    public String getPlaca() {
        return placa;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Metodo genérico que será sobrescrito nas subclasses
    // Aqui que vai rolar a ideia de Herança
    public abstract void acelerar();
    public abstract void frear();

    public String toString(){
        return "Dono: "+getDono()+
                "\n CPF: "+getCpf()+
                "\n Placa: "+getPlaca()+
                "\n Marca: "+getMarca()+
                "\n Modelo: "+getModelo();
    }
}