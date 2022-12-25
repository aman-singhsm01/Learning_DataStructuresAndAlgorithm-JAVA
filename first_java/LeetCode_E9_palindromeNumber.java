package first_java;

public class LeetCode_E9_palindromeNumber {
    public static void main(String[] args) {
        int num=141;
        boolean ans= isPalindrome(num);
        System.out.println(ans);
    }
    public static boolean isPalindrome(int x) {
        String reverse = "";
        String Palindrome=Integer.toString(x);
        int l=Palindrome.length();
        for(int i=l-1;i>=0;i--)
            reverse = reverse + Palindrome.charAt(i);
        if(Palindrome.equals(reverse))
            return true;
        else
            return false;
    }
}
