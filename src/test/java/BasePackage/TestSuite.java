package BasePackage;

import DemoTest.BasicTest;
import org.testng.annotations.Test;

public class TestSuite extends BaseTest {

    @Test(priority = 1)
    void BasicTest() {
        basicCase.BasicTestCase();
    }

}
