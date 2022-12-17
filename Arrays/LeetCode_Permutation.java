package Arrays;

import java.util.Arrays;

public class LeetCode_Permutation {
    public static void main(String[] args) {
//       0 2 1 5 3 4 -------> 0 1 2 4 5 3
        int[] nums = {2,1,3,4,0};
        int[] output=buildArray(nums);
        System.out.println(Arrays.toString(output));

    }

    static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i : nums) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}