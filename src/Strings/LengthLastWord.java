package Strings;
import java.util.*;

public class LengthLastWord {
    public static void main(String[] args) {
        String input ="Hello World";
        String arr[] = input.split(" ");
        String lastword = arr[arr.length-1];
        int length = lastword.length();
        System.out.println(length);
    }
}
