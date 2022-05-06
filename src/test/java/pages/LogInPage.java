package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.DriverUtil;

public class LogInPage extends DriverUtil {

    By SignInButton = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    By EmailAddress = By.id("email");
    By Password = By.id("passwd");
    By ClickSignInButton = By.xpath("//*[@id=\"SubmitLogin\"]/span");
    By SignOutButton = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a");

    String BaseUrl = "http://automationpractice.com/index.php";

    public void LaunchUrl(){
        driver.get(BaseUrl);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    public void ClickSignInButton(){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(SignInButton)).click();
    }

    public void EnterEmailAndPassword(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(EmailAddress)).sendKeys("jacob@gmail.com");
        driver.findElement(Password).sendKeys("Sommer");
    }

    public void SignInButton(){
        driver.findElement(ClickSignInButton).click();
    }

    public void ValidateSignOutButton () throws  InterruptedException{
        boolean status = driver.findElement(SignOutButton).isDisplayed();

        if (status){
            System.out.println("Login Successful");
        }else {
            System.out.println("Login Failed");
        }

        Thread.sleep(5000);

    }

}
