import java.util.Scanner;

public class Exercicios2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar o número A
        System.out.print("Digite o valor de A (número inteiro positivo): ");
        int A = scanner.nextInt();
        
        // Solicitar o número B
        System.out.print("Digite o valor de B (número inteiro positivo e maior que A): ");
        int B = scanner.nextInt();
        
        // Verificar se A é menor que B e se ambos são positivos
        if (A <= 0 || B <= 0 || A >= B) {
            System.out.println("Certifique-se de que A e B são inteiros positivos e que A < B.");
        } else {
            int somaDivisiveisPor5 = 0;
            boolean encontrouDivisiveis = false;
            
            // Iterar pelo intervalo [A, B]
            for (int i = A; i <= B; i++) {
                if (i % 5 == 0) {
                    // Encontrou um número divisível por 5
                    System.out.println(i);
                    somaDivisiveisPor5 += i;
                    encontrouDivisiveis = true;
                }
            }
            
            // Exibir a soma dos números divisíveis por 5
            if (encontrouDivisiveis) {
                System.out.println("Soma dos números divisíveis por 5: " + somaDivisiveisPor5);
            } else {
                System.out.println("Nenhum número divisível por 5 encontrado no intervalo.");
            }
        }
        
        scanner.close();
    }
}
