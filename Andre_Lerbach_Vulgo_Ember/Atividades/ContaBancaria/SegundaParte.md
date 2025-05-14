# CLASSE PRINCIPAL

## Início
Para você conseguir diferenciar uma classe objeto de uma classe principal (normalmente no começo, existem casos e casos), sempre procure pela linha de código:


    public static void main(String[] args){}

### Explicação:
- ```public``` é o encapsulamento.

- ```static``` indica que uma variável, método ou bloco pertence à classe (nesse caso a classe principal), e não a instâncias específicas dessa classe _// Difícil de entender, né? Não precisa entender isso por enquanto._

- ```main``` é o nome do método que a JVM procura como ponto de entrada para a execução do programa, ou seja, onde a JVM enxerga a parte em que os comandos serão executados, basicamente sua área de trabalho de forma enxuta.

<hr>

> Observações:

JVM - Java Virtual Machine.

Antes da criação do java, era comum os devs programarem em linguagens como ```C```, mas o ```C``` precisa de uma máquina física (um computador) para processar informações, e, por causa disso, o código que você fez só poderia ser utilizado naquele sistema operacional específico (já se perguntou por que existem aplicativos que só rodam em Windows, mas não rodam em MAC e Linux? É por causa disso!).

O java foi criado para que um código pudesse ser executado em qualquer máquina que tivesse o Java instalado, por isso foi criado a JVM (uma máquina virtual, que simula um computador físico, sem depender de hardwares), para que, então, qualquer código Java escrito em qualquer sistema operacional, pudesse ser executado em qualquer outro sistema operacional (um código Java feito em um Windows, poderia ser executado em um MAC e/ou Linux, desde que tivesse a JVM instalada neles)

(Ao decorrer das aulas, eu falarei mais sobre JSE, JDK, JVM e todas as outras siglas que essa linguagem possui);

## Instanciando um Objeto
    ContaBancaria jarvis = new ContaBancaria("Jarvis", "123.456.789-01");

### Explicação:

- ```ContaBancaria``` indica a classe que será instanciada;

- ```javris``` indica o nome que o objeto irá receber (todo método precisará desse nome antes de ser "chamado");

- ```= new ContaBancaria(atributos)``` é a instanciação da classe, nesse caso, os atributos do nosso objeto

> Note que os atributos foram inseridos de acordo com a declaração que fizemos NO CONSTRUTOR, repare que ```"Jarvis"``` e ```"123.456.789-01"``` da instância, seriam os valores que as variáveis ```String nome``` e ```String cpf``` que o construtor usa como argumento? Então, o construtor existe exatamente para fazer esse tipo de coisa.

    public ContaBancaria(String nome, String cpf){
        this.saldo = 500.00;
        this.nome = nome;
        this.cpf = cpf;
    }

Acredito que nessa altura, você já deve estar mais familiarizado em como a POO funciona, caso não, relaxe... Todo mês a Udemy faz um descondo, em que todos os cursos ficam por quase 40 reais, então aproveitem para estudar a programação estruturada pela Udemy (EM JAVA, PELO AMOR DE DEUS), além de barato, esses cursos também dão certificados.

## Método INFO
    jarvis.info();

### Explicação:

- ```javis``` é o nome do objeto que queremos acessar;

- ```.info()``` é o método que iremos executar;

### retorno:

    Nome: Jarvis
    CPF: 123.456.789-01
    Saldo: 500.0

## Método DEPOSITAR
    jarvis.depositar(200.0);

### Explicação:

- ```javis``` é o nome do objeto;

- ```.depositar(200.0)``` é o método a ser executado, lembrando que nessa parte precisamos inserir o argumento (que é o valor a ser adicionado na variável saldo).
### retorno:

    Depositando: 200.0
    Saldo Atual: 700.0

## Método SACAR
    jarvis.sacar(900.0);

### Explicação:

- ```javis``` é o nome do objeto;

- ```.sacar(900.0)``` é o método a ser executado, lembrando que nessa parte precisamos inserir o argumento (que é o valor a ser subtraído na variável saldo).

    - Quando o método for chamado com o valor acima da variável saldo, no caso 900.0 é maior que 700.0 (lembrando que no método anterior adicionamos 200.0 em 500.0), ele vai retornar a condição que fizemos, para esse caso...

### Retorno:

    Saldo indisponível para saque

### Observação:
Caso o método ```jarvis.sacar();``` utilizasse como argumento um valor menor de saldo, O código será retornado de outra forma, por exemplo:

    jarvis.sacar(300.0);

### retorno:

    Saque Concluído, saldo atual: 200.0

> Espero que o exercício tenha ficado mais fácil de entender
> <br>Bons estudos!

                          ####
                        ######
                      ########
                    ##########
                    ##########
                  ############
                ##############
                ############################
    ########    ############################
    ########    ############################
    ########    ############################
    ########    ############################
    ########    ############################
    ########    ##########################
    ########    ########################
    ########    ########################
    ########    ######################
    ########    ######################
