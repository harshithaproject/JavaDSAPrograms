package Arrays;

import java.util.*;

public class LeftRotateDplace {
    public static void main(String[] args) {
        //input - arr[] ={1,2,3,4,5,6,7}
        //output - arr[] = {3,4,5,6,7,1,2}

        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int length = arr.length;
        int d = 2;
        //Making d % length is when we get d > length then we need to bring down the d value less than length .
        // So by doing % to length will bring down the value less than length
        d = d % length;
        int temp[] = new int[d];
        //Putting the d no of elements in temp new array
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        //Shifting of the elements to d places
        for (int j = d; j < arr.length; j++) {
            arr[j - d] = arr[j];
        }
        int lastlength = (length) - d;
        //arr[lastlength-1]= arr[length-1];----not necessary because it will pick up the last element also.

        //Way1
        //Putting back d elements from temp array to the original array using j
//        int j =0;
//        for(int k=lastlength;k<arr.length;k++){
//            arr[k]=temp[j];
//            j++;
//        }

        //way 2
//Putting back d elements from temp array to the original array using mathematical calculation
        //Every time you put the elements it is taking (length-d)+1
        for (int k = length - d; k < arr.length; k++) {
            arr[k] = temp[k - (length - d)];
        }

        System.out.println(Arrays.toString(arr));


//For BruteForce approach to Left rotate D places Time and Space Complexities
        //Time Complexity = O(d) +O(length-d) + O(d) =
    }
}

