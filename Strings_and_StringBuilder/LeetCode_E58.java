package Strings_and_StringBuilder;

public class LeetCode_E58 {
    public static void main(String[] args) {
        String  s = "Hello World";
        System.out.println(lengthOfLastWord(s) );
    }
        public static int lengthOfLastWord(String s) {
            int i = s.length()-1;
            int count = 0;
            while(s.charAt(i) == ' ') {
                i--;
            }
            while(s.charAt(i) != ' ') {
                count++;
                i--;
                if(i < 0) {
                    return count;
                }
            }
            return count;
        }
    }


