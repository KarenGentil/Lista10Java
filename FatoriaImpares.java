package lista10;

import java.util.Scanner;

public class FatoriaImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        do {
            if (num % 2 != 0) {
                long fat = 1;
                for (int i = 2; i <= num; i++) {
                    fat *= i;
                }
                System.out.println(num + "! = " + fat);
            }
            num++;
        } while (num <= 10);

    }
}
