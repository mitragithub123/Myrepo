package testcases.login;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.JsonDataReader;
import testcomponents.BaseTest;

public class DataProviderJsonLogin extends BaseTest {
	public WebDriver driver;

	@DataProvider(name = "login")
	public Object[][] getLoginData() throws IOException {
		List<HashMap<String, String>> data = JsonDataReader.getJsonDataToMap("login.json");

		Object[][] testData = new Object[data.size()][];
		for (int i = 0; i < data.size(); i++) {
			testData[i] = new Object[] { data.get(i) };
		}
		return testData;
	}

	@Test(dataProvider = "login")
	public void testLogin(HashMap<String, String> input) throws InterruptedException, IOException {
		DataProviderSheetLogin dpsl = new DataProviderSheetLogin();
		dpsl.loginTest(input.get("email"), input.get("password"));

	}

}
