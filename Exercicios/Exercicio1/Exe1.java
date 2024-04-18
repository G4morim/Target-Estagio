package Exercicio1;
import java.util.*;

public class Exe1 {
    public static void main(String[] args) {
        int indice = 13;
        int soma = 0;
        int vav = 0;

        while (vav < indice) {
            vav = vav + 1;
            soma = soma + vav;
            vav++;
        }
        System.out.println(soma);
    }
    
}

