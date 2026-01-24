package Functions;

import java.util.Scanner;

public class Question1 {

    public static int maximum (int a, int b, int c ){
        int maximum = 0;
        if (a>b && a>c){
            maximum = a;
        }else if(b>a && b> c){
            maximum =b;
        }else{
            maximum =c;
        }
        return maximum;
    }
    public static int minimum (int a, int b, int c ){
        int minimum = 0;
        if (a<b && a<c){
            minimum = a;
        }else if(b<a && b<c){
            minimum =b;
        }else{
            minimum =c;
        }
        return minimum;
    }
    public static void main(String[] args) {
        //Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first element :");
        int a = sc.nextInt();
        System.out.println("Enter the second element :");
        int b = sc.nextInt();
        System.out.println("Enter the third element :");
        int c = sc.nextInt();

        System.out.println("The Maximum element is :"+ maximum(a,b,c));
        System.out.println("The Minimum element is : "+ minimum(a,b,c));


    }
}
