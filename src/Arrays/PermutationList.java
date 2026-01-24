package Arrays;
import java.util.Arrays;

public class PermutationList {

    public static int[]  permutation(int[] nums){
        int [] newArray = new int[nums.length];
        for(int i =0; i< nums.length ; i++){
            newArray[i] =  nums[nums[i]];
        }
        return newArray;
    }
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        int [] arr = permutation(nums);
        System.out.println(Arrays.toString(arr));
    }
}
