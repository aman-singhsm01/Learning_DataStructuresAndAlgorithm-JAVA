package Sorting;

import java.util.ArrayList;
import java.util.List;
//LeetCode easy  Find all numbers disappeared in an Array  GOOGLE
public class LC_E448_disappearedArray {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> ans=findDisappearedNumbers(arr);
        System.out.println(ans);
    }

        public static List<Integer> findDisappearedNumbers(int[] nums) {
            int i = 0;
            while (i < nums.length) {
                int cposition = nums[i] - 1;
                if (nums[i] != nums[cposition]) {
                    swap(nums, i, cposition);
                } else {
                    i++;
                }
            }
            // finding missing numbers
            List<Integer> ans = new ArrayList<>();
            for (int index = 0; index < nums.length; index++) {
                if (nums[index] != index + 1) {
                    ans.add(index + 1);
                }
            }
            return ans;
        }

        static void swap(int[] nums, int first, int second) {
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        }
    }

