package BinarySearch;
//find the ceiling of a number in array
//ceiling -> smallest number which is greater than or equal to target element

//Time complexity O(log n)
public class ceilingOfNumber {
    public static void main(String[] args) {
        int[] nums = {-2, -1, 1, 2, 4, 5, 8, 9};
        int target = 6;
        int ans = ceiling(nums, target);
        System.out.println(ans);
    }

    static int ceiling(int[] arr, int target) {
        if(target>arr[arr.length-1]){
            return -1;
        }

//     return the index : smallest number >=target
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
//      start = ceiling       end  target  start*
        return start;
    }
}
