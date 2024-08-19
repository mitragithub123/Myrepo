package pageresponsetime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.util.PageResponseTimeUtil;

import pages.LoginResources;
import pages.ProjectListingResources;
import testcomponents.BaseTest;

public class ProjectDetailsPage extends BaseTest {

	@Test
	public void measureProjectDetailsPageResponseTime() throws IOException, InterruptedException {
		WebDriver driver = initializeDriver();
		LoginResources loginPage = new LoginResources(driver);

		 loginPage.navigateToLoginPage(); 

		int iterations = 5;
		double totalResponseTime = 0;

		for (int i = 0; i < iterations; i++) {
			double responseTimeInSeconds = PageResponseTimeUtil.measureResponseTimeInSeconds(() -> {
				try {
					loginPage.loginToApp("sriram1@gmail.com", "123");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
			try {
				ProjectListingResources plr = new ProjectListingResources(driver);
				plr.clickProjectName();
			} catch (Exception e) {
				e.printStackTrace();
			}
			totalResponseTime += responseTimeInSeconds;
			System.out.println("Response time for iteration " + (i + 1) + ": " + responseTimeInSeconds + " seconds");
		}
		double averageResponseTime = totalResponseTime / iterations;

		System.out.println(
				"Average page response time over " + iterations + " iterations: " + averageResponseTime + " seconds");
		
		Assert.assertTrue(false);

		driver.quit();
	}
}
