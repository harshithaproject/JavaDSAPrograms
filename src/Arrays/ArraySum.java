package Arrays;

import java.util.Arrays;

public class ArraySum {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] newArr = new int[arr.length];
        for(int i =0;i<arr.length;i++) {
            for (int j = 1; j < arr.length; j++) {
//                newArr[0] = arr[0];
//                newArr[1] = arr[0]+ arr[1];
//                newArr[2] = arr[0]+ arr[1]+ arr[2];
                newArr[i] = arr[i]+arr[j];
                //System.out.println(newArr[i]);
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
