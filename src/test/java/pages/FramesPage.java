package pages;

import helpMethods.ElementsMethod;
import helpMethods.FrameMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramesPage {
    public WebDriver driver;
    public ElementsMethod elementsMethod;
    public FrameMethods frameMethods;

    public FramesPage(WebDriver driver) {
        this.driver = driver;
        this.elementsMethod = new ElementsMethod(this.driver);
        this.frameMethods = new FrameMethods(this.driver);
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//span[text()='Frames']")
    public WebElement frameMenu;

    public void clickFrame() {
        elementsMethod.javaScriptElement(frameMenu);
    }

    public void switchFrames(String text1, String text2) {
        frameMethods.switchToSpecificFrame(text1);
        frameMethods.switchToParentFrame();
        frameMethods.switchToSpecificFrame(text2);
    }
}
