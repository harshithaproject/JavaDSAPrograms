package Arrays;
import java.util.*;
public class UnionSortedArrays {
    public static void main(String[] args) {
        int t1 [] = {1,1,2,3,4,5};
        int t2 [] = {2,3,4,4,5,6};
        //Union sorted arrays will be sorted originally in both the arrays will be combined into a single array which
        //will not include the duplicate elements

        Set<Integer> unionset = new TreeSet<>();
        for(int i =0;i< t1.length;i++){
            unionset.add(t1[i]);
        }
        for(int j =0;j<t2.length;j++){
            unionset.add(t2[j]);
        }
        System.out.println(unionset);

        //Time Complexity - O(N1logN + N2logN) + O(N1+N2)
        //Space Complexity - O(N1 +N2) + O(N1+N2)
    }

}
