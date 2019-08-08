package validateNullable.jdk8;

import org.junit.Test;
import validateNullable.base.Inner;
import validateNullable.base.Nested;
import validateNullable.base.Outer;

import java.util.Optional;

public class ValidateDemo1 {
    @Test
    public void validate() {

        Optional.of(new Outer())
                .map(Outer::getNested)
                .map(Nested::getInner)
                .map(Inner::getFoo)
                .ifPresent(System.out::println);

    }
}
