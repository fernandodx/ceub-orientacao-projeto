package Aula;

public class EstruturaFluxo {

     public static void main(String[] args) {
     int idade = 13;

     //if else

     if(idade >= 18){
        System.out.println("você é de maior");
        
     } else {
         System.out.println("você é menor de idade");
     }

     // operador ternário (condiçao) ? operação caso true : operação caso false

     String status = (idade >= 18) ? "maior de idade" : "menor de idade";
     System.out.println(status);

     // switch

     int dia = 2;
     switch (dia) {
         case 1:
            System.out.println("primeiro dia");
            break;
         case 2:
            System.out.println("segundo dia");
            break;
         default:
            System.out.println("dia não encontrado");
            break;
         }
    }
}
