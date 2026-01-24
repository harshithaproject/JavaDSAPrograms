package Functions;

import java.util.Scanner;

public class Question2 {

    public static boolean evenorodd(int number ){
        boolean evenodd =false;
        if(number %2 ==0){
            evenodd = true;
        }
        return  evenodd;
    }
    public static void main(String[] args) {
        //Define a program to find out whether a given number is even or odd.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input number");
        int input = sc.nextInt();
        if(evenorodd(input) == true) {
            System.out.println("The given  number is Even");
        }else{
            System.out.println("The given number is Odd");
        }


    }
}
