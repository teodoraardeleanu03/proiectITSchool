package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramesPage extends BasePage {
    @FindBy(xpath = "//span[text()='Frames']")
    public WebElement frameMenu;

    public FramesPage(WebDriver driver) {
        super(driver);
    }

    public void clickFrame() {
        elementsMethod.javaScriptElement(frameMenu);
    }

    public void switchFrames(String text1, String text2) {
        frameMethods.switchToSpecificFrame(text1);
        frameMethods.switchToParentFrame();
        frameMethods.switchToSpecificFrame(text2);
    }
}
