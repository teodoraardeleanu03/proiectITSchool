package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsPage extends BasePage {
    @FindBy(xpath = "//span[text()='Web Tables']")
    public WebElement webTable;

    public ElementsPage(WebDriver driver) {
        super(driver);
    }

    public void clickWebTable() {
        elementsMethod.javaScriptElement(webTable);
    }
}
