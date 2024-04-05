package Page;

import  org.openqa.selenium.WebElement;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import  org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;


import java.time.Duration;
import org.openqa.selenium.support.PageFactory;


public class AuthModuleClass {
    public WebDriver driver;
    public WebDriverWait wait;

    By username = By.className("");
    By password = By.className("");

    By LoginBtn = By.className("");

    public AuthModuleClass(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver,this);
    }

    public void LoginToApplication(String username1 ,String password1){
        driver.findElement(username).sendKeys(username1);
        driver.findElement(password).sendKeys(password1);
        driver.findElement(LoginBtn).click();

    }

}