package Strings_and_StringBuilder;

public class LeetCode_M28_OccurenceOfString {
    public static void main(String[] args){
       String haystack = "sadbutsad";
       String needle = "ra";
        int ans = strStr(haystack,needle);
        System.out.println(ans);
    }
    public static int strStr(String haystack, String needle) {
            int ans =haystack.indexOf(needle);
            if(ans >= 0){
                return ans;
            }
            return -1;
        }
    }