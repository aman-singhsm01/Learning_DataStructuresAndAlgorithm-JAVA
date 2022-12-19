package BinarySearch;

public class search_element {
    public static void main(String[] args) {
        int[] num={-8,-2,-1,0,2,4,6,8,9,23,99};
        int target=4;
        System.out.println();
        int ans=binarySearch(num,target);
        System.out.println("Target element "+num[ans] +" is found at index " +ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start=0;
        int end= arr.length-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
                if (target > arr[mid]) {
                    start = mid + 1;

            }   else if (target < arr[mid]) {
                    end = mid - 1;

            }   else {
                    return mid;
            }
        }
        return -1;
    }
}
