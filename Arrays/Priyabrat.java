package Arrays;

public class Priyabrat {
    public static void main(String[] args) {
        int[] arr={5,6,3,1,7,2,3};
        System.out.println((sol(arr)));
    }
    static int sol(int[] arr) {
        int[] fans=new int[arr.length];
        int ans=0;
        int i = 1;
        while (i < arr.length) {
            if (arr[i] == add(arr[i - 1], arr[i + 1]) || arr[i]==sub(arr[i - 1], arr[i + 1]) || arr[i]==multi(arr[i - 1],arr[i + 1]) || arr[i] == div(arr[i - 1],arr[i + 1]) || arr[i]==mod(arr[i - 1],arr[i+1])){
                ans=arr[i];
                fans[i]=ans;


            }
            else{
                i++;
            }
        }return fans[i];
    }


    static int add(int a ,int b){
        return a+b;
    }
    static int sub(int a ,int b){
        return a-b;
    }
    static int multi(int a ,int b){
        return a*b;
    }
    static int div(int a ,int b){
        return a/b;
    }
    static int mod(int a ,int b){
        return a%b;
        }
    }
