package Strings;

import java.util.Scanner;

public class TwoPointerPalindrome {

    public static boolean validPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        char ch[] = s.toCharArray();
        int left = 0;
        int right = ch.length - 1;

        while (left < right) {
            if (ch[left] != ch[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String reverseString(String s) {
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s3 = reverseString(s);

        System.out.println(s3);
        if (validPalindrome(s) == false) {
            System.out.println("This is not a palindrome");
        } else {
            System.out.println("This is a palindrome String");
        }

    }
}
