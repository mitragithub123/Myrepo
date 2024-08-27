package demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AppInstallOnEmulator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities decap = new DesiredCapabilities();
        decap.setCapability("platformName", "Android");
        decap.setCapability("appium:automationName", "uiautomator2");
        decap.setCapability("appium:deviceName", "Pixel 7 Pro API 27");
        decap.setCapability("appium:app", "D:\\Mitra\\Appium\\Dummy apps\\Dummy-1.0.apk");
        decap.setCapability("appium:platformVersion", "8.1");
        decap.setCapability("appium:appPackage", "com.techsquare.dummy");
		decap.setCapability("appium:appActivity", "com.techsquare.dummy.SplashActivity");
		decap.setCapability("appium:ignoreHiddenApiPolicyError", true);
		decap.setCapability("appium:androidInstallTimeout", 120000);

		URL url = URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		AndroidDriver driver = new AndroidDriver(url, decap);
		Thread.sleep(5000);
		System.out.println("App started..");
		driver.quit(); //Close session

	}

}
