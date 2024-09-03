package testUtils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class extentReports {


    static ExtentReports extent;

    public static ExtentReports getReporterObject()  {

        ExtentSparkReporter rep = new ExtentSparkReporter("C:\\Users\\Admin\\Desktop\\reports\\index.html");
        rep.config().setReportName("sandip");
        rep.config().setDocumentTitle("SandipPande");

        extent= new ExtentReports();
        extent.attachReporter(rep);
        extent.setSystemInfo("tester","sandip Pande");
        return extent;
    }
}
