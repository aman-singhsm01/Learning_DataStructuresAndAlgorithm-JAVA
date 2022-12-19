package BinarySearch;

//Time complexity O(log n)
//floor   -> greatest number <= to target
//ceiling -> smallest number >= to target

public class ceilingFloorInDescendingOrderArray {
    public static void main(String[] args) {
        int[] arr={67,34,8,5,4,3,2,-10,-15};
        int target=1;
        int ans1=ceiling(arr,target);
        int ans2=floor(arr,target);
        System.out.println("ceiling index "+ans1);
        System.out.println("floor index "+ans2);
    }
    static int ceiling(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                end=mid-1;
            }
            else if(target<arr[mid]){
                start=mid+1;
            }
            else return mid;

        }
//        since this is descending order array : ceiling = end
        return end;
    }

    static int floor(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                end=mid-1;
            }
            else if(target<arr[mid]){
                start=mid+1;
            }
            else return mid;

        }
//        since this is descending order array: floor = start
        return start;
    }

}
