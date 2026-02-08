package Arrays;
import java.util.*;

public class MoveZerostoEndBrute {
    public static void main(String[] args) {
        //Move all zeros to end of the array
        //input - arr[] = {0,1,2,3,0,4}
        //output - arr[] = {1,2,3,4,0,0}

        int arr[] = {0,1,2,3,0,4};
        List<Integer> li = new ArrayList<>();

        for(int i =0;i< arr.length;i++){
            if(arr[i]!=0){
                li.add(arr[i]);
            }
        }

        for(int i=0; i<li.size();i++){

        }

        System.out.print(li);
    }
}
