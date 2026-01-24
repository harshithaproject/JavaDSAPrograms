package Arrays;
import java.util.*;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int[] newArr = new int[arr.length];
        int n=3;



        for(int i=0;i<arr.length;i++) {
            for(int j =i+n;j< arr.length;j++){

                newArr[i]=arr[j];
            }
        }
        System.out.println(Arrays.toString(newArr));


    }
}
