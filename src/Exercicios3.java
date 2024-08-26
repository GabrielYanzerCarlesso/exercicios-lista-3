import java.util.Scanner;

public class Exercicios3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar um número inteiro positivo ao usuário
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        
        // Verificar se o número é positivo
        if (numero <= 0) {
            System.out.println("O número deve ser um inteiro positivo.");
        } else {
            int somaDivisores = 0;
            
            // Encontrar e somar os divisores próprios do número
            for (int i = 1; i < numero; i++) {
                if (numero % i == 0) { // i é um divisor de numero
                    somaDivisores += i;
                }
            }
            
            // Verificar se o número é perfeito
            if (somaDivisores == numero) {
                System.out.println(numero + " é um número perfeito.");
            } else {
                System.out.println(numero + " não é um número perfeito.");
            }
        }
        
        scanner.close();
    }
}
