package pages;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartActions {
   private WebDriver driver;

    public CartActions(WebDriver driver){
        this.driver = driver;
    }

    private By productName = By.className("inventory_item_name");

    public By getProductName(){
        return productName;
    }

    private By checkoutBtn = By.className("btn_action");

    public void moveToCheckoutPage(){
        driver.findElement(checkoutBtn).click();
    }











}
