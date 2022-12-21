package Sorting;
//Cycle Sort will only work when array is in continuous form 1 to n
//worst case: O(n)
import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args){
     int[] arr={5,3,4,1,2};
     cycle(arr);
     System.out.println(Arrays.toString(arr));
    }

    static void cycle(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctPosition= arr[i] - 1;
            if(arr[i] != arr[correctPosition]){
                swap(arr,i,correctPosition);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]= temp;
    }
}
