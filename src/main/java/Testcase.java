import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase {
    @Test
    void addition(){
        Assert.assertEquals(Calculator.addition(4,5), 9);
    }
}
