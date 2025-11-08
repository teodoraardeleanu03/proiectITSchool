package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertTest {
    public WebDriver driver;

    @Test
    public void metodaTest() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        // wait implicit (vegheaza asupra codului)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement alertMenu = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", alertMenu);

        WebElement tabButton = driver.findElement(By.xpath("//span[text()='Alerts']"));
        tabButton.click();

        WebElement firstAlertButton = driver.findElement(By.id("alertButton"));
        firstAlertButton.click();

        Alert firstAlert = driver.switchTo().alert();
        firstAlert.accept();

        WebElement secondAlert = driver.findElement(By.id("timerAlertButton"));
        secondAlert.click();

        // wait explicit
        WebDriverWait waitExplicit = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitExplicit.until(ExpectedConditions.alertIsPresent());
        Alert secondAlertElement = driver.switchTo().alert();
        System.out.println(secondAlertElement.getText());
        secondAlertElement.accept();

        WebElement thirdAlertButton = driver.findElement(By.id("confirmButton"));
        js.executeScript("arguments[0].click();", thirdAlertButton);

        Alert thirdAlert = driver.switchTo().alert();
        thirdAlert.dismiss();

        WebElement fourthAlertButton = driver.findElement(By.id("promtButton"));
        js.executeScript("arguments[0].click();", fourthAlertButton);

        Alert fourthAlert = driver.switchTo().alert();
        fourthAlert.sendKeys("text");
        fourthAlert.accept();

        WebElement textThirdAlert = driver.findElement(By.id("confirmResult"));
        String expectedText = "You selected Cancel";
        Assert.assertEquals(textThirdAlert.getText(), expectedText);


    }
}
