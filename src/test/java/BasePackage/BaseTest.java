package BasePackage;

import DemoTestCase.BasicCase;

import actions.MobileActions;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import extentreports.ExtentReport;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;
import utils.Apps;
import utils.Devices;

import java.io.IOException;


public class BaseTest {

    protected ExtentReports extent;
    protected TestManager loginAndroid;
    //   Font Module
    protected BasicCase basicCase;



    @BeforeSuite
    void beforeSuite() {
        extent = ExtentReport.shared().getExtent();
    }

    @BeforeClass
    void setupDriver() throws InterruptedException {

        //1 times
        Devices device = Devices.SamsungA10;
        loginAndroid = TestManager.testAndroid(device, Apps.ApiDemo);



        // Font Module
        basicCase = new BasicCase(loginAndroid.getDriverAndroid());


        extent.setSystemInfo("Device Test Name", device.getName());
        extent.setSystemInfo("Device Test Version", device.getVersion());


        Thread.sleep(1500);


    }

    @AfterTest
    void endTest() {
        loginAndroid.quitTest();
    }

    @AfterSuite
    void flushReport(){
        extent.flush();
    }


}