package DemoTest;

import ApiDemoApp.ApiDemo;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import extentreports.ExtentReport;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;


public class BasicTest extends ApiDemo {

    static ExtentTest test;

    public BasicTest(AndroidDriver driver) {
        super(driver);
    }

    @Test
    public void RandomBasicTest() throws InterruptedException, NoSuchElementException {
        test = ExtentReport.shared().getExtentTest("Add Text On Card");
        test.assignCategory("Sanity");

        WebDriverWait wait = new WebDriverWait(driver, 25);


        ExtentReport.shared().setExtentTest(test);
        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        test.log(Status.INFO,"Step 1");
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        test.log(Status.INFO,"Step 2");
        driver.findElementById("android:id/checkbox").click();
        test.log(Status.INFO,"Step 3");
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        test.log(Status.INFO,"Step 4");
        driver.findElementByClassName("android.widget.EditText").sendKeys("hello");
        test.pass("Passed");


        }


    }






