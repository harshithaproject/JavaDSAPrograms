package Arrays;

public class SecondLargestBetter {
    public static void main(String[] args) {
        int[] arr = {92, 112, 3, 41, 5, 7, 1};

        //If array does not consits of any negative integers then take
        // second largest =-1
        //But if array consists of negative integers then take
        //second Largest = Integer.MIN_VALUE


        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            break;
        }
        System.out.println("The largest element is : "+largest);
    }

}
