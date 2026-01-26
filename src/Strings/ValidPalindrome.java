package Strings;

public class ValidPalindrome {

//    A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//    Given a string s, return true if it is a palindrome, or false otherwise.
//
//
//
//            Example 1:
//
//    Input: s = "A man, a plan, a canal: Panama"
//    Output: true
//    Explanation: "amanaplanacanalpanama" is a palindrome.

    public static void main(String[] args) {
       String s = "A man, a plan, a canal: Panama";
//String s = "race a car";
       // String s = "apple";

        String s1 = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(s1);
        //APPROACH1
//        StringBuilder s2 = new StringBuilder(s1);
//        StringBuilder s3 = new StringBuilder();
//        s3 = s2.reverse();
//        System.out.println(s3);
//        if(s2 == s3){
//            System.out.println("This is a palindrome");
//        }else{
//            System.out.println("This is not a palindrome");
//        }


//        //APPROACH 2
//        String s2 = "";
//
//        char ch[] = s1.toCharArray();
//
//        for (int i = ch.length - 1; i >= 0; i--) {
//            s2 = String.valueOf(ch);
//        }
//            if(s2.equals(s1)){
//                System.out.println("This is a palindrome");
//            }else{
//                System.out.println("This is not a Palindrome");
//            }


        //APPROACH 3 (Two Pointer Approach)


        char ch[] = s1.toCharArray();
        int left =0;
        int right = ch.length-1;
        boolean flag = false;


        while(left<right){
            if(left < right && ch[left] == ch[right]){
                flag = true;
            }else{
                flag = false;
            }
            left++;
            right--;
        }
        if(flag == true){
            System.out.println("This is a palindrome");
        }else{
            System.out.println("This is not a palindrome");
        }


    }
}
