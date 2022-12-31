package Strings_and_StringBuilder;

public class performance {
    public static void main(String[] args) {
       //string builder --> builder
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<11;i++){
            char seq=(char)('a'+i);
            builder.append(seq);  //cdefghijk
        }
        System.out.println(builder.toString());
        builder.delete(0,2); //cdefghijk
        System.out.println(builder);
        builder.reverse();  //kjihgfedc
        System.out.println(builder);
        builder.insert(0,'a');  //akjihgfedc
        System.out.println(builder);
        builder.deleteCharAt(0);
        System.out.println(builder);
        builder.replace(0,2,"a");
        System.out.println(builder);
        builder.isEmpty();
        System.out.println(builder);
    }
}
