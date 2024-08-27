package demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Calculator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities decap = new DesiredCapabilities();
		decap.setCapability("platformName", "Android");
		decap.setCapability("appium:automationName", "uiautomator2");
		decap.setCapability("appium:deviceName", "OnePlus CPH2467 API 34");
		decap.setCapability("appium:platformVersion", "14.0");
		
		decap.setCapability("appPackage","com.oneplus.calculator");
		decap.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		decap.setCapability("appium:ignoreHiddenApiPolicyError", true);
		decap.setCapability("appium:androidInstallTimeout", 120000);

		URL url = URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		AndroidDriver driver = new AndroidDriver(url, decap);
		Thread.sleep(5000);
		System.out.println("App started..");
		
		
		driver.quit();

	}

}
