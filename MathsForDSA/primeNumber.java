package MathsForDSA;

public class primeNumber {
    public static void main(String[] args) {
        int num = 132;
        System.out.println(isPrime(num));

    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
