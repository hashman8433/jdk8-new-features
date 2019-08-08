package validateNullable.old;

import org.junit.Test;
import validateNullable.base.Outer;

public class ValidateDemo {

    @Test
    public void validate() {
        Outer outer = new Outer();
        if (outer != null && outer.nested != null && outer.nested.inner != null) {
            System.out.println(outer.nested.inner.foo);
        }
    }
}
