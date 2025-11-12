package tests;

import helpMethods.ElementsMethod;
import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.HomePage;
import pages.WebTablesPage;
import sharedData.ShareData;

public class WebTableTest extends ShareData {
    ElementsMethod elementsMethod;

    @Test
    public void metodaTest() {
        elementsMethod = new ElementsMethod(driver);

        HomePage homePage = new HomePage(driver);
        homePage.clickElementsMenu();

        ElementsPage elementsPage = new ElementsPage(driver);
        elementsPage.clickWebTable();

        WebTablesPage webTablesPage = new WebTablesPage(driver);
        webTablesPage.createProcess();

        webTablesPage.editProcess();
        webTablesPage.deleteProcess();

        // daca vreti sa identificati un element dupa text, puteti face asta doar cu XPath. CSS Selector nu permite acest lucru.
    }
}
