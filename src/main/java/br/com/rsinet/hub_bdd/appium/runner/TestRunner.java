package br.com.rsinet.hub_bdd.appium.runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import br.com.rsinet.hub_bdd.appium.util.CriarPastaPrint;
import br.com.rsinet.hub_bdd.appium.util.HoraData;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Feature",
		glue = {"br.com.rsinet.hub_bdd.appium.stepDefinitions"},
		plugin = { "pretty", "json:target/cucumber-reports/json-report.json", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/extent-report.html"},
		monochrome = true
		)
public class TestRunner {
	
	public static String caminhoPasta = System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/"
			+ HoraData.horas();


	@BeforeClass
	public static void criarPasta() {
		CriarPastaPrint.PastaScreenshot();
	}
	
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir") + "/configs/extension-config.xml"));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 10" + " 64 Bit");
		Reporter.setSystemInfo("Android", "9");
		Reporter.setSystemInfo("Appium", "7.3.0");
		Reporter.setSystemInfo("cucumber-java", "1.2.5");
		Reporter.setSystemInfo("cucumber-junit", "1.2.5");
		Reporter.setSystemInfo("Maven", "4.0.0");
		Reporter.setSystemInfo("Java Version", "1.8");
	}
	
}
