package br.com.rsinet.hub_bdd.appium.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_bdd.appium.manager.AppManager;
import br.com.rsinet.hub_bdd.appium.util.Scroll;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class HomeScreen {
	private AndroidDriver driver;

	public HomeScreen(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewMenu")
	private WebElement btn_Menu;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuUser")
	private WebElement lnk_Login;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewSingUpToday")
	private WebElement lnk_SignUp;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/imageViewSearch")
	private WebElement lupa;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/editTextSearch")
	private WebElement txtbx_Search;

	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/textViewMenuUser")
	private WebElement txt_usuarioLogado;

	public void click_Menu() throws InterruptedException {
		Thread.sleep(3000);
		btn_Menu.click();
	}

	public void click_Login() {
		lnk_Login.click();
	}

	public void click_SignUp() {
		lnk_SignUp.click();
	}

	public void click_Lupa() {
		lupa.click();
	}

	public void escreverPesquisa(String produto) {
		txtbx_Search.sendKeys(produto);
	}
	
	public String usuarioLogado() {
		return txt_usuarioLogado.getText();
	}
	
	public void click_Categoria(String categoria) {
		categoria = categoria.toUpperCase();
		Scroll.scrollAndClick(driver, categoria);
	}
	
}
