//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package first_java;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter num1: ");
        int num1=input.nextInt();
        System.out.print("enter num2: ");
        int num2=input.nextInt();
        System.out.print("enter operator: ");
        char op=input.next().charAt(0);
        if(op=='+') System.out.println(num1 + num2);
        else if(op=='-') System.out.println(num1 - num2);
        else if(op=='*') System.out.println(num1 * num2);
        else if(op=='/') System.out.println(num1 / num2);

    }
}
