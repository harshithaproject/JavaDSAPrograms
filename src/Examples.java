import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.*;
import java.lang.Double;

public class Examples
{
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(100, 150, 21, 30, 40, 30, 50, 300);

        //int result = nums.stream()
        // .reduce(0,(a,b)->a+b);

        // OptionalDouble result = nums.stream().mapToInt(n-> n).average();---- Find averga

        // Stream<Integer> result = nums.stream().sorted(); //Print all sorted elements

        // Stream<Integer> result =  nums.stream().distinct(); // Print distinct elements
        // long  result = nums.stream().count(); // To print the count or no of elements flown to the stream

        //Stream <Integer> result = nums.stream()
        //  .filter(itr -> String.valueOf(itr).startsWith("3")); // Print elements starts with prefix "3"

        //Set<Integer> result =  nums.stream()
        //  .filter(itr -> Collections.frequency(nums,itr)>1).collect(Collectors.toSet());


        //Optional<Integer> result = nums.stream().sorted(Collections.reverseOrder()).distinct().limit(3).skip(2).findFirst();
        //result.forEach(n -> System.out.println(n));


        //System.out.println(result);
        //Print Even and odd numbers from the list.

//String name = "Happynewyear";
//
// List<String> nameList = Arrays.asList(name);
//        for (String s : nameList) {
//            System.out.println(s);
//        }
//Stream<String> finalstream = nameList.stream().distinct();
//
//finalstream.forEach(n -> System.out.println(n));
//
//
//List<Character> ch = name.chars()
//        .mapToObj(c->(char)c)
//        .distinct()
//        .collect(Collectors.toList());
//
//for(Character c: ch){
//    System.out.print(c);
//}

//List<Integer> order = Arrays.asList(10,20,10,10,20,30,85,55,85,12,35,24,24);
//
//Stream<Integer> ordered = order.stream().sorted().distinct();
//

        List<Integer> nums1 = Arrays.asList(1, 2, 3, 4, 1, 10, 11, 8);

        Optional<Integer> secondHighest = nums1.stream()
                .distinct()
                .sorted((a, b) -> b - a)
                .skip(2)
                .findFirst();

        Stream<Integer> streamnums = nums1.stream()
                .distinct().sorted((a, b) -> b - a);
        //streamnums.forEach(n-> System.out.println(n));
        //  System.out.println(secondHighest.get());


        String inputstring = "Hey You,I love to stay in Delhi or Gurgaon";

        List<Character> ch = Arrays.asList('a', 'e', 'i', 'o', 'u');

        String lowerinputstring = inputstring.toLowerCase();

        long countvalue = lowerinputstring.chars().mapToObj(c -> (char) c).filter(ch::contains).count();

        // System.out.println(countvalue);


        List<Integer> prices = Arrays.asList(2000, 3000, 4000, 1000, 5000, 8000);

        Integer sum = prices.stream().reduce(0, (a, b) -> a + b);  // Total salaries of all the employees

        Optional<Integer> highestprice = prices.stream().distinct().sorted((a, b) -> b - a).findFirst();

        List<Integer> lowerprices = prices.stream().sorted().filter(itr -> itr < 4000).collect(Collectors.toList());

        // lowerprices.forEach(n -> System.out.println(n));


        List<String> names = Arrays.asList("Sai", "Ganesh", "Anuradha", "Murthy", "Pallavi", "Chandrika");


        List<String> lowernames = names.stream().map(String::toLowerCase).collect(Collectors.toList());

        //System.out.println(lowernames);


        //Sort a list of names in reverse alphabetical order

        List<String> reversenames = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());


        //  System.out.println(reversenames);


//
//
//        int values[] = new int[]{10,10,20,20,30,40,40,40,55,55,55,55,55};
//
//
//        for(int i =0;i<values.length;i++){
//
//            boolean flag = false;
//
//            for(int j =i;j<values.length;j++){
//                if(i!=j && (values[i]==values[j])){
//                    flag = true;
//                }
//            }
//
//            if (flag== false){
//                System.out.println(values[i]);
//            }
//        }


        String str = "Hello World";

        //Find the frequency of each element in a string
        Map<Character, Long> output = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        List<Integer> numbers = Arrays.asList(10, 10, 20, 20, 30, 40, 40, 40, 55, 55, 55, 55, 55, 80);

        Map<Integer, Long> output2 = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //System.out.println(output2);

        Optional<Integer> result = output2.entrySet().stream().filter(n -> n.getValue() == 1).map(n -> n.getKey()).findFirst();//Print First Non repeated elements from the list


        //Print all the non repeated elements from the list
        Stream<Integer> result1 = output2.entrySet().stream().filter(n -> n.getValue() == 1).map(n -> n.getKey());

        //Print first repeated elements from the list.

        Optional<Integer> result2 = output2.entrySet().stream().filter(e -> e.getValue() > 1).map(e -> e.getKey()).findFirst();

        //Print all the repeated elements from the list.

        Stream<Integer> result3 = output2.entrySet().stream().filter(e -> e.getValue() > 1).map(e -> e.getKey());

        //result3.forEach(n -> System.out.println(n));


        OptionalInt value = numbers.stream().mapToInt(n -> n).max();

        System.out.println(value.getAsInt());
    }
}

