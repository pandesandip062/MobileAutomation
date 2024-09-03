package com.testPackage;

import com.pageObject.android.addTocartPage;
import com.pageObject.android.formPage;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class test2 extends baseClass
{
    @Test(groups = "Regression")
    public void addToCart() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        addTocartPage cart = new addTocartPage(driver);
        formPage form = new formPage(driver);
        form.setCountry("India");
        form.enterName("sandip");
        form.selectGender("female");
        form.submitForm();
        cart.addProduct();
        cart.viewCart();
        cart.clickChckbox();
        cart.submitProduct();


    }


}
