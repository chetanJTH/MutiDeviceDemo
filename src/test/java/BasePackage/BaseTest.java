package BasePackage;

import DemoTestCase.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import extentreports.ExtentReport;
import org.testng.annotations.*;
import utils.Apps;
import utils.Devices;






public class BaseTest {


    public static ExtentReports extent;
    public static ExtentTest test;


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
        Devices device = Devices.SamsungJ7;
        loginAndroid = TestManager.testAndroid(device, Apps.ApiDemo);



        // Font Module
        basicCase = new BasicCase(loginAndroid.getDriverAndroid());


        extent.setSystemInfo("Device Test Name", device.getName());
        extent.setSystemInfo("Device Test Version", device.getVersion());





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