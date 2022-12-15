package conditional_loops;
import java.util.Scanner;
public class SubProductAndSumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p=1,s=0,rem=0;
        int n=in.nextInt();
        while(n>0){
            rem=n%10;
            p*=rem;
            s=s+rem;
            n/=10;
        }System.out.println(p-s);
    }
}


