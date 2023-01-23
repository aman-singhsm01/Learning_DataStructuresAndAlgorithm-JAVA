package MathsForDSA;

import java.util.ArrayList;

public class factors {
    public static void main(String[] args){
        int n=20;
        factors2(n);
    }
//    time complexity O(n)
    static void factors(int n){
        for(int i=1; i <= n; i++){
            if(n % i==0){
                System.out.print(i+" ");
            }
        }
    }
//    O(sqrt(n))
    static void factors1(int n){
        for(int i=1;i<= Math.sqrt(n);i++){
            if(n/i == i){
                System.out.print(i + " ");
            }
            else{
                System.out.print(i +" " + n/2 +" ");
            }
        }
    }
//    sort the factors1 --> with time ans space complexity O(sqrt(n))
    static void factors2(int n){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i< Math.sqrt(n);i++){
            if(n/i == i){
                System.out.print(i + " ");
            }
            else{
                System.out.print(i+" ");
                list.add(n/i);
            }
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
}
