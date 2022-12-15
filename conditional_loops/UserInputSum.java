package conditional_loops;

import java.util.Scanner;

public class UserInputSum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=0,b=0,sum=0,num=1;
        while(num!=0){
            num=in.nextInt();
            a=num;
            sum=sum+a;
        }
        System.out.println(sum);
    }
}
