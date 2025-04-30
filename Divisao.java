package lista10;

import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o dividendo: ");
        int dividendo = sc.nextInt();

        System.out.print("Digite o divisor: ");
        int divisor = sc.nextInt();

        int quociente = 0;

        do {
            if (dividendo >= divisor) {
                dividendo -= divisor;
                quociente++;
            }
        } while (dividendo >= divisor);

        System.out.println("Quociente inteiro: " + quociente);
    }
}
