import  org.openqa.selenium.WebElement;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import  org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

import  org.testng.annotations.*;
import org.testng.Assert;

import java.time.Duration;
import org.openqa.selenium.support.PageFactory;

import  Page.AuthModuleClass;
public class AuthModule {
    public  WebDriver driver;
    AuthModuleClass authModuleClass;

    @BeforeMethod
    public void setUp(){
        System.setProperty("","");
        driver.get("");

    }

    @AfterMethod
    public void setdown(){
        driver.close();
    }


    @Test
    public void authenticateUser(){
        authModuleClass.LoginToApplication("abc","avb1");
        String expUrl  = driver.getCurrentUrl();
        String curUrl = "";
        Assert.assertEquals(expUrl,curUrl,"Not Matched");
    }
    @Test
    public void invalidInput(){

    }

    @Test
    public void EmptyInputs(){

    }

    @Test
    public void EmptyUsername(){

    }

    @Test
    public void EmptyPassword(){

    }

}

//Ensure that your test cases cover various scenarios such as:
//        ● Successful user registration/authentication.
//● Handling of duplicate usernames during registration.
//        ● Handling of incorrect usernames/passwords during authentication.
//● Edge cases, such as empty strings or invalid inputs.
