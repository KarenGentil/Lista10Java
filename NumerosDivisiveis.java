package lista10;

import java.util.Scanner;

public class NumerosDivisiveis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1;
        do {
            if (i % 4 == 0) System.out.println(i);
            i++;
        } while (i < 200);
    }
}
