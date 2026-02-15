package BinarySearch;
import java.util.*;


public class BinarySearchBasic {
    public static void main(String[] args) {
        int[] arr = {1,4,3,5,7,10,19};
        int search = 7;
        int low = 0;
        int high = arr.length-1;

        boolean found = false;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==search){
                System.out.println("Element found at "+ mid);
                found = true;
                break;
            }else if(search>arr[mid]){
                low = mid+1;
            }else{
                high=mid-1;
            }
        }

        if(found == false){
            System.out.println("Element not found in the array");
        }
    }
}
