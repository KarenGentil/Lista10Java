package lista10;

import java.util.Scanner;

public class SomatoriaDosNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1, soma = 0;
        do {
            if (i % 2 == 0) soma += i;
            i++;
            } while (i <= 500) ;
            System.out.println("Soma dos pares: " + soma);
        }
    }

