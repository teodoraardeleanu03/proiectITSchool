package tests;

import helpMethods.ElementsMethod;
import helpMethods.TabMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;

public class TabWindowTest {
    public WebDriver driver;
    ElementsMethod elementsMethod;
    TabMethods tabMethods;

    @Test
    public void metodaTest() {
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        elementsMethod = new ElementsMethod(driver);
        tabMethods = new TabMethods(driver);

        HomePage homePage = new HomePage(driver);
        homePage.clickAlertFrameWindow();

        WebElement tabButton = driver.findElement(By.xpath("//span[text()='Browser Windows']"));
        elementsMethod.javaScriptElement(tabButton);

        WebElement tabButtonElement = driver.findElement(By.id("tabButton"));
        elementsMethod.javaScriptElement(tabButtonElement);

        System.out.println("URL-ul paginii curente este " + driver.getCurrentUrl());

        tabMethods.switchSpecificTab(1);
        tabMethods.closeCurrentTab();

        tabMethods.switchSpecificTab(0);

        WebElement newWindowElement = driver.findElement(By.id("windowButton"));
        elementsMethod.javaScriptElement(newWindowElement);
        tabMethods.switchSpecificTab(1);
        driver.quit();
    }
}
