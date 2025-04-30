package lista10;

import java.util.Scanner;

public class SomaPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0, soma = 0;
        int num;

        do {
            System.out.print("Digite um número: ");
            num = sc.nextInt();
            if (num >= 0) {
                soma += num;
                count++;
            }
        } while (num >= 0);

        if (count > 0)
            System.out.println("Média: " + (soma / (double) count));
        else
            System.out.println("Nenhum valor positivo foi inserido.");
    }
}
