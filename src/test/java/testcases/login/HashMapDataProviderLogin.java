package testcases.login;

import java.io.IOException;
import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import base.DataProviderTestDataHashMap;
import pages.LoginResources;
import testcomponents.BaseTest;

public class HashMapDataProviderLogin extends BaseTest {
	public WebDriver driver;

	public HashMapDataProviderLogin() {
		super();
	}

	@DataProvider(name = "login")
	public Object[][] getLoginData() {
		return DataProviderTestDataHashMap.getLoginData();
	}

	@Test(dataProvider = "login")
	public void testLogin(HashMap<String, String> input) throws InterruptedException, IOException {
		driver = initializeDriver();
		LoginResources ob = new LoginResources(driver);
		test = extent.createTest("Multiple login Test", "Verify login functionality using hash map");
		test.assignCategory("Multiple login Test");

		test.log(Status.INFO, "Extracting email and passwords through hash map");
		logger.info("Extracting email and passwords through hash map");
		ob.multipleLogin(input.get("email"), input.get("password"));

		test.log(Status.INFO, "Quit driver");
		driver.quit();
	}
}