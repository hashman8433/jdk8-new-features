package mapping;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

    @Test
    public void map() {
        List<Words> numbers = Arrays.asList(new Words("我没有三颗心脏"),
                new Words("公众号"), new Words("wmyskxz"));
        numbers.stream()
                .map(Words::getContent)
                .forEach(System.out::println);
    }

    @Test
    public void mapLength() {
        List<Words> numbers = Arrays.asList(new Words("我没有三颗心脏"),
                new Words("公众号"), new Words("wmyskxz"));
        numbers.stream()
                .map(Words::getContent)
                .map(String::length)
                .forEach(System.out::println);
    }

    @Test
    public void flatMap() {
        List<String> words = Arrays.asList("Hello", "World");
        words.stream()
                .map(s -> s.split(""))
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);

        words.stream()
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    @Data
    @AllArgsConstructor
    private static class Words {
        private String content;
    }
}
