package JAVA8Features;

import java.util.Random;
import java.util.function.Supplier;

public class MySupplier {
    static private Random random = new Random();

    public static void main(String[] args) {
        Supplier<String> randomName = ()->generateRandomName();
        for (int i = 0; i < 5; i++) {
            System.out.println(randomName.get());
        }
    }
    public static String generateRandomName(){
        String[] names = {"Chandan","Pankaj","Amit","Suraj","Bikash","Bikki","Sunny"};
        int random = MySupplier.random.nextInt(names.length);
        return names[random];
    }
}
