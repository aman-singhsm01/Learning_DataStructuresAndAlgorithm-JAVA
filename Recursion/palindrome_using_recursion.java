package Recursion;

public class palindrome_using_recursion {
    public static void main(String[] args) {
        int n = 12321;
        System.out.println(palin1(n));
    }
    public static boolean palin1(int n){
        return n==rev(n);
    }
    static int rev(int n) {
        int digits = (int) (Math.log10(n) + 1);
        return helper(n, digits);
    }

    public static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }
}