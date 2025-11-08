package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableTest {
    public WebDriver driver;

    @Test
    public void metodaTest() {
        // deschidem un browser
        driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;

        // accesam un url
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        WebElement elementsMenu = driver.findElement(By.xpath("//h5[text()='Elements']"));
        js.executeScript("arguments[0].click();", elementsMenu);

        WebElement webTable = driver.findElement(By.xpath("//span[text()='Web Tables']"));
        js.executeScript("arguments[0].click();", webTable);

        List<WebElement> continutTabel = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
        //System.out.println("Dimensiunea tabelului este " + continutTabel.size());
        Assert.assertEquals(continutTabel.size(), 3, "Marimea tabelului nu este 3");

        // definim un element
        WebElement addElement = driver.findElement(By.id("addNewRecordButton"));
        addElement.click();

        WebElement firstNameElement = driver.findElement(By.id("firstName"));
        String firstName = "Teodora";
        firstNameElement.sendKeys(firstName);

        WebElement lastNameElement = driver.findElement(By.id("lastName"));
        String lastName = "Ardeleanu";
        lastNameElement.sendKeys(lastName);

        WebElement emailElement = driver.findElement(By.id("userEmail"));
        String email = "test@test.com";
        emailElement.sendKeys(email);

        WebElement ageElement = driver.findElement(By.id("age"));
        String age = "23";
        ageElement.sendKeys(age);

        WebElement salaryElement = driver.findElement(By.id("salary"));
        String salary = "230";
        salaryElement.sendKeys(salary);

        WebElement departmentElement = driver.findElement(By.id("department"));
        String department = "IT";
        departmentElement.sendKeys(department);

        WebElement submitElement = driver.findElement(By.id("submit"));
        submitElement.click();

        // validam noua dimensiune a tabelului
        List<WebElement> continutTabelNou = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
        Assert.assertEquals(continutTabelNou.size(), 4, "Marimea tabelului nu este 4");
        // validam valorile pe care le-am introdus
        String continutRand = continutTabelNou.get(3).getText();
        Assert.assertTrue(continutRand.contains(firstName), "Randul nu contine firstname");
        Assert.assertTrue(continutRand.contains(lastName), "Randul nu contine lastname");
        Assert.assertTrue(continutRand.contains(email), "Randul nu contine email");
        Assert.assertTrue(continutRand.contains(age), "Randul nu contine varsta");
        Assert.assertTrue(continutRand.contains(salary), "Randul nu contine salariu");
        Assert.assertTrue(continutRand.contains(department), "Randul nu contine departament");

        WebElement editElement = driver.findElement(By.id("edit-record-4"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", editElement);

        WebElement editFirstNameElement = driver.findElement(By.id("firstName"));
        editFirstNameElement.clear();
        String nume2="Richard";
        editFirstNameElement.sendKeys(nume2);

        WebElement editLastNameElement = driver.findElement(By.id("lastName"));
        editLastNameElement.clear();
        String nume3="Peter";
        editLastNameElement.sendKeys(nume3);

        WebElement editAgeElement = driver.findElement(By.id("age"));
        editAgeElement.clear();
        String age2 = "25";
        editAgeElement.sendKeys(age2);

        WebElement submitbutton2Button = driver.findElement(By.id("submit"));
        submitbutton2Button.click();

        WebElement deleteElement = driver.findElement(By.id("delete-record-4"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", deleteElement);

        List<WebElement> continutTabelSters = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
        Assert.assertEquals(continutTabelSters.size(), 3, "Marimea tabelului nu este 3");
       // driver.close();

        // daca vreti sa identificati un element dupa text, puteti face asta doar cu XPath. CSS Selector nu permite acest lucru.

    }

}
