package lista10;

import java.util.Scanner;

public class CalculoArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta;
        double totalArea = 0;

        do {
            System.out.print("Nome do cômodo: ");
            String nome = sc.nextLine();

            System.out.print("Largura (m): ");
            double largura = sc.nextDouble();
            System.out.print("Comprimento (m): ");
            double comprimento = sc.nextDouble();
            sc.nextLine(); // limpar buffer

            double area = largura * comprimento;
            totalArea += area;

            System.out.println("Área do " + nome + ": " + area + " m²");
            System.out.print("Deseja adicionar outro cômodo? (SIM/NAO): ");
            resposta = sc.nextLine().toUpperCase();
        } while (!resposta.equals("NAO"));

        System.out.println("Área total: " + totalArea + " m²");
    }
}
