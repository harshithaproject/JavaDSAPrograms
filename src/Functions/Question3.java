package Functions;

import java.util.Scanner;

public class Question3 {
    public static boolean triplet(int num1, int num2, int num3){
        boolean pythagorean = false;
        int square1 = num1 * num1;
        int square2 = num2 * num2;
        int square3 = num3 * num3;
        if(square1 + square2 == square3){
            pythagorean = true;
        }else if (square2 + square3 == square1){
            pythagorean = true;
        }else if (square3 + square1 == square2){
            pythagorean = true;
        }else{
            pythagorean = false;
        }
        return  pythagorean;
    }
    public static void main(String[] args) {
        //Write a function to check if a given triplet is a Pythagorean triplet or not.
        // (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first element :");
        int a = sc.nextInt();
        System.out.println("Enter the second element :");
        int b = sc.nextInt();
        System.out.println("Enter the third element :");
        int c = sc.nextInt();
        if(triplet(a,b,c) == true) {
            System.out.println("The given  number is Pythagorean triplet");
        }else{
            System.out.println("The given number is  not a Pythagorean triplet");
        }

    }
}
