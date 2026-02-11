package tests;

import helpMethods.ElementsMethod;
import org.testng.annotations.Test;
import pages.FramesPage;
import pages.HomePage;
import sharedData.ShareData;

public class Frames extends ShareData {
    ElementsMethod elementsMethod;

    @Test
    public void metodaTest() {
        elementsMethod = new ElementsMethod(getDriver());

        HomePage homePage = new HomePage(getDriver());
        homePage.clickAlertFrameWindow();

        FramesPage framesPage = new FramesPage(getDriver());
        framesPage.clickFrame();
        framesPage.switchFrames("frame1", "frame2");
    }
}
