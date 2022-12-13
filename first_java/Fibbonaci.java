package first_java;
import java.util.Scanner;
public class Fibbonaci {
    public static void main(String[] args) {
        int num, sum=0 ,count=1,a=0,b=1,temp=0;
        Scanner input=new Scanner(System.in);
        num= input.nextInt();
        System.out.println(count);
        while( num>count){
            sum=a+b;
            a=b;
            b=sum;
            System.out.println(sum);
            count++;
        }
    }
}

