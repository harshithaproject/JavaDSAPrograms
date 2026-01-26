package Arrays;

public class SecondLargestOptimal {
    public static void main(String[] args) {
        int[] arr = {92,12,3,41,5,7,1};

        int largest =arr[0];
        int secondlargest =-1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i]>secondlargest){
                secondlargest=arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondlargest);

    }
}
