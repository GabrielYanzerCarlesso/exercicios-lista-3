import java.util.Scanner;

public class Exercicios1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar um número inteiro positivo ao usuário
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        
        // Verificar se o número é positivo
        if (numero <= 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
        } else {
            int totalPares = 0;
            int totalImpares = 0;
            int somaPares = 0;
            int somaImpares = 0;
            
            // Loop para contar e somar pares e ímpares
            for (int i = 1; i <= numero; i++) {
                if (i % 2 == 0) { // Verifica se o número é par
                    totalPares++;
                    somaPares += i;
                } else { // Caso contrário, o número é ímpar
                    totalImpares++;
                    somaImpares += i;
                }
            }
            
            // Exibir os resultados
            System.out.println("Total de números pares: " + totalPares);
            System.out.println("Soma dos números pares: " + somaPares);
            System.out.println("Total de números ímpares: " + totalImpares);
            System.out.println("Soma dos números ímpares: " + somaImpares);
        }
        
        scanner.close();
    }
}
