package mathsForDSA_BItWiseOperator;

public class even_Odd {
    public static void main(String[] args){
        int n=21;
        System.out.println(isOdd(n)); //print true for odd else false for even;
    }
    static boolean isOdd(int n){
        return (n&1)==1;
    }
}
