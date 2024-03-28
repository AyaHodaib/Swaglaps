package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage {
    private WebDriver driver;

    public OverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    private By OverviewHeader = By.id("checkout_summary_container");

    public By getOverviewHeader() {
        return OverviewHeader;
    }

    private By finishButtion = By.className("btn_action");





    public boolean isMovedToOverview() {
        OverviewPage overviewPage = new OverviewPage(driver);
        return driver.findElement(overviewPage.getOverviewHeader()).isDisplayed();
    }

    public void clickOnFinishButton() {
        driver.findElement(finishButtion).click();
    }
}
