package pages;

import cucumber.api.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.DriverUtil;

import java.util.List;

public class CreateAccountPage extends DriverUtil {
    By SignInButton = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    By EnterEmail = By.id("email_create");
    By CreateAnAccount = By.xpath("//*[@id=\"SubmitCreate\"]/span");
    By ClickTitle = By.id("id_gender1");
    By EnterFirstName = By.id("customer_firstname");
    By EnterLastname = By.id("customer_lastname");
    By Password = By.id("passwd");
    By DateDropDown = By.id("days");
    By MonthDropDown = By.id("months");
    By YearDropDown = By.id("years");
    By AddressFirstName = By.id("firstname");
    By AddressLastName = By.id("lastname");
    By Address = By.id("address1");
    By City = By.id("city");
    By State =  By.id("id_state");
    By ZipCode = By.id("postcode");
    By AdditionalInfo = By.id("other");
    By HomePhoneNo = By.id("phone");
    By MobileNO = By.id("phone_mobile");
    By AssignAlias = By.id("alias");
    By RegisterButton = By.xpath("//*[@id=\"submitAccount\"]/span");








    String BaseUrl = "http://automationpractice.com/index.php";

    public void LaunchUrl(){
      driver.get(BaseUrl);
      driver.manage().deleteAllCookies();
      driver.manage().window().maximize();
    }

    public void ClickSignInButton(){
        driver.findElement(SignInButton).click();
    }

    public void EnterEmailAddress(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(EnterEmail)).sendKeys("jacob@gmail.com");
    }

    public void CreateAnAccount(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(CreateAnAccount)).click();
    }

    public void ValidateCreateAccountPage () {
        if (driver.getCurrentUrl().contains("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation")) {
            System.out.println("Registration page is displayed");
        } else {
            System.out.println("Registration Page is not displayed"); }


    }

     public void SelectTitle(){
            WebDriverWait wait = new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.elementToBeClickable(ClickTitle)).click();
        }

        public  void EnterFirstAndLastName(){
        driver.findElement(EnterFirstName).sendKeys("Access");
        driver.findElement(EnterLastname).sendKeys("ELearn");
        }

        public  void EnterPassword(){
        driver.findElement(Password).sendKeys("Sommer");
        }

        public  void SelectDateOfBirth()throws InterruptedException{
            Select select = new Select(driver.findElement(DateDropDown));
            select.selectByIndex(5);
            Thread.sleep(2000);
        }

        public void SelectMonth (){

            Select select = new Select(driver.findElement(MonthDropDown));
           select.selectByIndex(4);
        }

        public void SelectYear (){
        Select select = new Select(driver.findElement(YearDropDown));
        select.selectByValue("2005");
        }


        public void EnterAddressDetails(DataTable AddressDetails) throws InterruptedException{

            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.PAGE_UP).build().perform();


            List<List<String>> data = AddressDetails.raw();
            System.out.println(data.get(1).get(1));
            driver.findElement(AddressFirstName).sendKeys(data.get(1).get(1));
            driver.findElement(AddressLastName).sendKeys(data.get(2).get(1));
            driver.findElement(Address).sendKeys(data.get(3).get(1));
            driver.findElement(City).sendKeys(data.get(4).get(1));
            Select select = new Select(driver.findElement(State));
            select.selectByVisibleText(data.get(5).get(1));
            driver.findElement(ZipCode).sendKeys(data.get(6).get(1));
            driver.findElement(AdditionalInfo).sendKeys(data.get(7).get(1));
            driver.findElement(HomePhoneNo).sendKeys(data.get(8).get(1));
            driver.findElement(MobileNO).sendKeys(data.get(9).get(1));
            driver.findElement(AssignAlias).sendKeys(data.get(10).get(1));

            Thread.sleep(5000);

        }

    public void ClickOnRegisterButton(){
        driver.findElement(RegisterButton).click();
    }



}
