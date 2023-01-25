package Recursion;

public class print_nto1 {
    public static void main(String[] args){
        int n=5;
        ans2(n);
    }
    static void ans(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        ans(n-1);

    }
//    printing 1 to 5
    static void ans2(int n){
      if(n==0){
          return;
      }
      ans2(n-1);
      System.out.println(n);
    }
}
