package Recursion;

public class binarySearchUsingRecursion {
    public static void main(String[] args){
        int[] arr={2,3,54,60,78};
        int target=60;
        int ans=search(arr,target,0,arr.length);
        System.out.println(ans);
    }
    static int search(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(target==arr[mid]){
            return mid;
        }
        if(target<arr[mid]){
            return search(arr,target,s,mid-1 );
        }
        else{
            return search(arr,target,mid+1,e);
        }
    }
}
