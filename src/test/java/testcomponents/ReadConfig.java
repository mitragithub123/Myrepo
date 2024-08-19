package testcomponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	private Properties properties;
	private String path;

	public ReadConfig() {
		properties = new Properties();
		path = System.getProperty("user.dir") + "\\src\\test\\java\\resources\\GlobalData.properties";
		try (FileInputStream fis = new FileInputStream(path)) {
			properties.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getUrl() {
		String value = properties.getProperty("url");
		if (value != null && !value.isEmpty()) {
			return value;
		} else {
			throw new RuntimeException("URL not specified in config file.");
		}
	}
	
	public String getUrlSignUp() {
		String value = properties.getProperty("urlSignUp");
		if (value != null && !value.isEmpty()) {
			return value;
		} else {
			throw new RuntimeException("URL not specified in config file.");
		}
	}

	public String getEmail() {
		return properties.getProperty("loginemail");
	}

	public String getPassword() {
		return properties.getProperty("loginpassword");
	}

	public ReadConfig(String email, String password) {
		properties = new Properties();
		properties.setProperty("loginemail", email);
		properties.setProperty("loginpassword", password);
	}
}
