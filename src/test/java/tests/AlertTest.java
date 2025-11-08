package tests;

import helpMethods.AlertsMethods;
import helpMethods.ElementsMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertTest {
    public WebDriver driver;
    ElementsMethod elementsMethod;
    AlertsMethods alertsMethods;

    @Test
    public void metodaTest() {
        driver = new ChromeDriver();
        elementsMethod = new ElementsMethod(driver);
        alertsMethods = new AlertsMethods(driver);
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        // wait implicit (vegheaza asupra codului)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement alertMenu = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        elementsMethod.javaScriptElement(alertMenu);

        WebElement tabButton = driver.findElement(By.xpath("//span[text()='Alerts']"));
        elementsMethod.clickElement(tabButton);

        WebElement firstAlertButton = driver.findElement(By.id("alertButton"));
        elementsMethod.clickElement(firstAlertButton);
        alertsMethods.acceptAlert();

        WebElement secondAlert = driver.findElement(By.id("timerAlertButton"));
        elementsMethod.clickElement(secondAlert);
        alertsMethods.acceptAlert();

        WebElement thirdAlertButton = driver.findElement(By.id("confirmButton"));
        elementsMethod.javaScriptElement(thirdAlertButton);
        alertsMethods.acceptAlert(false);

        WebElement fourthAlertButton = driver.findElement(By.id("promtButton"));
        elementsMethod.javaScriptElement(fourthAlertButton);
        alertsMethods.fillAlert("text");

        WebElement textThirdAlert = driver.findElement(By.id("confirmResult"));
        String actualText = textThirdAlert.getText();
        alertsMethods.verifyConfirmAlert(actualText, false);
    }
}
