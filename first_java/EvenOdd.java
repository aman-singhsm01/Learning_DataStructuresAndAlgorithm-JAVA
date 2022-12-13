package first_java;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        System.out.println("enter num:");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        if(num%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}
