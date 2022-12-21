package Sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr={15,3,7,1,4};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
//        this loop runs n-1 times
        for(int i=0;i<=arr.length-1;i++){
            int lastElement= arr.length -i -1;
            int startElement=0;
            int max=getMaxIndex(arr,startElement,lastElement);
            swap(arr,max,lastElement);
        }
    }
    static void swap(int[] arr,int max,int last){
        int temp=arr[max];
        arr[max]=arr[last];
        arr[last]=temp;

    }
    static int getMaxIndex(int[] arr,int start,int end){
            int max=start;
            for(int i=start; i<=end;i++){
                if(arr[i]>arr[max]){
                    max=i;
                }
            }
            return max;
    }
}
