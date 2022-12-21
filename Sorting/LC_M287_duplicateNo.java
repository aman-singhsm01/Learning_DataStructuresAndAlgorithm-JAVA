package Sorting;
//LeetCode medium :Find the duplicate numbers   AMAZON,MICROSOFT
public class LC_M287_duplicateNo{
    public static void main(String[] args){
        int[] arr={5,1,3,4,2};
        int ans=findDuplicate(arr);
        System.out.println(ans);
    }

    static int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correctPosition=nums[i]-1;
            if(nums[i]!=nums[correctPosition]){
                swap(nums,i,correctPosition);
            }else {
                i++;
            }

            }
        for(int index=0; index<nums.length;index++){
            if(nums[index] != index+1){
                return nums[index];
            }
        }
        return -1;
    }
    static void swap(int[] nums ,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
