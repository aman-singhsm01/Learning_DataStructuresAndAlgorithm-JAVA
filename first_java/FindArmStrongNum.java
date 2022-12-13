//print armstrong no from the given range
package first_java;
import java.util.Scanner;
public class FindArmStrongNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r, lower, upper;
        int check, rem, sum = 0;
        System.out.print("enter lower range");
        lower = input.nextInt();
        System.out.print("enter upper range:");
        upper = input.nextInt();
        while (lower < upper) {

            check = lower;
            while (check != 0) {
                rem = check % 10;
                sum = sum + (rem * rem * rem);
                check = check / 10;
            }
            lower = lower + 1;
            if (sum == lower) {
                System.out.println("arm strong num");
            }

        }

    }}