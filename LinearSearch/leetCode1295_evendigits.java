package LinearSearch;

public class leetCode1295_evendigits {
    public static void main(String[] args) {
        int[] arr = {-2,-2};
        System.out.println((even(arr)));
    }

    static int even(int[] nums) {
        int fcount=0;
        for(int i = 0; i <nums.length; i++) {
            int count = 0;
            int num=nums[i];
            while (num>0){
                count++;
                num=num/10;
            }
            if(count%2==0){
                fcount++;

            }
        }
        return fcount;
    }

}