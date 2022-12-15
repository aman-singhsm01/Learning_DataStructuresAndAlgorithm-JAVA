package conditional_loops;

import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        int max=0;
        int num=1,a=0,b=0;
        while(num!=0){
            num=in.nextInt();
            b=num;
            max=Math.max(a,b);
            a=max;
        }
        System.out.println(max);
    }
}
