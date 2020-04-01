package br.com.rsinet.hub_bdd.appium.stepDefinitions;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.cucumber.listener.Reporter;

import br.com.rsinet.hub_bdd.appium.manager.AppManager;
import br.com.rsinet.hub_bdd.appium.manager.TestContext;
import br.com.rsinet.hub_bdd.appium.runner.TestRunner;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;

public class Hooks {
	private TestContext testContext;
	private AppManager manager;
	private AndroidDriver driver;

	public Hooks(TestContext context) {
		testContext = context;
		manager = testContext.getAppManager();
		driver = manager.getDriver();
	}
	
	@Before
	public void BeforeSteps() {
		manager.getDriver();
	}

	@After(order = 1)
	public void afterScenario(Scenario scenario) {

		String screenshotName = scenario.getName().replaceAll(" ", "_");
		File screenshot = ((TakesScreenshot) manager.getDriver()).getScreenshotAs(OutputType.FILE);
		File destinationPath = new File(TestRunner.caminhoPasta + "/" + screenshotName + ".png");
		try {
			FileUtils.copyFile(screenshot, destinationPath);
			Reporter.addScreenCaptureFromPath(destinationPath.toString());
		} catch (Exception e) {
			System.out.println("Houveram problemas ao copiar o arquivo para a pasta" + e.getMessage());
		}
	}

	@After(order = 0)
	public void AfterSteps() {
		testContext.getAppManager().closeDriver();
	}

}
