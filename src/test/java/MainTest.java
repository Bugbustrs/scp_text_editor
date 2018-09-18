import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void getHelloWorld() {
        Main main = new Main();
        Assert.assertEquals("Hello World.", main.getHelloWorld());
    }
}