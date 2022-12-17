package Arrays;
import java.util.Scanner;
public class array_input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]+" ");
//        }
//        System.out.print(Arrays.toString(arr));

            //enhanced for loop
//        for(int num:arr){
//            arr[num]= in.nextInt();
//         }
            for (int num : arr) {  //for every element in array ,print the element
                System.out.println(num + " "); //here num represents elements of array
            }
        }
    }

