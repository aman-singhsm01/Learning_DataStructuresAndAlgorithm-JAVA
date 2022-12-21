package Sorting;
public class LC_E268_MissingNo {
    public static void main(String[] args){
       int[] arr={0,1,2,3,5};
       missingNo(arr);
       System.out.println(missingNo(arr));      //returning missing number
    }
    static int missingNo(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctPosition=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correctPosition]){
                swap(arr,i,correctPosition);
            }
            else{
                i++;
            }
        }
        //it will check whether every elements are in their correct position
        for(int index=0;index<arr.length;index++) {
            if (arr[index] != index) {
                return index;
            }
        }
       //if all element are in their correct position then return arrays length
        return arr.length;
    }
    static void swap(int[] arr,int first,int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
