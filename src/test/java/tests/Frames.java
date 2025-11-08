package tests;

import helpMethods.ElementsMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.FramesPage;
import pages.HomePage;

public class Frames {
    public WebDriver driver;
    ElementsMethod elementsMethod;

    @Test
    public void metodaTest() {
        //Deschidem un browser
        driver = new ChromeDriver();
        elementsMethod = new ElementsMethod(driver);
        //Accesam un URL
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        HomePage homePage = new HomePage(driver);
        homePage.clickAlertFrameWindow();

        FramesPage framesPage = new FramesPage(driver);
        framesPage.clickFrame();
        framesPage.switchFrames("frame1", "frame2");
    }
}
