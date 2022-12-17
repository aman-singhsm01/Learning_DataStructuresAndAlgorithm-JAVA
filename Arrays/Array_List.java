package Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class Array_List {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> List=new ArrayList<>(10);
//        taking input using for loop
        for(int i=0;i<5;i++){
            List.add(in.nextInt());
        }
        for(int i=0;i<5;i++){
            System.out.println(List.get(i));
        }
        System.out.println(List);
//        List.add(2443);
//        List.add(3423);
//        System.out.println(List.contains(2443));
//        System.out.println(List);
//        List.set(0,999);
//        System.out.println(List);


    }
}
