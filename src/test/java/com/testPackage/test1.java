package com.testPackage;

import com.pageObject.android.addTocartPage;
import com.pageObject.android.formPage;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testUtils.extentReports;

import java.util.concurrent.TimeUnit;
@Listeners(testUtils.listners.class)
public class test1 extends baseClass {


 extentReports report;

    @Test(groups = "smoke")
    public void formFill() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        formPage form = new formPage(driver);
        form.setCountry("India");
        form.enterName("");
        form.selectGender("female");
        form.submitForm();
        // quitApp();


    }



}
