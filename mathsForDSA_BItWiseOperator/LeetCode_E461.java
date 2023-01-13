package mathsForDSA_BItWiseOperator;

public class LeetCode_E461 {
    public static void main(String[] args){
    int x = 1;
    int y = 4;
        System.out.println(hammingDistance(x,y));
    }
    public static int hammingDistance(int x, int y) {
        int a=x^y; //XOR both will give 1 when there is opposite bits
        int count=0; //count no of 1's
        while(a>0){
            count++;
            a=a&(a-1);
        }
        return count; //print no of 1's
    }
}

