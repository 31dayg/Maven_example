import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestGetHello {

    @Test
    public void testHello() {
        assertEquals("Hello World", new Hello().getHello());
    }

}
