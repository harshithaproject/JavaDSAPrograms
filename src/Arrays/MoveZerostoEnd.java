package Arrays;
import java.util.*;


public class MoveZerostoEnd {
    public static void main(String[] args) {
        //Move all zeros to end of the array
        //input - arr[] = {0,1,2,3,0,4}
        //output - arr[] = {1,2,3,4,0,0}

        int arr[] = {0,1,2,3,0,4};
        int j=1;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]==0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
