package testcomponents;

import java.io.IOException;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class Listner extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {

		test = extent.createTest(result.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(result.getName().toUpperCase(), ExtentColor.GREEN));

	}

	@Override
	public void onTestSuccess(ITestResult result) {

		test.log(Status.PASS, "Test Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {

		test.log(Status.FAIL, result.getThrowable().getMessage());
		test.log(Status.FAIL, MarkupHelper.createLabel(result.getName().toUpperCase(), ExtentColor.RED));
		try {
			test.addScreenCaptureFromPath(captureScreenshot(BaseTest.driver));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
