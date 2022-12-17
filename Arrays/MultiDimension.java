package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MultiDimension {
    public static void main(String[] args) {
        int[][] a = {
                {2, 3, 4, 6},
                {5, 6, 7},
                {8, 9, 0}
        };
        System.out.println(a.length);
        System.out.println(Arrays.toString(a));

//        2D array taking input
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][2];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}

//        2D array taking input only using nested for loop
//        int[][] arr2d=new int[3][3];
//        for(int row=0;row<arr2d.length;row++){
//            for(int col=0;col<arr2d.length;col++){
//                arr2d[row][col]= in.nextInt();
//            }
//        }
//        for(int row=0;row< arr2d.length;row++){
//            for(int col=0;col<arr2d.length;col++){
//                System.out.print(arr2d[row][col]+" ");
//            }
//            System.out.println();
//        }


//      printing multidimensional array using enhanced for loop
//    int[][] d={
//            {2,3,4,5},
//            {2,8},
//            {3,6,4,9,23}
//    };
//        for(int[] x:d ){
//            System.out.println(Arrays.toString(x));}


