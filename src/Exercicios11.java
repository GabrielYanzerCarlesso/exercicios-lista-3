import java.util.Scanner;

public class Exercicios11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para armazenar a soma das idades e a contagem
        int somaIdadeHomens = 0;
        int contagemHomens = 0;
        int somaIdadeMulheres = 0;
        int contagemMulheres = 0;
        
        while (true) {
            System.out.print("Digite o sexo (M - Masculino, F - Feminino) ou qualquer outro caractere para parar: ");
            char sexo = scanner.next().toUpperCase().charAt(0);
            
            // Verificar se o sexo é válido
            if (sexo != 'M' && sexo != 'F') {
                break;
            }
            
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            
            // Acumular as idades e contagens de acordo com o sexo
            if (sexo == 'M') {
                somaIdadeHomens += idade;
                contagemHomens++;
            } else if (sexo == 'F') {
                somaIdadeMulheres += idade;
                contagemMulheres++;
            }
        }
        
        // Calcular e exibir as médias
        if (contagemHomens > 0) {
            double mediaIdadeHomens = (double) somaIdadeHomens / contagemHomens;
            System.out.println("Média da idade dos homens: " + mediaIdadeHomens);
        } else {
            System.out.println("Nenhum dado de idade de homens foi fornecido.");
        }
        
        if (contagemMulheres > 0) {
            double mediaIdadeMulheres = (double) somaIdadeMulheres / contagemMulheres;
            System.out.println("Média da idade das mulheres: " + mediaIdadeMulheres);
        } else {
            System.out.println("Nenhum dado de idade de mulheres foi fornecido.");
        }
        
        scanner.close();
    }
}
