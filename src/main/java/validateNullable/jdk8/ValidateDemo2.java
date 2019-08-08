package validateNullable.jdk8;

import org.junit.Test;
import validateNullable.base.Inner;
import validateNullable.base.Nested;
import validateNullable.base.Outer;

import java.util.Optional;
import java.util.function.Supplier;

public class ValidateDemo2 {


    private static <T> Optional<T> resolve(Supplier<T> resolver) {

        try {
            T result = resolver.get();
            return Optional.ofNullable(result);
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    @Test
    public void validate() {
        Outer obj = new Outer();
        resolve(() -> obj.getNested().getInner().getFoo())
                .ifPresent(System.out::println);
    }
}
