package Arrays;

import java.util.*;

public class LeftRotateDplaceOptimal {
    public static int[] reverse(int[] arr,int start,int end){
        //Using two pointer approach where both left and right pointers are moving
        while(start<=end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
      return arr;
    }
    public static void main(String[] args) {
        //input - arr[] ={1,2,3,4,5,6,7}
        //d =2 (no of places to left rotate)
        //output - arr[] = {3,4,5,6,7,1,2}

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d =3;
        int n = arr.length;
        System.out.println(Arrays.toString(reverse(arr,d,d)));


    }

    //Time Complexity = O(d) + O(n-d) + O(n)(Reversing the entire array) = O(2n)
    //Space Complexity = O(1)
}
