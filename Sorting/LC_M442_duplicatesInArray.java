package Sorting;

import java.util.ArrayList;
import java.util.List;

public class LC_M442_duplicatesInArray {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        List<Integer> ans= findDuplicates(nums);
        System.out.println((ans));
    }

        public static List<Integer> findDuplicates(int[] nums) {
            int i = 0;
            while (i < nums.length) {
                int correctPosition = nums[i] - 1;
                if (nums[i] != nums[correctPosition]) {
                    swap(nums, i, correctPosition);
                } else {
                    i++;
                }
            }

            List<Integer> ans = new ArrayList<>();
            for (int index = 0; index < nums.length; index++) {
                if (nums[index] != index + 1) {
                    ans.add(nums[index]);
                }
            }
            return ans;
        }
    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
