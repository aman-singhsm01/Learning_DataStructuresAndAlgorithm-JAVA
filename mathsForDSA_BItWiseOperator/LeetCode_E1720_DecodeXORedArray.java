package mathsForDSA_BItWiseOperator;

public class LeetCode_E1720_DecodeXORedArray {
    public static void main(String[] args) {
        int[] encoded = {1,2,3};
        int first = 1;
    }
    public static int[] decode(int[] encoded, int first) {
        int[] arr=new int[encoded.length+1];
        arr[0]=first;
        for(int i=0;i<encoded.length;i++){
            arr[i+1]=arr[i]^encoded[i];
        }
        return arr;
    }
}

