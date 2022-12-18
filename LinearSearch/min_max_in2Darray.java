package LinearSearch;

public class min_max_in2Darray {
    public static void main(String[] args) {
        int[][] arr={{2,3,4},{-1,0,5},{23,43,1,-99},{4,2,1,-88}};
        System.out.println("minimum no:"+ min2d(arr));
        System.out.println("maximum no:"+ max2d(arr));

    }
    static int min2d(int[][] arr){
        int min_ans=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]<min_ans){
                    min_ans=arr[i][j];
                }
            }
        }return min_ans;
    }

    static int max2d(int[][] arr){
        int max_ans=Integer.MIN_VALUE;
        for(int[] num:arr){
            for(int element:num){
                if(element>max_ans){
                    max_ans=element;
                }
            }
        }
        return max_ans;
    }
}
