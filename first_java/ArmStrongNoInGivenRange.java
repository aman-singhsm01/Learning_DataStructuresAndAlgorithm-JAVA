package first_java;

public class ArmStrongNoInGivenRange {
    public static void main(String[] args) {
        int rem=0,sum=0,num;
        for(int i=1;i<=1000; i++) {
             num = i;
            while (num> 0)
            {
                rem = num % 10;
                sum = sum + (rem * rem * rem);
                num=num/10;

            }
            if(sum==i){
                System.out.println(i);
            }
            sum=0;
        }
    }
}
