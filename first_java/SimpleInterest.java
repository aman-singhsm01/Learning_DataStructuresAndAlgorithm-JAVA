package first_java;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("enter principle amount:");
        int P=input.nextInt();
        System.out.print("enter time: ");
        int T=input.nextInt();
        System.out.print("enter Rate:");
        int R=input.nextInt();
        float SI= (P*R*T)/100;
        System.out.println("Simple interest = "+SI);
    }
}
