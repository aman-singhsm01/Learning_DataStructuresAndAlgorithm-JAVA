package mathsForDSA_BItWiseOperator;

public class LeetCode_M7_ReverseInteger {
    public static void main(String[] args) {
        int x=20;
        System.out.println(reverse(x));
    }
    public static int reverse(int x) {
        long ans = 0;
        while(x != 0) {
            ans = ans * 10 + (x % 10);
            x /= 10;
        }
        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) ans;
        }
    }
}

