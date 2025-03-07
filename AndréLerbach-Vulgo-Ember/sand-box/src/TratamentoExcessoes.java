import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TratamentoExcessoes {
    public static void main(String[] args) {

        System.out.println("");
        try {

            int resultado = 10/0;
            System.out.println(resultado);

        } catch (ArithmeticException e) {
            System.out.println("Você tentou divisão por 0, NAUM PODI");
        }

        try {
            Scanner scanner = new Scanner (new File("arquivo.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
