package searchAndMatch;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo {

    @Test
    public void numberAnyEven() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        if (numbers.stream().allMatch(i -> i % 2 == 0)) {
            System.out.println("集合里有偶数");
        }
    }


    @Test
    public void numberAllEven() {
        List<Integer> numbers = Arrays.asList(2, 2, 4);
        if (numbers.stream().allMatch(i -> i % 2 == 0)) {
            System.out.println("集合里有偶数");
        }
    }

    @Test
    public void divisibleByThree() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Optional<Integer> firestSquareDivisibledByThree =
                numbers.stream()
                    .map(x -> x * x)
                    .filter(x -> x % 3 == 0)
                    .findFirst();
        System.out.println(firestSquareDivisibledByThree.get());
    }

}
