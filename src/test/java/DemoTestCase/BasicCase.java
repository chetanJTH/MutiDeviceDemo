package DemoTestCase;

import DemoTest.BasicTest;
import io.appium.java_client.android.AndroidDriver;

public class BasicCase {
    public BasicCase(AndroidDriver driver) {
        this.driver = driver;
    }

    private AndroidDriver driver;

    public void BasicTestCase() {

        //    ExtentTest extent = ExtentReport.shared().getExtentTest("Add Text, case 4");
        BasicTest BT = new BasicTest(driver);

        try {
            BT.RandomBasicTest();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
