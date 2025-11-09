package tests;

import helpMethods.ElementsMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.HomePage;
import pages.WebTablesPage;

public class WebTableTest {
    public WebDriver driver;
    ElementsMethod elementsMethod;

    @Test
    public void metodaTest() {
        // deschidem un browser
        driver = new ChromeDriver();
        elementsMethod = new ElementsMethod(driver);

        // accesam un url
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        HomePage homePage = new HomePage(driver);
        homePage.clickElementsMenu();

        ElementsPage elementsPage = new ElementsPage(driver);
        elementsPage.clickWebTable();

        WebTablesPage webTablesPage = new WebTablesPage(driver);
        webTablesPage.createProcess();

        webTablesPage.editProcess();
        webTablesPage.deleteProcess();
        // driver.close();

        // daca vreti sa identificati un element dupa text, puteti face asta doar cu XPath. CSS Selector nu permite acest lucru.
    }
}
