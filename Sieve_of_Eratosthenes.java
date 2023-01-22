package MathsForDSA;
//Sieve_of_Eratosthenes : Given a number n, print all primes smaller than or equal to n
public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        int n=40;
        boolean[] prime=new boolean[n+1];
        seive(n,prime);

    }
    static void seive(int n,boolean[] prime){
        for(int i=2 ; i*i<=n ; i++){
            if(!prime[i]){
                for(int j= 2*i;j<=n;j+=i){
                    prime[j]=true;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(!prime[i]){
                System.out.print(i+" ");  //print all false values ---> prime numbers
            }
        }
    }
}
