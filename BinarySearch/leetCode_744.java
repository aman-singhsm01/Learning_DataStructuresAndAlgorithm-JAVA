package BinarySearch;

//Find smallest letter greater than target
//letters wrap around means :return again 0th index
public class leetCode_744 {
    public static void main(String[] args) {
    char[] arr={'f','r','s','u','z'};
    char target='u';
    char ans=nextGreatestLetter(arr,target);
        System.out.println(ans);
    }
    public static char nextGreatestLetter(char[] letters, char target) {

        int start=0;
        int end=letters.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
            }else {
                 start =mid+1;
            }
        }
        return letters[start % letters.length];
    }
}
