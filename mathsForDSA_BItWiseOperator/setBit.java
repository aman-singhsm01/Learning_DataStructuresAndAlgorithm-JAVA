package mathsForDSA_BItWiseOperator;

public class setBit {
    public static void main(String[] args) {
        int n=9;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBit2(n));
    }

    //Program type 1
    static int setBit1(int n){
        int count=0;
        while(n>0){
            if((n & 1) ==1){
                count++;
            }
            n=n>>1;
        }
    return count;
    }
//    program type 2
    static int setBit2(int n){
        int count=0;
        while(n>0){
            count++;
            n=n&(n-1); //n=n-(n & -n) ---->alternate formula
        }
        return count;
    }

}