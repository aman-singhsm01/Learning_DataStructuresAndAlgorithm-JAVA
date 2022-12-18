package LinearSearch;

import java.util.Arrays;

public class search_2D_array {
    public static void main(String[] args) {
        int[][] arr={{2,3,4},{5,6,7},{8,9,0}};
        int target=9;
        System.out.println(Arrays.toString(search2D(arr,target)));
    }
    static int[][] search2D(int[][] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return arr;
                }

            }

        }
        return arr;
    }
}
