package mathsForDSA_BItWiseOperator;

import java.util.Arrays;

public class LeetCode_E338_CountingBits {
    public static void main(String[] args) {
        int n=5;
        System.out.println(Arrays.toString(countBits(n)));
    }

    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i == 0 ) {
                ans[i] = i;
            } else{
                int count=0;
                int x=i;
                while(x>0){
                 count++;
                 x=x&(x-1);
                }
                ans[i]=count;
            }
        }
        return ans;
    }
}
