package BinarySearch;

public class LS_410_SplitArrayLargestSum {
    public static void main(String[] args) {

    int[] arr={7,2,5,10,8};
    int m=3;
        System.out.println(SplitArray(arr,m));

    }
    static int SplitArray(int[] nums,int m){
        int start=0;
        int end=0;

        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
        while(start<end){
//            find middle for the potential answer
            int mid=start+(end-start)/2;

//            calculate how many subarrays/pieces it will divide in with the max sum
            int sum=0;
            int pieces=1;
            for(int num:nums) {
                if (sum + num > mid) {
//                    you cannot add this in subarray make new one and add from sum=num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
                if(pieces>m){
                    start=mid+1;
                }else{
                    end=mid;
                }
            }
        return end;
    }
}

