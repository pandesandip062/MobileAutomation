package testUtils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.appium.java_client.AppiumDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class listners extends ScreenShot implements ITestListener {
   ExtentTest test;
   ExtentReports reports= extentReports.getReporterObject();

   AppiumDriver driver;

    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
        test = reports.createTest(result.getMethod().getMethodName());

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        test.log(Status.PASS,"Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        test.fail(result.getThrowable());

        try {
            driver =(AppiumDriver)result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        try {
            test.addScreenCaptureFromPath(takescernshot(result.getMethod().getMethodName(),driver),result.getMethod().getMethodName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {

    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
        reports.flush();
    }
}
