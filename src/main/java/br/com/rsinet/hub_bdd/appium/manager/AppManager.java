package br.com.rsinet.hub_bdd.appium.manager;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import br.com.rsinet.hub_bdd.appium.dataProviders.ReadProperties;
import io.appium.java_client.android.AndroidDriver;

public class AppManager {
	
	//helloo
	private String URL = "http://127.0.0.1:4723/wd/hub";
	private AndroidDriver driver;
	
	private static Logger logger = Logger.getLogger("ReadProperties.class");
	
	public AndroidDriver getDriver() {
		if(driver == null)
			driver = createDriver();
		return driver;
	}

	private AndroidDriver createDriver() {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Galaxy A30");
		caps.setCapability("udid", "RQ8M704R9EA");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "10");
		caps.setCapability("appPackage", "com.Advantage.aShopping");
		caps.setCapability("appActivity", ".SplashActivity");
		
		try {
			driver = new AndroidDriver(new URL(URL), caps);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}catch (MalformedURLException e) {
			logger.info(e.getMessage());
			e.printStackTrace();
		}
		return driver;
	}
	
	public void closeDriver() {
		driver.closeApp();
	}

}
