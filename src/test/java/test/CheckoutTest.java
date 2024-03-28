package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CheckoutTest extends BaseTest {

    @Test
        public void checkoutTest (){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartActions cartActions = new CartActions(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        OverviewPage overviewPage = new OverviewPage(driver);

        loginPage.login("standard_user", "secret_sauce");
        homePage.openProduct();
        productPage.addElementToCartPage();
        productPage.moveToCartPage();
        cartActions.moveToCheckoutPage();
     checkoutPage.clickOnContinueBtn();

Assert.assertTrue(overviewPage.isMovedToOverview());





    }
}
