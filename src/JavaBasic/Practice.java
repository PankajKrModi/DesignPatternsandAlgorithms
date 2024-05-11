package JavaBasic;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4};
        //List<Integer> list = Collections.singletonList(new int[]{1,2,3,4});
      Map<String,Integer> map = new HashMap<>();

        List<Integer> list = Arrays.asList(1, 2, 3, 3, 1, 4, 7, 8);
        list.stream().distinct().collect(Collectors.toList()).forEach(x-> System.out.println(x));

       // Comparator<Person> comparatorByAge = (p1,p2)-> Integer.compare(p1.age,p2.age);

    }

//    public static int multipleBy2(Function<Person,Integer> t){
//        int i = 0;
//        i = t.apply();
//        return i;
//    }
//
//    static class Person
//    {
//        String name;
//        Integer age;
//        public String getName(){
//            return name;
//        }
//        public Integer getAge(){
//            return age;
//        }
//
//    }
}

