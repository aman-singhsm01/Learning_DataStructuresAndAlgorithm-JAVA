package LinearSearch;

public class searchInRange{
    public static void main(String[] args){
        String word="entrepreneur";
        char target='r';
        System.out.println(search(word,target,1,10));

    }
    static boolean search(String word, char target, int start, int end){
        if(word.length()==0){
            return false;
        }

        for(int i=start;i<=end;i++){
            if(target==word.charAt(i)){
                return true;
            }
        }

        return false;
    }
}
