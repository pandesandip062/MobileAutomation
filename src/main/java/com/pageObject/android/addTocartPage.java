package com.pageObject.android;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class addTocartPage {

    public AndroidDriver driver;


    public addTocartPage(AndroidDriver driver) {
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='ADD TO CART']")
    WebElement addToCart;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
    WebElement shopCart;

    @AndroidFindBy(xpath = "//android.widget.CheckBox[@text='Send me e-mails on discounts related to selected products in future']")
    WebElement checkBox;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnProceed")
    WebElement submitProduct;


    public void addProduct(){
        addToCart.click();
    }
    public void viewCart(){
        shopCart.click();
    }
    public void clickChckbox(){
        checkBox.click();
    }

    public void submitProduct(){
        submitProduct.click();
    }
}
