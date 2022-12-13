package first_java;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args){
        String reverse = "";
        Scanner input=new Scanner(System.in);
        System.out.println("Enter word: ");
        String Palindrome= input.next();
        int l=Palindrome.length();
        for(int i=l-1;i>=0;i--)
            reverse = reverse + Palindrome.charAt(i);
        if(Palindrome.equals(reverse))
            System.out.println("given "+ Palindrome+" is Palindrome");
        else
            System.out.println("given "+ Palindrome+" is not Palindrome");
    }
}
