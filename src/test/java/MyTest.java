import com.microsoft.demo.Demo;
import org.junit.Test;

public class MyTest {
    @Test
    public void test_method_1() {
        Demo d = new Demo();
        d.DoSomething(true);
        // simulate failure
        // d.DoSomething();
    }

    @Test
    public void test_method_2() {
    }
}