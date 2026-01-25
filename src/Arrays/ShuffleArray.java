package Arrays;
import java.util.*;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4, 7};
        int[] newArr = new int[arr.length];
        int left = 0;
        int right = left +3;

        for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[left];
                left++;
                newArr[i] = arr[right];
                right++;


        }
        System.out.println(Arrays.toString(newArr));

    }

}
