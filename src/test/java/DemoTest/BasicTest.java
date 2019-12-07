package DemoTest;

import ApiDemoApp.ApiDemo;

import actions.MobileActions;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import extentreports.ExtentReport;
import io.appium.java_client.android.AndroidDriver;
import okio.Timeout;
import org.apache.xmlbeans.impl.xb.xmlconfig.Extensionconfig;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import utils.Log;

import java.io.IOException;
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



        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
        driver.findElementById("android:id/checkbox").click();
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        driver.findElementByClassName("android.widget.EditText").sendKeys("hello");


        }


    }






