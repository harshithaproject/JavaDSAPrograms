import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {
    public static void main(String[] args) {

        String[] names = {"flower","flow","flight","fling"};

       String prefix = names[0];

       for(int i =1;i<names.length;i++ ){
           System.out.println(names[i].indexOf(prefix));
                while(names[i].indexOf(prefix) != 0){
                        prefix = prefix.substring(0,prefix.length()-1);
                }
                if(prefix.isEmpty()){
                    System.out.println("");
                }
       }
        System.out.println(prefix);

    }
}
