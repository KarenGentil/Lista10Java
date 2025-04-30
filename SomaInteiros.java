package lista10;

import java.util.Scanner;

public class SomaInteiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 0;
        long soma = 0;

        do {
            System.out.print("Digite um número inteiro: ");
            int num = sc.nextInt();
            long fat = 1;
            for (int i = 2; i <= num; i++) {
                fat *= i;
            }
            soma += fat;
            cont++;
        } while (cont < 15);

        System.out.println("Soma dos fatoriais: " + soma);

    }
}