package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class Login extends BaseTest{

    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By errorButton = By.className("error-button");
    By loginButton = By.id("login-button");
    By headerArea = By.className("app_logo");

    String validusername = "standard_user";
    String validpassword = "secret_sauce";
    String invalidusername = "Aya";
    String invalidpassword = "Aya123";




    @Test
    public void validlogin(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.login("standard_user","secret_sauce");
        boolean isHeaderDisplayed = driver.findElement(homePage.getHeaderArea()).isDisplayed();
        Assert.assertTrue(isHeaderDisplayed);driver.quit();
    }

    @Test
    public void invalidlogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Aya","Aya123");
        boolean iserrorbuttondisplayed = driver.findElement(loginPage.getErrorButton()).isDisplayed();
        Assert.assertTrue(iserrorbuttondisplayed);
        driver.quit();
    }

}

