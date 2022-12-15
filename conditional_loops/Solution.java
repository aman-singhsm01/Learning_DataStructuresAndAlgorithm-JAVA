package conditional_loops;
import java.util.Scanner;
public class Solution {
    public int subtractProductAndSum(int n) {
        Scanner in = new Scanner(System.in);
        int p = 1, s = 0, rem = 0;
        while (n > 0) {
            rem = n % 10;
            p *= rem;
            s = s + rem;
            n = n / 10;

        }
        return p-s;
    }
}
