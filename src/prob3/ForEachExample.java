package prob3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

    public ForEachExample() {
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", "Away", "On Vacation", "Everywhere you want to be");
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        list.forEach(consumer);
    }
}
