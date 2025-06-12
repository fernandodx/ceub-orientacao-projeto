import java.util.List;

public class EstruturaRepeticao {

public static void main(String[] args) {

    // 1 = 1 + 1 == 1++
    //for
for(int i=1; i <= 5; i++){
System.out.println("Valor: " +i);
}


    //While
int contador = 0;
while(contador < 5) {
    System.out.println("contador" + contador);
    contador++;
}

     //Aula lista

List<String> nomes = List.of("Fernando", "Brunão", "Cauã", "Andre", "Lucas");
for(String nome : nomes) {
    System.out.println(nome);
}



}

}
