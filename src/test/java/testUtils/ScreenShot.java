package testUtils;

import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;


public class ScreenShot {

    public static String takescernshot(String testCaseName , AppiumDriver driver) throws IOException {

        File file =driver.getScreenshotAs(OutputType.FILE);
        String dest = "C:\\Users\\Admin\\Desktop\\reports"+testCaseName+".png";
        FileUtils.copyFile(file, new File(dest));
        return dest;



    }
}
