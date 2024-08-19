package testcases.projectsettings;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import pages.ProjectSettingsResourceCostResources;
import testcomponents.BaseTest;
import testcomponents.Login;

public class ResourceCost extends BaseTest {
	@BeforeMethod
	public void resource() throws IOException, InterruptedException {
		Login login = new Login();
		test = extent.createTest("Project settings resource cost Test",
				"Verify project settings resource cost functionality");
		test.assignCategory("Project settings resource cost Test");
		login.login();

		ProjectSettingsResourceCostResources psrcr = new ProjectSettingsResourceCostResources(driver);
		test.log(Status.INFO, "Navigate to project settings resource cost");
		psrcr.navigateToResourceCost();
	}

	@Test(priority = 1)
	public void addResourceCostData() throws IOException, InterruptedException {
		ProjectSettingsResourceCostResources psrcr = new ProjectSettingsResourceCostResources(driver);
		test.log(Status.INFO, "Add resource");
		psrcr.addResource();
		test.log(Status.INFO, "Success toast message comparison");
		psrcr.compareToastMessage("Resource created successfully!");
		boolean isResourcePresent = psrcr.isResourcePresent(driver, "MitraBhanu");
		Assert.assertTrue(isResourcePresent, "Resource is not present on the page.");
	}

	@Test(priority = 2)
	public void addResourceCostDataNegative() throws IOException, InterruptedException {
		ProjectSettingsResourceCostResources psrcr = new ProjectSettingsResourceCostResources(driver);
		test.log(Status.INFO, "Close & cancel button validations");
		psrcr.addResourceNegativeValidation();
	}

	@Test(priority = 3)
	public void addResourceCost() throws IOException, InterruptedException {
		ProjectSettingsResourceCostResources psrcr = new ProjectSettingsResourceCostResources(driver);
		test.log(Status.INFO, "Add cost to client and company");
		psrcr.addCost();
		test.log(Status.INFO, "Update toast message comparison");
		psrcr.compareToastMessage("Resource updated successfully!");
	}

	@Test(priority = 4)
	public void resetResourceCost() throws IOException, InterruptedException {
		ProjectSettingsResourceCostResources psrcr = new ProjectSettingsResourceCostResources(driver);
		test.log(Status.INFO, "Reset cost of client and company");
		psrcr.resetCost();
		test.log(Status.INFO, "Reset toast message comparison");
		psrcr.compareToastMessage("Resource reset successfully!");

	}
}
