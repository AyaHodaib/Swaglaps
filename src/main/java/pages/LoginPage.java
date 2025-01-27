package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
     private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By errorButton = By.className("error-button");
    private By loginButton = By.id("login-button");

    public By getErrorButton(){
        return errorButton;
    }
    public void login(String username, String Password){
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(Password);
        driver.findElement(loginButton).click();
    }
}
