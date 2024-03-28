package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CartTest extends BaseTest{

    @Test
    public void cartTest (){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartActions cartActions = new CartActions(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        loginPage.login("standard_user", "secret_sauce");
        homePage.openProduct();
        productPage.addElementToCartPage();
        productPage.moveToCartPage();
        cartActions.moveToCheckoutPage();
       Assert.assertTrue(checkoutPage.isMovedToCheckoutPage());
    }
}
