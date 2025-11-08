package tests;

import helpMethods.AlertsMethods;
import helpMethods.ElementsMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.AlertsWindows;
import pages.HomePage;

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

        HomePage homePage = new HomePage(driver);
        homePage.clickAlertFrameWindow();

        AlertsWindows alertsWindows = new AlertsWindows(driver);
        alertsWindows.clickAlert();

        alertsWindows.dealAlertProcess();
    }
}
