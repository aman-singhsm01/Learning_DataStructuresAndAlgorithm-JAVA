package BinarySearch;
//leet code medium Q162 findPeak element
//time complexity O(log n)
public class LC_M162_findPeakElement {
    public static void main(String[] args){
        int[] arr= {3,4,5,7,14,22};
        System.out.println(peakElement(arr));

    }
    public static int peakElement(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end=mid;
            }else {
                start=mid+1;
            }
        }
    return end;
    }
}
