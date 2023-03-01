package BinarySearch;

public class LC_E2529 {
    public static void main(String[] args) {
        int[] nums={5,20,66,1314};
        System.out.println(maximumCount(nums));
    }


    static int bisect_left(int[] nums, int target) {
        int start = 0, end = nums.length;
        while (start < end) {
            int mid = start + (end - start)/2;
            if (nums[mid] < target) start = mid+1;
            else end = mid;
        }
        return start;
    }
     static int maximumCount(int[] nums) {
        int neg = bisect_left(nums, 0);
        int pos = nums.length - bisect_left(nums,1);
        return Math.max(neg, pos);
    }
}

