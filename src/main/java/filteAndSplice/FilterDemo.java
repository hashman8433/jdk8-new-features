package filteAndSplice;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo {

    @Test
    public void streamExecuteOnce() {
        System.out.println("streamExecuteOnce");
        List<String> title = Arrays.asList("Wmyskxz", "Is", "Learning", "Java8", "In", "Action");
        Stream<String> s = title.stream();
        s.forEach(System.out::println);
//        s.forEach(System.out::println);
    }

    @Test
    public void filter() {
        System.out.println("filter");
        List<String> words = Arrays.asList("wmyskxz", "say", "wow", "to", "everybody");
        List<String> filteredWords = words.stream()
                                        .filter(word -> word.startsWith("w"))
                                        .collect(Collectors.toList());
        System.out.println(filteredWords);
    }

    @Test
    public void distinct() {
        System.out.println("distinct");
        List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 2, 1, 3, 4);
        numbers.stream()
                .filter(integer -> integer % 2 == 0)
                .distinct()
                .forEach(System.out::println);
    }

    @Test
    public void limit() {
        System.out.println("limit");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        numbers.stream()
                .filter(integer -> integer % 2 == 0)
                .limit(3)
                .forEach(System.out::println);
    }

    @Test
    public void skip() {
        System.out.println("skip");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        numbers.stream()
                .filter(integer -> integer % 2 == 0)
                .skip(2)
                .forEach(System.out::println);
    }

}
