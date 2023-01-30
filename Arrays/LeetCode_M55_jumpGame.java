package Arrays;

public class LeetCode_M55_jumpGame {
    public static void main(String[] args) {
       int[] nums = {2,3,1,1,4};
       boolean ans=canJump(nums);
        System.out.println(ans);
    }
    public static boolean canJump(int[] nums) {
        boolean ans=false;
        int step=0;
        int i=0;
        while(i < nums.length-1){
            step=nums[i];
            i=i+step;
            if(i== nums.length-1){
                ans=true;
            }
        }
        return ans;
    }
}

