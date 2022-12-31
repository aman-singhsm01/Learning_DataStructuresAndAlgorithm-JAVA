package Strings_and_StringBuilder;

public class LeetCode_E1528_ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String ans=restoreString(s,indices);
        System.out.println(ans);
    }
    public static String restoreString(String s, int[] indices) {
        StringBuilder s1 = new StringBuilder(s);
        StringBuilder s2 = new StringBuilder(s);
        int n = indices.length;
        for ( int i = 0; i <n; i++ ) {
            int in = indices[i];
            s2.setCharAt(in, s1.charAt(i));

        }
        return s2.toString();
    }
}

