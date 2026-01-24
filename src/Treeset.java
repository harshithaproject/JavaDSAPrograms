import java.util.TreeMap;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<String> treeset = new TreeSet();
        treeset.add("Geeks");
        treeset.add("for");
        treeset.add("Geeks");
        treeset.add("GeeksforGeeks");

        for(String temp : treeset){
            System.out.println(temp);

//            System.out.println("\n");
        }

    }
}
