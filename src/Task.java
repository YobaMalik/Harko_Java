import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Task {
    public void checkNumber(Number number){
        if (number.doubleValue() > 7.0) System.out.println("Привет");
    }
    public void checkName (String name){
        if (name.trim().toLowerCase().equals("вячеслав")){
            System.out.println("Привет, Вячеслав");
        } else{
            System.out.println("Нет такого имени");
        }
    }
    public void checkMultiple(Scanner scanner){
        scanner.nextLine();
        String numbers = Arrays.toString(Stream.of(scanner.nextLine().trim().split(" ")).
                filter(e -> Double.parseDouble(e) % 3 == 0).toArray());
        System.out.println(numbers);
    }
}
