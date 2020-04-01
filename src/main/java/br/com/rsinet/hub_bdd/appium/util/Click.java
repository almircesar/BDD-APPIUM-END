package br.com.rsinet.hub_bdd.appium.util;

import io.appium.java_client.android.AndroidDriver;

public class Click {
	
	public static void ByVisibleText(AndroidDriver driver, String text) {
		driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\""+ text +"\")").click();
	}

}
