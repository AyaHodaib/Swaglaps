package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    private WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }


        private By productPrice = By.className("inventory_details_price");
        //private By addElementToCart = By.xpath("//*[text()=\"Add to cart\"]");

        private By cartLink = By.className("shopping_cart_link");

    public By addToCartBtn = By.className("btn_primary");
    public By getAddToCartBtn()
    {return addToCartBtn;}


    public void addElementToCartPage(){
        driver.findElement(addToCartBtn).click();
    }

    public void moveToCartPage(){driver.findElement(cartLink).click();}

public boolean isMovedToCartPage(){
        CartActions cartActions = new CartActions(driver);
        return driver.findElement(cartActions.getProductName()).isDisplayed();
}
    }





