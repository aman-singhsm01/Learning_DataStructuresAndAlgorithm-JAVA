package BinarySearch;
//leetCode Q852 peak index in a Mountain Array
//time complexity O(n)
public class LC_E852_peakIndex {
    public static void main(String[] args) {
    // bitonic array - array value first increasing and then decreasing
    int[] num={2,4,5,1};
    int ans=binarySearch(num);
        System.out.println(ans);
    }
//    this code will only work in bitonic array
    public static int binarySearch(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
          int mid=start+(end-start)/2;
          if(arr[mid]<arr[mid+1]){
              start=mid+1;
          }
          else if(arr[mid]<arr[mid-1]){
              end=mid-1;
          }
          else{
              return mid;
          }
        }
        return -1;
    }
}
