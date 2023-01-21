package MathsForDSA;

public class LeetCode_E70 {
    public static void main(String[] args) {
        int n=2;
        System.out.println(climbStairs(n));
    }
    public static int climbStairs(int n) {
        if (n<2)
            return 1;
        int first=1;
        int second=1;
        int third=0;
        for(int i=2;i<=n;i++)
        {
            third=first+second;
            first=second;
            second=third;
        }
        return third;
    }
}

