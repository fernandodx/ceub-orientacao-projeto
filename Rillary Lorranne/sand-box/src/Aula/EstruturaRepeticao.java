
import java.util.List;

public class EstruturaRepeticao {
public static void main(String[] args) {
    
    //i = i + 1 = i++
    for(int i=0; i <= 5; i++)
       System.out.println("Valor: " + i);
    
 //Proximo Aula lista e for melhor

 
       int contador = 0;
       while (contador < 5) {
        System.out.println("contador"+contador);
        contador++;
        
       }

       List<String> nomes = List.of("Fernando", "Fulano", "João");
      for(String nome : nomes) {
            System.out.println(nome);
      }
      



    
}
}
