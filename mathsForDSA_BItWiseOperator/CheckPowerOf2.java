package mathsForDSA_BItWiseOperator;

public class CheckPowerOf2 {
    public static void main(String[] args){
        int n=17;
        boolean ans=(n & (n-1))==0;
        System.out.println(ans);
    }
}
