# Classe Objeto

## Início
O código começa em ContaBancaria.java. Note que toda programação orientada a objeto (POO), sempre vai começar com a classe objeto, ou seja, seu objeto (normalmente o objeto principal, ou a super classe, que você não precisa entender por enquanto), sempre será o primeiro arquivo que você deve criar.

## Estrutura Inicial
O código a seguir é criado automaticamente. O ```package``` vai indicar em qual pasta e projeto ele pertence...

    package Atividades.ContaBancaria.src

### Note o seguinte:

- ```Package``` é o nome do comando;

- ```Atividades``` é o nome da pasta principal;

- ```.ContaBancaria``` é o nome da classe, ou seja, do arquivo que estamos editando;

- ```.src```, na tradução seria "source", que é a pasta onde a classe [ContaBancaria] está contida;

Depois disso, o próprio arquivo já vem com a declaração da classe:

    public class ContaBancaria;

### Explicando:

- ```public``` quer dizer sobre o encapsulamento da classe, toda classe (na maioria dos casos), ela deve ser pública;

- ```class``` indica que a linha de código se trata de uma classe;

- ```ContaBancaria``` é o nome da classe que, por padrão, deve ser declarada com a primeira letra maiúscula e, caso possua mais de uma palavra, ela deve estar junta e também iniciar com letra maúscula (CanetaEsferográfica,CarteiraDeTrabalho);

**Logo a baixo iremos declarar as variáveis desse objeto que nomeamos de ContaBancaria**

    public class ContaBancaria {
        Double dinheiro;
        Double saldo;
        String nome;
        String cpf;

### Explicando:

- ```String nome``` para informar o nome da pessoa que possui a ContaBancaria;

- ```Double saldo``` para informar o saldo ATUAL da ContaBancaria;

- ```String cpf``` variável de informação, só para encher linguiça... // mostrar o cpf da pessoa

- ```Double dinheiro``` para informar o dinheiro QUE VAI ENTRAR OU SAIR da ContaBancaria;

## Construtor
    public ContaBancaria(String nome, String cpf){
        this.saldo = 500.00;
        this.nome = nome;
        this.cpf = cpf;
    }

### Explicação:

O construtor vai basicamente apontar quais variáveis do objeto serão recebidos no momento da instanciação. De forma resumida, as viaráveis que estão nos parêntesis do construtor, apontam na memória para as variáveis declaradas no objeto, onde serão inseridas na instanciação do objeto (explicação de instanciação na SegundaParte.md, mas leia toda a primeira parte primeiro 👍);

## Métodos
### Explicação:
- Exemplo:

        public void caminhar(Double km){
            System.out.println("Andando: "+km);
        }

- ```public``` diz respeito ao encapsulamento, nesse caso, ela é pública, de uma maneira simples, ela é simples de ser acessada por qualquer classe em qualquer lugar;

- ```void``` é o tipo de retorno do método, nesse caso, ele não retorna nenhum valor (não precisa entender sobre isso agora, mas no exercício de Encapsulamento abordarei mais sobre isso, fique tranquilo(a));

- ```caminhar``` é o nome do método;

- ```caminhar(Double km)``` O valor entre parentesis é o argumento, que, de forma porcamente resumida, é um valor que necessita entrar para que o método funcione;


# Explicação de Cada Método

### Método DEPOSITAR
    public void depositar(Double dinheiro){
        System.out.println("Depositando: "+dinheiro);
        System.out.print("Saldo Atual: ");
        System.out.println(saldo+dinheiro);
    }

### Explicação:

Como já expliquei a estrutura de um método, aqui vou explicar como esse método funciona;

Nesse método em específico, eu coloquei o argumento ```Double dinheiro``` para que quando o método for "chamado" na classe principal, você seja obrigado a colocar um valor no parentesis, facilitando (e não precisando de um scanner para coletar valores a partir de uma leitura de tecla) a inserção de valores;

> Observação: os métodos desse exercício são chamados na classe principal (explicação na SegundaParte.md, mas, novamente, leia essa primeira parte, depois se aventure na SegundaParte 👌)

- Por exemplo:

        jarvis.depositar(200.0);

- ```jarvis``` é o nome da classe;

- ```.depositar``` é o método a ser utilizado
                    (200.0) é o valor que a variável dinheiro vai receber;
### Retorno:
                Depositando: 200.0
                Saldo atual: 700.0

                // (Vai ser 700.0, pois no construtor, o saldo inicial foi declarado já como 500.0 [linha 38]);

## Método SACAR
    public void sacar(Double dinheiro){
        if (saldo-dinheiro <= 0){
            System.out.println("Saldo indisponível para saque");
        } else {
            System.out.println(saldo-dinheiro);
        }
    }

### Explicação:
Nesse método, será feito o saque da conta (reduzir o valor de saldo), no método anterior foi feito o depósito (aumentar o valor de saldo);

A diferença do outro para esse, é que, o valor de ```saldo``` será subtraído do valor de ```dinheiro```, mas o problema não é apenas esse, quase nenhum banco te permite ter a conta-corrente com saldo negativo, então teremos de utilizar uma condicional, nesse caso eu escolhi fazer por if/else;

> Estrutura de if/else nesse método:

    if (saldo-dinheiro <= 0){

        System.out.println("Saldo indisponível para saque");

        } else {
            System.out.print("Saque Concluído, saldo atual: ");
            System.out.println(saldo-dinheiro);
    }

Dessa forma, caso o cálculo para o saque for menor ou igual a 0, o código não irá permitir a redução do valor.
### Retorno caso saldo-dinheiro <=0

    Saldo indisponível para saque.

Caso contrário, será feito a redução do valor (sim, você pode retornar operações com println em várias linguagens, fazemos isso para reduzir linhas de código, mas não é uma boa prática).
### Possível retorno caso saldo-dinheiro > 0

    Saque Concluído, saldo atual: 300.0


## Método INFO

    public void info() {
        System.out.println("\n Nome: "+nome+
                            "\n CPF: "+cpf+
                            "\n Saldo: "+saldo);
    }

### Explicação:
Se você conseguiu entender os métodos anteriores, você já deve saber o que esse faz;

#### O comando:

    System.out.prinln()
Possui diversas formas diferentes de ser utilizado e, nesse caso, normalmente utilizado para reduzir linhas de código, pode ser feito ```System.out.prinln("\n texto:"+variável)```

- O ```"\n "``` indica para pular uma linha, nesse caso, você pode criar um único ```System.out.prinln()``` para "retornar"(no sentido de aparecer no console) vários valores de uma vez só!

> Fim da primeira parte, continue na SegundaParte.md;
