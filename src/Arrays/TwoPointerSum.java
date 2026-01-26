package Arrays;

public class TwoPointerSum {

    public static void main(String[] args) {
            int [] arr = {2,3,4,7,11,15};
                    //{1,2,3,4,5,19};
            int target =10;
            boolean found = false;
            int left=0;
            int right = arr.length-1;

            while(left<right){
                int sum = arr[left] + arr[right];

                if(sum == target){
                    System.out.println(left+" & "+ right);
                    found = true;
                    break;
                }else if(sum > target){
                    right--;
                }else{
                    left++;
                }
            }

            if(found == false){
                System.out.println("Element not found to match the sum");
            }
    }
}
