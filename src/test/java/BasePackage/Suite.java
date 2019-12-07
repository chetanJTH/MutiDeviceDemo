package BasePackage;


import ImageModule.AddImage;
import org.testng.SkipException;
import org.testng.annotations.Test;


public class FontSuite extends BaseTest {

    // Font Module

    @Test(priority = 1, description = "Test Add Text Button", testName = "Add Text Button")
    void AddText() {
        addtextOnCard.addTextOnCardTest();
    }

//    @Test(priority = 2)
//    void EditText() {
//        editTextTest.editTextOnCard();
//    }
//
//    @Test(priority = 3)
//    void TextPositionButtons() {
//        textPositionButtonsCase.TextPositionButtonsTest();
//    }
//
//    @Test(priority = 4)
//    void TextRotation() {
//        textRotation.TextRotationTest();
//    }
//
//    @Test(priority = 5)
//    void TextSize() {
//        textSizeCase.TextSizeTest();
//    }
//
//    @Test(priority = 6)
//    void TextColor() {
//        textColor.TextColorTest();
//    }
//
//    @Test(priority = 7)
//    void FontLibrary() {
//        fontlibrary.FontLibraryCases();
//    }
//
//    @Test(priority = 8)
//    void Shadow() {
//        shadowFont.FontShadowTest();
//    }
//
//    @Test(priority = 9)
//    void Style() {
//        style.TextStyleTest();
//    }
//
//    @Test(priority = 10)
//    void FontOpacity() {
//        fontOpacityTest.FontOpacityCase();
//    }
//
//    @Test(priority = 11)
//    void LatterSpacing() {
//        latterSpacing.LatterSpacingTest();
//    }
//
//    @Test(priority = 12)
//    void UndoRedo() {
//        undoRedoCase.UndoRedoTest();
//    }
//
//    @Test(priority = 13)
//    void LockUnlock() {
//        lockUnlockElement.LockUnlockCase();
//    }
//
//    @Test(priority = 14)
//    void FrameLayer() {
//        layerFrame.FrameLayerCase();
//    }



}

