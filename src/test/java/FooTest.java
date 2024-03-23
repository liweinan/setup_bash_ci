import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class FooTest {

    @Test
    public void testFoo() {
        System.out.println("testFoo");
    }

    @Test

    public void testShouldFail() throws Exception {
        throw new Exception("shouldFail");
    }
}
