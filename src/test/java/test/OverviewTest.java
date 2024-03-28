package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class OverviewTest extends BaseTest{

  @Test
    public void finishTest(){

      LoginPage loginPage = new LoginPage(driver);
      HomePage homePage = new HomePage(driver);
      ProductPage productPage = new ProductPage(driver);
      CartActions cartActions = new CartActions(driver);
      CheckoutPage checkoutPage = new CheckoutPage(driver);
      OverviewPage overviewPage = new OverviewPage(driver);
      FinishPage finishPage = new FinishPage(driver);

      loginPage.login("standard_user", "secret_sauce");
      homePage.openProduct();
      productPage.addElementToCartPage();
      productPage.moveToCartPage();
      cartActions.moveToCheckoutPage();
      checkoutPage.clickOnContinueBtn();
    overviewPage.clickOnFinishButton();

      Assert.assertTrue(finishPage.isMovedToFinishPage());
  }

}
