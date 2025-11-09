package pages;

import helpMethods.ElementsMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class WebTablesPage {
    public WebDriver driver;
    public ElementsMethod elementsMethod;

    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
        elementsMethod = new ElementsMethod(this.driver);
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']")
    public List<WebElement> tableContentList;

    @FindBy(id = "addNewRecordButton")
    public WebElement addElement;

    @FindBy(id = "firstName")
    WebElement firstNameElement;

    @FindBy(id = "lastName")
    WebElement lastNameElement;

    @FindBy(id = "userEmail")
    WebElement emailElement;

    @FindBy(id = "age")
    WebElement ageElement;

    @FindBy(id = "salary")
    WebElement salaryElement;

    @FindBy(id = "department")
    WebElement departmentElement;

    @FindBy(id = "submit")
    WebElement submitElement;

    @FindBy(xpath = "//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']")
    List<WebElement> continutTabelNou;

    @FindBy(id = "edit-record-4")
    WebElement editElement;

    @FindBy(id = "firstName")
    WebElement editFirstNameElement;

    @FindBy(id = "lastName")
    WebElement editLastNameElement;

    @FindBy(id = "age")
    WebElement editAgeElement;

    @FindBy(id = "submit")
    WebElement submitbutton2Button;

    @FindBy(id = "delete-record-4")
    WebElement deleteElement;

    @FindBy(xpath = "//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']")
    List<WebElement> continutTabelSters;

    public void createProcess() {
        Assert.assertEquals(tableContentList.size(), 3, "Marimea tabelului nu este 3");
        elementsMethod.clickElement(addElement);

        String firstName = "Teodora";
        elementsMethod.fillElement(firstNameElement, firstName);

        String lastName = "Ardeleanu";
        elementsMethod.fillElement(lastNameElement, lastName);

        String email = "test@test.com";
        elementsMethod.fillElement(emailElement, email);

        String age = "23";
        elementsMethod.fillElement(ageElement, age);

        String salary = "230";
        elementsMethod.fillElement(salaryElement, salary);

        String department = "IT";
        elementsMethod.fillElement(departmentElement, department);

        elementsMethod.clickElement(submitElement);

        // validam noua dimensiune a tabelului
        Assert.assertEquals(continutTabelNou.size(), 4, "Marimea tabelului nu este 4");
        // validam valorile pe care le-am introdus
        String continutRand = continutTabelNou.get(3).getText();
        Assert.assertTrue(continutRand.contains(firstName), "Randul nu contine firstname");
        Assert.assertTrue(continutRand.contains(lastName), "Randul nu contine lastname");
        Assert.assertTrue(continutRand.contains(email), "Randul nu contine email");
        Assert.assertTrue(continutRand.contains(age), "Randul nu contine varsta");
        Assert.assertTrue(continutRand.contains(salary), "Randul nu contine salariu");
        Assert.assertTrue(continutRand.contains(department), "Randul nu contine departament");
    }

    public void editProcess() {
        elementsMethod.javaScriptElement(editElement);

        editFirstNameElement.clear();
        elementsMethod.fillElement(editFirstNameElement, "Richard");

        editLastNameElement.clear();
        elementsMethod.fillElement(editLastNameElement, "Peter");

        editAgeElement.clear();
        elementsMethod.fillElement(editAgeElement, "25");

        elementsMethod.clickElement(submitbutton2Button);
    }

    public void deleteProcess() {
        elementsMethod.javaScriptElement(deleteElement);
        Assert.assertEquals(continutTabelSters.size(), 3, "Marimea tabelului nu este 3");
    }
}
