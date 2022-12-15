package functions_methods;

import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
//        int add=sum();
//        System.out.println(add);
//        String gr=greet();
//        System.out.println(gr);
//        String cool= "rohit";
//        names(cool);
//        System.out.println(cool);
//        String ram=names("singh");
//        System.out.println(ram);
        vararg("aman","chotan","afdsd");

    }

    static int sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("enter num1 and num2 :");
        int num1 = in.nextInt();
        int num2=in.nextInt();
        int sum1=num1+num2;
        return sum1;
    }
    static String greet(){
        String greeting="hi Aman how are you";
        return greeting;
    }
    static String names(String name){
        name="aman";
        return name;
    }
    static void vararg(String...v){
        System.out.println(Arrays.toString(v));
    }
}