package Sorting;
import java.util.Arrays;
//best case : O(n)
//worst case : O(n^2)
public class insertionSort {
    public static void main(String[] args){
        int[] arr={5,-1};
        insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertion_sort(int[] arr){
        for(int i=0; i<arr.length-1;i++){
            for(int j=i+1; j>0;j--){
                if(arr[j] < arr[j-1]){               //if j<j-1 swap
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr,int first,int end){
        int temp=arr[first];
        arr[first]=arr[end];
        arr[end]=temp;
    }
}
