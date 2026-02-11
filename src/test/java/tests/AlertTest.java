package tests;

import helpMethods.AlertsMethods;
import helpMethods.ElementsMethod;
import org.testng.annotations.Test;
import pages.AlertsWindows;
import pages.HomePage;
import sharedData.ShareData;

import java.time.Duration;

public class AlertTest extends ShareData {
    ElementsMethod elementsMethod;
    AlertsMethods alertsMethods;

    @Test
    public void metodaTest() {
        elementsMethod = new ElementsMethod(getDriver());
        alertsMethods = new AlertsMethods(getDriver());

        // wait implicit (vegheaza asupra codului)
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        HomePage homePage = new HomePage(getDriver());
        homePage.clickAlertFrameWindow();

        AlertsWindows alertsWindows = new AlertsWindows(getDriver());
        alertsWindows.clickAlert();
        alertsWindows.dealAlertProcess();
    }
}
