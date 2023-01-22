package MathsForDSA;

public class isPrime {
    public static void main(String[] args){
        for(int i=0;i<30;i++){
            System.out.println(i+"  " +isprime(i));
        }
    }
    static boolean isprime(int n){
        if(n <= 1){
            return false;
        }
        int c=2;
        while(c*c <= n){
            if(n % c==0){
                return false;
            }
            c++;
        }
        return true;
    }

}
