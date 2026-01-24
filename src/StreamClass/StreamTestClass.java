package StreamClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTestClass {

    public static void main(String[] args) {


        //Find employee with name

        List<Employee> employee = new ArrayList<>();

        Department d1 = new Department(1,"HR",101);
        Department d2 = new Department(2,"PMO",102);
        Department d3 = new Department(3,"Development",103);
        Department d4 = new Department(4,"HR",104);
        Department d5 = new Department(5,"Development",105);



        Employee e1 = new Employee("Harshitha",101,1000,d1);
        Employee e2 = new Employee("Krishna",102,10000,d2);
        Employee e3 = new Employee("Ram",103,100000,d3);
        Employee e4 = new Employee("Sai",104,2000000,d4);
        Employee e5 = new Employee("Aravind",105,2500000,d5);
        Employee e6 = new Employee("Aravind",106,1500000,d5);



        employee.add(e1);
        employee.add(e2);
        employee.add(e3);
        employee.add(e4);
        employee.add(e5);
        employee.add(e6);



        employee.stream().filter(x -> x.getName().equals("Harshitha")).forEach(System.out::println);

        System.out.println("**************************************");

        employee.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);


        System.out.println("*************************************");
        employee.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getEmpId)).forEach(System.out::println);


        System.out.println("***************************************");


    }
}
