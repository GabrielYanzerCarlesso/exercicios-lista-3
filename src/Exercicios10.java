import java.util.Scanner;

public class Exercicios10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        while (true) {
            System.out.print("Digite um número inteiro positivo (ou 0 para parar): ");
            num = scanner.nextInt();

            // Se o número for 0, saia do loop
            if (num == 0) {
                System.out.println("Programa encerrado.");
                break;
            }

            // Se o número for negativo, peça um número positivo
            if (num < 0) {
                System.out.println("Por favor, insira um número positivo.");
                continue;
            }

            // Realize a multiplicação e impressão
            int produto = 1;
            for (int i = 1; i <= num; i++) {
                produto *= i;
                System.out.println("Produto até " + i + ": " + produto);
            }
        }
        scanner.close();
    }
}
