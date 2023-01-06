package Strings_and_StringBuilder;

public class LeetCode_E1816 {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(s,k));
    }

    public static String truncateSentence(String s, int k) {
        var count = 0;

        for (var i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ')
                count++;
            if (count == k) {
                s = s.substring(0, i);
                break;
            }
        }

        return s;
    }
}