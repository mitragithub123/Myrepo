package testcases.signup;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.JsonDataReader;
import testcomponents.BaseTest;

public class DataProviderJsonSignUp extends BaseTest {
	public WebDriver driver;

	@DataProvider(name = "signup")
	public Object[][] getLoginData() throws IOException {
		List<HashMap<String, String>> data = JsonDataReader.getJsonDataToMap("signup.json");

		Object[][] testData = new Object[data.size()][];
		for (int i = 0; i < data.size(); i++) {
			testData[i] = new Object[] { data.get(i) };
		}
		return testData;
	}

	@Test(dataProvider = "signup")
	public void testSignUp(HashMap<String, String> input) throws InterruptedException, IOException {
		DataProviderSheetSignUp dpss = new DataProviderSheetSignUp();
		dpss.loginTest(input.get("email"), input.get("password"));

	}

}
