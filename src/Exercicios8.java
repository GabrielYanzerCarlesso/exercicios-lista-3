public class Exercicios8 {
    public static void main(String[] args) {
        final int QUANTIDADE_PRIMOS = 50;
        int contagemPrimos = 0;
        int numero = 101; // Começar a checar a partir do número maior que 100
        
        // Encontrar os 50 primeiros números primos maiores que 100
        while (contagemPrimos < QUANTIDADE_PRIMOS) {
            if (isPrimo(numero)) {
                System.out.println(numero);
                contagemPrimos++;
            }
            numero++;
        }
    }
    
    // Método para verificar se um número é primo
    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero == 2) {
            return true; // 2 é o único número primo par
        }
        if (numero % 2 == 0) {
            return false; // Números pares maiores que 2 não são primos
        }
        for (int i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0) {
                return false; // Número divisível por i não é primo
            }
        }
        return true;
    }
}
