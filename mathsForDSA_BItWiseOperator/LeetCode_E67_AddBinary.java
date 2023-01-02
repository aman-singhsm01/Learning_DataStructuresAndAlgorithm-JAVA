package mathsForDSA_BItWiseOperator;
import java.util.Scanner;
public class LeetCode_E67_AddBinary {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.print("Enter number 1 :");
        String x=in.next();
        System.out.print("Enter number 2 : ");
        String y=in.next();

        int sum=Integer.parseInt(x,2)+Integer.parseInt(y,2);


        System.out.println(Integer.toBinaryString(sum));
    }
}
