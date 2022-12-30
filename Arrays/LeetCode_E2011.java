package Arrays;

public class LeetCode_E2011 {
    public static void main(String[] args){
        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }
    public static int finalValueAfterOperations(String[] op) {
        int sum=0;
        int n=op.length;
        for(int i=0;i<n;i++){
            if(op[i].equals("X++") || op[i].equals("++X")) sum++;
            else if(op[i].equals("X--") || op[i].equals("--X"))  sum--;
        }
        return sum;
    }
}
