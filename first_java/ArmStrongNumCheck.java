package first_java;

public class ArmStrongNumCheck{
    public static void main(String[] args) {

        int num=153,count =num;
        int sum=0,rem;
        while(num>0){
            rem=num%10;
            sum=sum+rem*rem*rem;
            num=num/10;
        }
        if(sum==count) System.out.println("number is ArmStrong number");
        else System.out.println("not ArmStrong");

    }
}
