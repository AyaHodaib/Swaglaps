package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private WebDriver driver;
    public CheckoutPage(WebDriver  driver){
        this.driver = driver;
    }
    private By checkoutHeader = By.xpath("//*[text()='Checkout: Your Information']");
    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By postalCode = By.id("postal-code");
    private By continueBtn = By.className("btn_primary");
    public By getContinueBtn(){return continueBtn;}
    public By getCheckoutHearder(){
        return checkoutHeader;
    }

    public boolean isMovedToCheckoutPage (){
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        return driver.findElement(checkoutPage.getCheckoutHearder()).isDisplayed();
    }

    public void clickOnContinueBtn(){
driver.findElement(firstNameField).sendKeys("Aya");
driver.findElement(lastNameField).sendKeys("Hodaib");
driver.findElement(postalCode).sendKeys("00000");
        driver.findElement(getContinueBtn()).click();
    }

}
