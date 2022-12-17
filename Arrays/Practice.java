package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] rno=new int[5];
//        int[] rno1={2,3,4,5,6};

         String[] name={"aman","chotan","kuldeep"};
        System.out.println(Arrays.toString(name));
        System.out.println(name[1]);
        name[2]="ankit";
        System.out.println(Arrays.toString(name));

        String[] nickname=new String[5];
        System.out.println(nickname[3]);

    }
}


