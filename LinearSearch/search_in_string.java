package LinearSearch;
import java.util.Arrays;
public class search_in_string {
    public static void main(String[] args){
        String name="amansingh";
        char target='s';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search(name,target));

    }
    static boolean search(String name, char target){
        if(name.length()==0){
            return false;
        }
//      for each loop
//      for(char element:name.toCharArray()){
//            if(element==target){
//                return true;
//            }

        for(int i=0;i<name.length();i++){
            if(target==name.charAt(i)){
                return true;
            }

        }
        return false;
    }
}
