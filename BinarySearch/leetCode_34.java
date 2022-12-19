package BinarySearch;

// Medium------> Find First and Last Position of Element in Sorted Array

import java.util.Arrays;

public class leetCode_34 {
    public static void main(String[] args) {
        int[] nums = {5, 5,5, 7, 7, 8, 8, 10};
        int target = 7;
        int[] output = searchRange(nums, target);
        System.out.println(Arrays.toString(output));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        //check first occurrence of target
        ans[0] = search(nums, target, true);
        //check last occurrence of target
        ans[1] = search(nums, target, false);
        return ans;

    }
    static  int  search(int[] nums,int target, boolean findStart){
            int ans=-1;
            int start=0;
            int end=nums.length-1;

            while(start <= end){
                int mid= start + (end-start)/2;
                if(target > nums[mid]){
                    start = mid + 1;
                }
                else if(target < nums[mid]){
                    end = mid - 1;
                }
                else {
                    ans = mid;
                    if(findStart){
                        end= mid-1;
                    }
                    else{
                        start= mid+1;
                    }
                }
            }
            return ans;
        }
    }

