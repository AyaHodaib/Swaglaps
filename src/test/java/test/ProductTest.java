package test;

import net.bytebuddy.jar.asm.Handle;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartActions;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class ProductTest extends BaseTest {


    By productPrice = By.className("inventory_details_price");

    String Expectedprice = "$15.99";

@Test
public void productprice(){

LoginPage loginPage = new LoginPage(driver);
loginPage.login("standard_user", "secret_sauce");

    HomePage homePage = new HomePage(driver);
    homePage.openProduct();
    String Actualprice = driver.findElement(productPrice).getText();
    Assert.assertEquals(Actualprice,Expectedprice);
}

@Test
    public void addProductToCart(){
    LoginPage loginPage = new LoginPage(driver);
    loginPage.login("standard_user", "secret_sauce");

    HomePage homePage = new HomePage(driver);
    homePage.openProduct();

    ProductPage productPage = new ProductPage(driver);
    productPage.addElementToCartPage();
    productPage.moveToCartPage();

    Assert.assertTrue(productPage.isMovedToCartPage());


}
}
