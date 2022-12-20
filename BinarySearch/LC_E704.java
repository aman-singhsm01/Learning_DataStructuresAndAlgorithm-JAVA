package BinarySearch;

public class LC_E704 {
    public static void main(String[] args){
        int[] arr= {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target > nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}