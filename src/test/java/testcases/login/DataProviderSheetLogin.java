package testcases.login;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import base.ExcelDataReader;
import pages.LoginResources;
import testcomponents.BaseTest;

public class DataProviderSheetLogin extends BaseTest {

	@DataProvider(name = "loginData")
	public Object[][] loginData() throws IOException {
		String excelPath = "D:\\testdatalogin.xlsx";
		return ExcelDataReader.readExcelData(excelPath);
	}

	@Test(dataProvider = "loginData")
	public void loginTest(String email, String password) throws IOException, InterruptedException {
		driver = initializeDriver();
		LoginResources ob = new LoginResources(driver);
		test = extent.createTest("Login Test using dataProvider", "Verify login functionality");
		test.assignCategory("Login Test dataProvider");

		test.log(Status.INFO, "Navigate to OS Login page");
		logger.info("Navigate to OS Login page");
		ob.navigateToLoginPage();

		test.log(Status.INFO, "Login page submission");
		logger.info("Login page submission");
		ob.multipleLogin(email, password);

		test.log(Status.INFO, "URL validation");
		logger.info("URL validation");
		ob.validateUrl(driver);

	}
}
