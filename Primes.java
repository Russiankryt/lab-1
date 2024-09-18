
public class Primes {

    public static void main(String[] args) {
        // Перебираем числа от 2 до 100 включительно
        for (int i = 2; i <= 100; i++) {
            // Если число простое, выводим его
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        // Перебираем числа от 2 до n-1
        for (int i = 2; i < n; i++) {
            // Если n делится без остатка на i, то n не простое
            if (n % i == 0) {
                return false;
            }
        }
        // Если не нашлось делителей, возвращаем true, n простое
        return true;
    }
}
