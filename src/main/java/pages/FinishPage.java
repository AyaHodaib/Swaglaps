package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinishPage {
   private WebDriver driver;

   public FinishPage(WebDriver driver) {this.driver = driver;}

    private By completeHeader = By.className("complete-header");
    private By getCompleteHeader() {
        return completeHeader;
    }

    public boolean isMovedToFinishPage (){
        FinishPage finishPage = new FinishPage(driver);
        return driver.findElement(finishPage.getCompleteHeader()).isDisplayed();

    }
}
