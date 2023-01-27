package Recursion;

public class LeetCode_E1342 {
    public static void main(String[] args) {
        int n=14;
        System.out.println(numOfSteps(n));
    }
    static int numOfSteps(int num){
        return helper(num,0);
    }
    static int helper(int num,int step){
        if(num==0){
            return step;
        }
        if(num % 2 ==0){
            return helper(num/2,step+1);
        }
        return helper(num-1,step+1);
    }
}
