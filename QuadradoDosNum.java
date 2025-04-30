package lista10;

import java.util.Scanner;

public class QuadradoDosNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 15;
        do{
            System.out.println(i+ "² = "+(i*i));
            i++;
        } while(i<= 200);
    }
}
