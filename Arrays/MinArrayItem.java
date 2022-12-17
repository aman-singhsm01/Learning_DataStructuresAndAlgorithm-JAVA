package Arrays;

public class MinArrayItem {
    public static void main(String[] args) {
        int[] num={2,3,-8,5,6,1,9};
        System.out.println(min(num));

    }
    static int min(int[] num){
        int ans=num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]<ans){
                ans=num[i];
            }
        }
        return ans;
    }
}
