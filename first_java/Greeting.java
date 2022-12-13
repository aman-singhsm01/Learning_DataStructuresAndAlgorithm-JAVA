//Take name as input and print a greeting message for that name.
package first_java;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("enter your name:");
        String name= input.next();
        System.out.println("hi, goodMorning "+name);
    }
}
