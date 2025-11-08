package pages;

import helpMethods.AlertsMethods;
import helpMethods.ElementsMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsWindows {
    public WebDriver driver;
    public ElementsMethod elementsMethod;
    public AlertsMethods alertsMethods;

    public AlertsWindows(WebDriver driver) {
        this.driver = driver;
        this.elementsMethod = new ElementsMethod(this.driver);
        this.alertsMethods = new AlertsMethods(this.driver);
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//span[text()='Alerts']")
    public WebElement alert;

    @FindBy(id = "alertButton")
    public WebElement firstAlertButton;

    @FindBy(id = "timerAlertButton")
    public WebElement secondAlert;

    @FindBy(id = "confirmButton")
    public WebElement thirdAlertButton;

    @FindBy(id = "promtButton")
    public WebElement fourthAlertButton;

    @FindBy(id = "confirmResult")
    WebElement textThirdAlert;

    public void clickAlert() {
        alert.click();
    }

    public void dealAlertProcess() {
        elementsMethod.clickElement(this.firstAlertButton);
        alertsMethods.acceptAlert();

        elementsMethod.clickElement(this.secondAlert);
        alertsMethods.acceptAlert();

        elementsMethod.javaScriptElement(this.thirdAlertButton);
        alertsMethods.acceptAlert(false);

        elementsMethod.javaScriptElement(this.fourthAlertButton);
        alertsMethods.fillAlert("text");

        String actualText = this.textThirdAlert.getText();
        alertsMethods.verifyConfirmAlert(actualText, false);
    }
}
