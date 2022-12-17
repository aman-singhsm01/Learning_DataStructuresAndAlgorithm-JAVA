package Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class MutliD_ArrayList {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> List=new ArrayList<>(10);

//        initialization
        for(int i=0;i<3;i++){
            List.add(new ArrayList<>());
        }

//        add elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                List.get(i).add(in.nextInt());
            }

        }
        System.out.println(List);
    }
}
