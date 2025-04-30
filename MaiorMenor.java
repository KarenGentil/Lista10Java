package lista10;

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;

        do {
            System.out.print("Digite um número (negativo para sair): ");
            num = sc.nextInt();
            if (num >= 0) {
                if (num > maior) maior = num;
                if (num < menor) menor = num;
            }
        } while (num >= 0);

        if (maior != Integer.MIN_VALUE)
            System.out.println("Maior: " + maior + " | Menor: " + menor);
        else
            System.out.println("Nenhum valor positivo foi informado.");

    }
}
