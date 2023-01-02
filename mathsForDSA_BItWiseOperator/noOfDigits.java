package mathsForDSA_BItWiseOperator;

public class noOfDigits {
    public static void main(String[] args) {
        int n=1;
        int base=2;
        int digits=(int)(Math.log(n)/(Math.log(base))+1);
        System.out.println(digits);
    }
}
