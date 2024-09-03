package com.testPackage;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class baseClass {
    public AppiumDriverLocalService service;
    public AndroidDriver driver ;
    @BeforeClass (alwaysRun = true)
    public void configuration() throws MalformedURLException {

        service= new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Admin\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
        service.start();
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Sandip");
        options.setApp("C:\\Users\\Admin\\IdeaProjects\\firstProjectMobile\\src\\test\\app\\General-Store.apk");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723"), options);
    }
   /* @AfterTest(alwaysRun = true)
    public void preSetUp(){
        *//*driver.executeScript("mobile: startActivity", ImmutableMap.of(
               "intent", "com.androidsample.generalstore/com.androidsample.generalstore.MainActivity"
       ));*//*

        driver.quit();
        service.stop();
    }*/
}
