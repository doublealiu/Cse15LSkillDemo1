
import org.junit.*;

public class MainTester {
    @Test
    public void testAdd() {
        Assert.assertEquals("1+1 should be 2.", 2, Main.add(1, 1));
    }
}
