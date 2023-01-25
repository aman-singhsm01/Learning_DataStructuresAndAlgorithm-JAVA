package MathsForDSA;

public class LeetCode_1998 {
    public static void main(String[] args) {
        int[] nums = {7,21,3};
        System.out.println(gcdSort(nums));
    }
    public static boolean gcdSort(int[] nums) {
        boolean ans=false;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(nums[j] <nums[j-1] && gcd(nums[j],nums[j-1])==nums[i]){
                    swap(nums,j,j-1);
                }else{
                    break;
                }
            }

            for(int k=1;k<nums.length;k++){
                if(nums[k]<nums[k-1]){
                    ans=true;
                }
            }
        }
        return ans;
    }

    public static void swap(int[] arr,int first ,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static int gcd(int a ,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}
