public class Bubblesort {
    public static void main(String[] args) {
        int arr[] = {23,56,10,25,104,11,75};

        int temp =0;
        boolean swapped = false;
        for(int i =1; i<arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {
                if (swapped == false) {
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }
            }
        }

        for( int no : arr){
            System.out.print(no+ ",");
        }

    }
}
