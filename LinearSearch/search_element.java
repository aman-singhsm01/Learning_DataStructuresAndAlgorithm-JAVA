package LinearSearch;

public class search_element {
    public static void main(String[] args){
        int[] num={21,5,6,8,9,8,0};
        int target=0;
        int ans=linear(num,target);

        System.out.println(ans);
    }

    static int linear(int[] arr,int target){
        if(arr.length==0){
            System.out.println(arr.length);
            return -1;
        }
        for(int index=0;index<arr.length;index++){
            int element=arr[index];
            if(element == target){

                return index;
            }

//    for printing element
//    for(int element:arr){
//            if(element == target) {
//
//                return element;
//            }
    }
        return -1;
    }
}
