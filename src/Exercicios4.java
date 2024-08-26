import java.util.Scanner;

public class Exercicios4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Solicitar a dupla de valores
            System.out.print("Digite o primeiro valor: ");
            int valor1 = scanner.nextInt();
            
            System.out.print("Digite o segundo valor: ");
            int valor2 = scanner.nextInt();
            
            // Verificar se os valores são iguais
            if (valor1 == valor2) {
                System.out.println("Os valores são iguais. Encerrando...");
                break;
            }
            
            // Determinar se a dupla está em ordem crescente ou decrescente
            if (valor1 < valor2) {
                System.out.println("A dupla está em ordem crescente.");
            } else {
                System.out.println("A dupla está em ordem decrescente.");
            }
        }
        
        scanner.close();
    }
}
