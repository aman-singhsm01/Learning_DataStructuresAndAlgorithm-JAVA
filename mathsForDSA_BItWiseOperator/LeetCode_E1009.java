package mathsForDSA_BItWiseOperator;

public class LeetCode_E1009 {
    public static void main(String[] args) {
        int n=5;
        System.out.println(bitwiseComplement(n));
    }
    public static int bitwiseComplement(int n) {
        return n ^ ((1 << Integer.toBinaryString(n).length()) - 1);
    }
}
