package LinearSearch;
//leet code- 852 Peak Index in a mountain array

public class LeetCode852_peakIndex {
    public static void main(String[] args) {
        int[] num = {0,1,0};
        int ans=linearSearch(num);
        System.out.println(ans);
    }
    //brute force soln
    //soln is also available in more optimised using binary search
    static int linearSearch(int[] num){
       int max=Integer.MIN_VALUE;
       for(int index=0; index<num.length;index++){
           if(num[index]>max){
               max=num[index];
           }
       }
        return max;
    }
}