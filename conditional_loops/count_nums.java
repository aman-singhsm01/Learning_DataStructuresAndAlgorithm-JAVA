package conditional_loops;
public class count_nums
{
    public static void main(String[] args){
        int count=0;
        int num=5645;
        while (num>0){
            int rem = num % 10;
            if (rem ==5){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
    }
}
