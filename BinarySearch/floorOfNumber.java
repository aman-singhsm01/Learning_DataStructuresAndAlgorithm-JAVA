package BinarySearch;

// Find the floor of a number
//floor of a number = greatest number which is smaller than or equal to target

//Time complexity O(log n)

public class floorOfNumber {
    public static void main(String[] args){
        int[] arr={-2, -1, 1, 2, 4, 5, 8, 9};
        int target=3;
        int ans=floor(arr,target);
        System.out.println(ans);
    }
//     return the index : greatest number <=target              end* target start
    static int floor(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return end;   // return number : arr[end]
    }
}

