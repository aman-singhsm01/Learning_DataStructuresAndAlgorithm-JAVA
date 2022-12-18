package LinearSearch;

public class min_max {
    public static void main(String[] args) {
    int[] arr={2,3,5,-65,2,-1,-5,34};
        System.out.println("maximum no is:"+max(arr));
        System.out.println("minimum no is:"+min(arr));

    }
    static int max(int[] arr){
        int ans=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        return ans;
    }
    static int min(int[] arr){
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
