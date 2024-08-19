package pageresponsetime;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import testcomponents.BaseTest;

public class SignUpPage extends BaseTest {
    @Test
    public void measureSignUpPageResponseTime() throws IOException, InterruptedException {
        WebDriver driver = initializeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        int iterations = 5;
        long totalTime = 0;

        for (int i = 0; i < iterations; i++) {
            long startTime = System.currentTimeMillis();
            driver.get("https://osbaseleaf.andolasoft.co.in/signup");
            wait.until(ExpectedConditions.titleContains("OSBaseLeaf"));
            long endTime = System.currentTimeMillis();
            long pageLoadTime = endTime - startTime;
            System.out.println("Page " + (i + 1) + " load time: " + (pageLoadTime / 1000.0) + " seconds");
            totalTime += pageLoadTime;
        }

        double avgPageLoadTime = (double) totalTime / (iterations * 1000.0); // Convert totalTime to seconds
        System.out.println("Average page response time: " + avgPageLoadTime + " seconds");

        driver.quit();
    }
}
