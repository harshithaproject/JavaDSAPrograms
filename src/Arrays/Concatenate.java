package Arrays;

import java.util.Arrays;

public class Concatenate {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int n = nums.length;
        int length2 =  n+n;
        int[] newArr = new int[length2];

        for(int i =0; i<length2; i++){
            while(i>length2){
                newArr[i] = nums[i];
            }
        }


        System.out.println(Arrays.toString(newArr));




    }
}