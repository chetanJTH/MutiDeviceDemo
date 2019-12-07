package BasePackage;

import FontModule.FrameLayer;
import FontModuleCase.*;
import ImageStickerCase.*;
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
    protected addTextOnCard addtextOnCard;
    protected editText editTextTest;
    protected TextPositionButtonsCase textPositionButtonsCase;
    protected TextRotation textRotation;
    protected TextSizeCase textSizeCase;
    protected TextColor textColor;
    protected fontLibrary fontlibrary;
    protected ShadowFont shadowFont;
    protected Style style;
    protected FontOpacityTest fontOpacityTest;
    protected LatterSpacing latterSpacing;
    protected UndoRedoCase undoRedoCase;
    protected LockUnlockElement lockUnlockElement;
    protected LayerFrame layerFrame;
    // Image Module
    protected addImage addimage;
    protected ImageErase imageErase;


    @BeforeSuite
    void beforeSuite() {
        extent = ExtentReport.shared().getExtent();
    }

    @BeforeClass
    void setupDriver() throws InterruptedException {

        //1 times
        Devices device = Devices.SamsungA10;
        loginAndroid = TestManager.testAndroid(device, Apps.ProductMarketing);



        // Font Module
        addtextOnCard = new addTextOnCard(loginAndroid.getDriverAndroid());
        editTextTest = new editText(loginAndroid.getDriverAndroid());
        textPositionButtonsCase = new TextPositionButtonsCase(loginAndroid.getDriverAndroid());
        textRotation = new TextRotation(loginAndroid.getDriverAndroid());
        textSizeCase = new TextSizeCase(loginAndroid.getDriverAndroid());
        textColor = new TextColor(loginAndroid.getDriverAndroid());
        fontlibrary = new fontLibrary((loginAndroid.getDriverAndroid()));
        shadowFont = new ShadowFont(loginAndroid.getDriverAndroid());
        style = new Style(loginAndroid.getDriverAndroid());
        fontOpacityTest = new FontOpacityTest(loginAndroid.getDriverAndroid());
        latterSpacing = new LatterSpacing(loginAndroid.getDriverAndroid());
        undoRedoCase = new UndoRedoCase(loginAndroid.getDriverAndroid());
        lockUnlockElement = new LockUnlockElement(loginAndroid.getDriverAndroid());
        layerFrame = new LayerFrame(loginAndroid.getDriverAndroid());

        // Image Module

        addimage = new addImage(loginAndroid.getDriverAndroid());
        imageErase = new ImageErase(loginAndroid.getDriverAndroid());

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