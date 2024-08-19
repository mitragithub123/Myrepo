package testcomponents;

import java.io.IOException;
import com.aventstack.extentreports.Status;
import pages.QuickTaskPageResources;

public class QuickTask extends BaseTest {
	public void quickTask() throws IOException, InterruptedException {
		//WebDriver driver = initializeDriver();

		QuickTaskPageResources tpr = new QuickTaskPageResources(driver);
		test.log(Status.INFO, "click on quick task");
		tpr.quickTask();

		test.log(Status.INFO, "generate a random task name");
		RandomStringGenerator generator = new RandomStringGenerator();
		String randomTaskTitle = generator.generateRandomString(20);

		test.log(Status.INFO, "Create a task by entering the task title");
		tpr.enterTaskName(randomTaskTitle);
	}
}
