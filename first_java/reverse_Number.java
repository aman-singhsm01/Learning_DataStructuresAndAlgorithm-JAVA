package first_java;

public class reverse_Number {
    public static void main(String[] args) {
        int x=3456;
        System.out.println(reverse(x));
    }
        static int reverse(int x) {
            int ans=0;
                while (x != 0) {
                    int rem = x % 10;
                    x = x / 10;
                    ans = (ans * 10) + rem;
                }
                if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE){
                    return ans;
                }
                return -1;
        }
    }

