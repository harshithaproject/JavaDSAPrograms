package Arrays;
import java.util.*;

public class LargestElementBetter {
    public static int largestElement(int[] arr){
        int largest =arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest =arr[i];
            }
        }
        return  largest;
    }
    public static void main(String[] args) {
        int[] arr = {92,12,3,411,5,7,1,107};

        System.out.println(largestElement(arr));
    }
}
