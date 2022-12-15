package functions_methods;

import java.util.Scanner;

public class max_min {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("enter three numbers: ");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int maxi=maximum(a,b,c);
        System.out.println("maximum no is "+maxi);
        int mini=minimum(a,b,c);
        System.out.println("minimum no is "+mini);
    }

    static int minimum(int a,int b ,int c){
        int min=a;
        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }
        return min;
    }


    static int maximum(int a,int b,int c){
       int max=a;
       if(b>max){
           max=b;
       }
       if(c>max){
           max=c;
       }
       return max;
    }
}
