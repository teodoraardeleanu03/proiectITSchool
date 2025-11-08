package tests;

import helpMethods.ElementsMethod;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class PracticeForm {
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

        WebElement formsMenu = driver.findElement(By.xpath("//h5[text()='Forms']"));
        elementsMethod.javaScriptElement(formsMenu);

        WebElement practiceForm = driver.findElement(By.xpath("//span[text()='Practice Form']"));
        elementsMethod.javaScriptElement(practiceForm);

        WebElement firstNameElement = driver.findElement(By.id("firstName"));
        elementsMethod.fillElement(firstNameElement, "Teodora");

        WebElement lastNameElement = driver.findElement(By.id("lastName"));
        elementsMethod.fillElement(lastNameElement, "Ardeleanu");

        WebElement emailElement = driver.findElement(By.id("userEmail"));
        elementsMethod.fillElement(emailElement, "test@test.com");

        WebElement mobileElement = driver.findElement(By.id("userNumber"));
        elementsMethod.fillElement(mobileElement, "000444555");

        //Date Of birth interaction
        WebElement dateOfBirth = driver.findElement(By.id("dateOfBirthInput"));
        elementsMethod.javaScriptElement(dateOfBirth);
        WebElement monthElement = driver.findElement(By.className("react-datepicker__month-select"));
        Select monthSelect = new Select(monthElement);
        String monthValue = "January";
        monthSelect.selectByVisibleText(monthValue);

        WebElement yearElement = driver.findElement(By.className("react-datepicker__year-select"));
        Select yearSelect = new Select(yearElement);
        String yearValue = "1999";
        yearSelect.selectByVisibleText(yearValue);

        String dayValue = "23";
        List <WebElement> daysList = driver.findElements(By.xpath("//div[contains(@class, 'react-datepicker__day--') and not (contains(@class, '--outside-month'))]"));
        for ( int i=0; i< daysList.size(); i++){
            if (daysList.get(i).getText().equals(dayValue)){
                daysList.get(i).click();
                break;
            }
        }


//        WebElement currentAddressElement = driver.findElement(By.id("currentAddress"));
//        String currentAddress = "Bucuresti";
//        currentAddressElement.sendKeys(currentAddress);
//
//        List<WebElement> genderOptionsList = driver.findElements(By.xpath("//input[@name='gender']"));
//        String genderValue = "Male";
//
//        switch (genderValue) {
//            case "Male":
//                js.executeScript("arguments[0].click();", genderOptionsList.get(0));
//                break;
//            case "Female":
//                js.executeScript("arguments[0].click();", genderOptionsList.get(1));
//                break;
//            case "Other":
//                js.executeScript("arguments[0].click();", genderOptionsList.get(2));
//                break;
//        }
//
//        WebElement subjectElementField = driver.findElement(By.id("subjectsInput"));
////        String subjectValue = "Accounting";
////        subjectElement.sendKeys(subjectValue);
////        subjectElement.sendKeys(Keys.ENTER);
//
//        List<String> subjectElements = Arrays.asList("Accounting", "Maths", "English");
//        for (int i = 0; i < subjectElements.size(); i++) {
//            subjectElementField.sendKeys(subjectElements.get(i));
//            subjectElementField.sendKeys(Keys.ENTER);
//        }
//
//        List<String> hobbiesElements = Arrays.asList("Sports", "Reading", "Music");
//        List<WebElement> hobbiesCheckList = driver.findElements(By.xpath("//input[@type='checkbox']"));
//        for (int i = 0; i < hobbiesElements.size(); i++) {
//            js.executeScript("arguments[0].click();", hobbiesCheckList.get(i));
//        }
//
//        File file = new File("src/test/resources/9811d6a28ef7bb49ec702416c3d1f363.jpg");
//        String absolutePath = file.getAbsolutePath();
//
//        WebElement uploadInput = driver.findElement(By.id("uploadPicture"));
//        uploadInput.sendKeys(absolutePath);
//
//        WebElement stateElement = driver.findElement(By.xpath("//div[text()='Select State']"));
//        js.executeScript("arguments[0].click();", stateElement);
//
//        WebElement stateInputElement = driver.findElement(By.id("react-select-3-input"));
//        String stateValue = "NCR";
//        stateInputElement.sendKeys(stateValue);
//        stateInputElement.sendKeys(Keys.ENTER);
//
//        WebElement cityElement = driver.findElement(By.xpath("//div[text()='Select City']"));
//        js.executeScript("arguments[0].click();", cityElement);
//
//        WebElement cityInputElement = driver.findElement(By.id("react-select-4-input"));
//        String cityValue = "Delhi";
//        cityInputElement.sendKeys(cityValue);
//        cityInputElement.sendKeys(Keys.ENTER);
//
//        WebElement submitElement = driver.findElement(By.id("submit"));
//        submitElement.click();
//
//        WebElement thankyouElement = driver.findElement(By.id("example-modal-sizes-title-lg"));
//        Assert.assertEquals(thankyouElement.getText(), "Thanks for submitting the form");
//
//        List<WebElement> labelList = driver.findElements(By.xpath("//Table[@class='table table-dark table-striped table-bordered table-hover']//td[1]"));
//        Assert.assertEquals(labelList.get(0).getText(), "Student Name");
//        Assert.assertEquals(labelList.get(1).getText(), "Student Email");
//        Assert.assertEquals(labelList.get(2).getText(), "Gender");
//        Assert.assertEquals(labelList.get(3).getText(), "Mobile");
//        Assert.assertEquals(labelList.get(4).getText(), "Date of Birth");
//        Assert.assertEquals(labelList.get(5).getText(), "Subjects");
//        Assert.assertEquals(labelList.get(6).getText(), "Hobbies");
//        Assert.assertEquals(labelList.get(7).getText(), "Picture");
//        Assert.assertEquals(labelList.get(8).getText(), "Address");
//        Assert.assertEquals(labelList.get(9).getText(), "State and City");
//
//        List<WebElement> valueList = driver.findElements(By.xpath("//Table[@class='table table-dark table-striped table-bordered table-hover']//td[2]"));
//        Assert.assertEquals(valueList.get(0).getText(), firstName + " " + lastName);
//        Assert.assertEquals(valueList.get(1).getText(), email);
//        Assert.assertEquals(valueList.get(2).getText(), genderValue);
//        Assert.assertEquals(valueList.get(3).getText(), userNumber);
//
//        WebElement closeElement = driver.findElement(By.id("closeLargeModal"));
//        js.executeScript("arguments[0].click();", closeElement);
    }
}
