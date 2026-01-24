package Arrays;

import java.util.Arrays;

public class Concatenate {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        int n = nums.length;
        int length2 =  n+n;
        int[] newArr = new int[length2];

        for(int i =0;i<n;i++){
            newArr[i]= nums[i];
        }

        for(int j =0;j< nums.length;j++){
            newArr[j+n] = nums[j];
        }

        System.out.println(Arrays.toString(newArr));

    }
}