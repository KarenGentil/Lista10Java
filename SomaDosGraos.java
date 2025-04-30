package lista10;

import java.util.Scanner;

public class SomaDosGraos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casa = 1;
        double graos = 1, total = 1;

        do {
            graos *= 2;
            total += graos;
            casa++;
        } while (casa < 64);
        System.out.printf("Total de grãos", total);
    }
}
