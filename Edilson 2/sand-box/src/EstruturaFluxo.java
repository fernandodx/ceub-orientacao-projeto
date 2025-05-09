public class EstruturaFluxo {

public static void main(String[] args) {
    
int idade = 18;

if (idade >= 18){
    System.err.println("Você é maior de idade");
}else{
    System.out.println("Sou de menor");
}

//Operador ternário
String status = (idade>=18) ? "Maior de idade" : "sou de menor";
System.out.println(status);

int dia = 1;
switch (dia) {
    case 1:
        System.out.println("Primeiro dia ");
        break;
        case 2:
        
       System.out.println("Segundo dia");
    default:
   System.out.println("Dia não encontrado");;
        break;

}

}


}
