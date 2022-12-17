package Arrays;

import java.util.Arrays;

class practice {
    public static void main(String[] args) {
        int[] nums = {5,6,3,2,1,0};
        int n=3;
        int[] ans=shuffle(nums,n);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] arr=new int[2 * n];
        for (int i = 0;i < n; i++) {
            arr[2 * i] = nums[i];
            arr[2 * i + 1] = nums[n + i];
        }
        return arr;
    }
}


