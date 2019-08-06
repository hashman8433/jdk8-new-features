package reduce;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class reduceDemo {

    @Test
    public void oldSum() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = 0;
        for (int x : numbers) {
            sum += x;
        }
        System.out.println(sum);
    }

    @Test
    public void sum() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);
    }

    @Test
    public void sumByOption() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        System.out.println(sum.get());
        Optional<Integer> max = numbers.stream().reduce(Integer::max);
        System.out.println(max.get());
        Optional<Integer> min = numbers.stream().reduce(Integer::min);
        System.out.println(min.get());
    }
}
