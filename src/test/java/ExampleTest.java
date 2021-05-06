import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExampleTest {

    @Before
    public void before() {
        System.out.println("Before");
    }

    @After
    public void after() {
        System.out.println("After");
    }

    @Test
    public void testSum() {

        System.out.println("testsum");
    }

    @Test
    public void test() {

        System.out.println("test");
    }
}
