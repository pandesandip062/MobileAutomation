package com.pageObject.android;

import com.actions.AndroidActins;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class formPage extends AndroidActins {

    public AndroidDriver driver;


    @AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
    public WebElement nameField;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/radioMale")
    private WebElement radioButtonMale;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/radioFemale")
    private WebElement radioButtonfemale;

    @AndroidFindBy(id = "btnLetsShop")
    private WebElement submitButton;

    @AndroidFindBy(id = "android:id/text1")
    public WebElement dropDown;





    public formPage(AndroidDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    public void enterName(String name) {
        nameField.sendKeys(name);
    }

    public void selectGender(String gender) {
        if (gender == "male") {
            radioButtonMale.click();
        } else if (gender == "female") {
            radioButtonfemale.click();
        }

    }

    public void setCountry(String name) {
        dropDown.click();
        action1(name);
        driver.findElement(By.xpath("//android.widget.TextView[@text='"+name+"']")).click();
    }

    public void submitForm(){
        submitButton.click();
    }
}


