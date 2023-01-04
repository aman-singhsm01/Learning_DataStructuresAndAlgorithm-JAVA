package Strings_and_StringBuilder;

public class LeetCode_E2114 {
    public static void main(String[] args) {
       String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
       int ans=mostWordsFound(sentences);
        System.out.println(ans);
    }
    public static int mostWordsFound(String[] sentences) {
        int count=0;
        for(String s:sentences){
            int len=s.split(" ").length;
            count=Math.max(count,len);
        }
        return count;

    }
}