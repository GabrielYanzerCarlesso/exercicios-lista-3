import java.util.Scanner;

public class Exercicios6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Solicitar um número ao usuário
            System.out.print("Digite um número para ver a tabuada (número negativo para sair): ");
            int numero = scanner.nextInt();
            
            // Verificar se o número é negativo para encerrar o programa
            if (numero < 0) {
                System.out.println("Número negativo recebido. Encerrando o programa...");
                break;
            }
            
            // Exibir a tabuada do número
            System.out.println("Tabuada do " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
        
        scanner.close();
    }
}
