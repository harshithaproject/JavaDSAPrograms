package Arrays;
import java.util.*;

public class LargestElementBrute {
    public static void main(String[] args) {
        int[] arr = {92,12,3,41,5,7,1};
        Arrays.sort(arr);
        System.out.println("The largest element is the last element in the array as it is in ascending order    "+arr[arr.length-1]);
    }
}
