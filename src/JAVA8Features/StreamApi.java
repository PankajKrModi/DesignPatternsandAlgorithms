package JAVA8Features;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApi {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(200,"harry","A",26,"Bengaluru",2018,"M"));
        employeeList.add(new Employee(500,"har","B",21,"Kolkata",2015,"F"));
        employeeList.add(new Employee(100,"Monu","C",19,"Mumbai",2015,"M"));
        employeeList.add(new Employee(100,"ha","A",30,"Kolkata",2015,"M"));
        employeeList.add(new Employee(300,"Marry","A",19,"Mumbai",2019,"F"));
        employeeList.add(new Employee(100,"Sonu","C",20,"Mumbai",2015,"M"));

        List<Employee> sortedEmployeeList = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getAge)).collect(Collectors.toList());

       // sortedEmployeeList.forEach(e-> System.out.println(e.getSalary() + " " + e.getAge()));

        //1st sort by salary then Age and then group by City
        Map<String,List<Employee>> empPerCity =  employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getAge))
                .collect(Collectors.groupingBy(Employee::getCity));

        for(Map.Entry<String,List<Employee>> empEntry : empPerCity.entrySet()){
            System.out.print(empEntry.getKey() + " City ---->");
            empEntry.getValue().forEach(employee -> System.out.println(employee.toString()));
            System.out.println();
        }

        //Finding the Count of Male and Female Employees
        Map<String,Long> noOfMaleandFemaleEmployee = employeeList.stream().collect(
                Collectors.groupingBy(Employee::getGender,Collectors.counting())
        );

        System.out.println("Number of male and female emp :"+noOfMaleandFemaleEmployee);

        //Print name of All Departments
        employeeList.stream().map(employee -> employee.getDepartment()).distinct().forEach(System.out::println);

        //print number of employees in each department
        Map<String,Long> employeeCountforEachDept =  employeeList.stream().collect(
                Collectors.groupingBy(Employee::getDepartment,Collectors.counting())
        );

        System.out.println("Number of employess int each department "+employeeCountforEachDept);

        //find oldest employee
        Optional<Employee> oldestEmp = employeeList.stream()
                .max(Comparator.comparingInt(Employee::getAge));
        System.out.println(oldestEmp.get());

        //find department with highest number of employees
        Map.Entry<String, Long> maxNoOfEmployeesInDept =  employeeList.stream().collect(
                Collectors.groupingBy(Employee::getDepartment,Collectors.counting())
        ).entrySet().stream().max(Map.Entry.comparingByValue()).get()
        ;

        System.out.println("Maximum number of employees: "+maxNoOfEmployeesInDept);

        //Find employees by age range ...using partition
        Map<Boolean,List<Employee>> employessPartionedByAge = employeeList.stream()
                .collect(Collectors.partitioningBy(e -> e.getAge() >= 20));
        System.out.println("Employess partitioned by age: "+employessPartionedByAge);


        //Finding Employee Count in Every Department
        Map<String,Long> numberofEmpPerDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));

        //Printing Average Salary of Each Department
        Map<String, Double> avgSalary = employeeList.stream().collect(Collectors.groupingBy(
                Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)));

        //Finding the Highest Salary in the Organization
        Optional<Employee> empHighest = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .findFirst();


        //Finding the Highest Salary Based on Department:

        System.out.println("Highest salary dept wise:: \n" + employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream().max(Comparator.comparingDouble(Employee::getSalary))
                        )
                )));


    }

}
