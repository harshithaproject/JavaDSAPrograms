package Arrays;

import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {6,4,7,8,4,1,4};
        int num =4;
        int temp=0;

        for(int i =0;i<arr.length;i++){
            if(arr[i]==num){
               temp =i;
               break;
            }
        }
        System.out.println(temp);
    }
}
