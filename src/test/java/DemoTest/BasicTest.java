package DemoTest;

import ApiDemoApp.ApiDemo;
import actions.MobileActions;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.connection.ConnectionState;
import org.openqa.selenium.mobile.NetworkConnection;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.Log;

import java.sql.Connection;
import java.util.NoSuchElementException;

import static BasePackage.BaseTest.extent;
import static BasePackage.BaseTest.test;


public class BasicTest extends ApiDemo {



    public BasicTest(AndroidDriver driver) {
        super(driver);
    }

    @Test
    public void RandomBasicTest() throws InterruptedException,NoSuchElementException {
        test = extent.createTest("demo test");
        test.assignCategory("functions");

        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        Log.addLog("Step 1");
        test.log(Status.INFO,"Step 1");
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        test.log(Status.INFO,"Step 2");
        driver.findElementById("android:id/checkbox").click();
        test.log(Status.INFO,"Step 3");
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        test.log(Status.INFO,"Step 4");
        driver.findElementByClassName("android.widget.EditText").sendKeys("hello");



        }


    }






