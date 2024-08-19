package testcomponents;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginResources;

public class LoginNew {
	public WebDriver driver;

	public LoginNew(WebDriver driver) {
		this.driver = driver;
	}

	@Test
	public void login() throws IOException, InterruptedException {
		LoginResources ob = new LoginResources(driver);
		ob.navigateToLoginPage();
		ReadConfig config = new ReadConfig();
		String email = config.getEmail();
		String password = config.getPassword();
		ob.loginToApp(email, password);
		Thread.sleep(5000);
	}

}
