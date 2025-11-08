package pages;

import helpMethods.ElementsMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramesPage {
    public WebDriver driver;
    public ElementsMethod elementsMethod;

    public FramesPage(WebDriver driver) {
        this.driver = driver;
        this.elementsMethod = new ElementsMethod(driver);
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//span[text()='Frames']")
    public WebElement frameMenu;

    public void clickFrame() {
        elementsMethod.javaScriptElement(frameMenu);
    }
}
