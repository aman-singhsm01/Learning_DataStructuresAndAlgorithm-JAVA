package Arrays;

import java.util.Arrays;

public class LeetCode_E283 {
    public static void main(String[] args) {
        int[] nums={0,0,0,1};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length-1;i++) {
            int j=i+1;
            while(nums[j] > 0 && j<nums.length){
                if(nums[i]==0 && nums[j]>0){
                    swap(nums,i,j);
                }else {
                    j++;
                }
            }
        }
    }
    static void swap(int[]nums,int first,int second){
        int temp= nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}