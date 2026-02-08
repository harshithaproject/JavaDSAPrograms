package Arrays;

import java.util.*;

public class RightRotate {
    public static void main(String[] args) {
        //input - arr[] = {1,2,3,4,5}
        //output - arr[] = {5,1,2,3,4}

        int[] arr ={1,2,3,4,5};
        int left =0;
        int right =arr.length-1;

        while(arr.length>0){
            arr[left+1]=arr[left];
            left++;
        }

        arr[0]=right;

        System.out.println(Arrays.toString(arr));
    }
}
