package Exercicio5;
import java.util.*;
public class Exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String palavra;

        System.out.println("Digite uma palavra:  ");
        palavra = entrada.nextLine();

        char[] vetorInvertido = new char[palavra.length()]; 
      
        for (int i = 0; i < palavra.length(); i++){
            vetorInvertido[i] = palavra.charAt(palavra.length() - 1 - i);
        }
        
        System.out.println("Palavra ao contrário:");
        for (char c : vetorInvertido) {
            System.out.print(c);
        }
    }
}

