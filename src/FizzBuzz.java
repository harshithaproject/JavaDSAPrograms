import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 10;

        List<String> answer = new ArrayList<>();
        if(n%3==0 && n%5 ==0 ){
            answer.add("FizzBuzz");
        }else if(n%3==0){
            answer.add("Fizz");
        }else if(n%5==0){
            answer.add("Buzz");
        }else{
            answer.add("i");
        }

        System.out.println(answer);
    }
}
