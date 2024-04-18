package Exercicio2;

import java.util.*;

public class Exe2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int vav = 0;
        int vav2 = 1;
        boolean verdadeiro = false;

        System.out.println("Digite um número: ");
        numero = entrada.nextInt();

        while (vav<=numero) {
            if(vav==numero){
                verdadeiro = true;
                break;
            }
            int temp = vav;
            vav=vav + vav2;
            vav2 = temp;
        }
        if(verdadeiro){
            System.out.println("O numero pertence a sequencia");
        }else{
        System.out.println("O numero não pertence a sequencia");
        }
    }
}
