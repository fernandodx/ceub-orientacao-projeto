# Trabalho POO - Herança

[Link do UML](https://miro.com/app/board/uXjVI4bLKbY=/)

> Participantes:
> - André de Alencar;
> - Edilson Nogueira;
> - Bruno Alves;

### Super Classe Veiculo.

Começando na SuperClasse ``Veiculo``, começamos declarando as variáveis:

-     private String dono;
-     private String cpf; 
-     private String placa; 
-     private String marca; // Ideal fazer por Composição.
-     private String modelo; // Ideal fazer por Composição.

Depois vem o Construtor:

    protected Veiculo(String dono, String cpf, String placa, String marca, String modelo) {
        this.dono = dono;
        this.cpf = cpf;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

Logo após os métodos Getters e Setters, justamente por estarmos privando todas as variáveis da SuperClasse Veiculo (Encapsulamento).

- Getters:


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

- Setters:


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

Abaixo teremos os métodos genéricos que serão reescritos pelas subclasses:

    public abstract void acelerar();
    public abstract void frear();

Por fim, para listarmos as variáveis e exibir no terminal, colocamos um toString():

    public String toString(){
        return "Dono: "+getDono()+
                "\n CPF: "+getCpf()+
                "\n Placa: "+getPlaca()+
                "\n Marca: "+getMarca()+
                "\n Modelo: "+getModelo();
        }
    }

## Sub Classes ``Carro`` e ``Moto``.
Carro e Moto são extremamente parecidos, mas seus métodos são reescritos diferentemente:

- ``Carro:``

        @Override
            public void acelerar() {
                System.out.println("\n" +
                                    "O CARRO está correndo"+
                                    "\n");
            }

        @Override
            public void frear() {
                System.out.printf("\n"+
                                    "O CARRO está freando"+
                                    "\n");
            }
- ``Moto:``

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
