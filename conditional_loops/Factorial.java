package conditional_loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i=0,fact=1;
        int num=in.nextInt();
        while(num!=i){                  //num>i  --->it can also be used
            fact*=num-i;
            i++;

        }
        System.out.println(fact);

    }
}
