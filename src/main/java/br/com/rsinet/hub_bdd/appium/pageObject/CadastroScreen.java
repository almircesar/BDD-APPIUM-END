package br.com.rsinet.hub_bdd.appium.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_bdd.appium.util.Scroll;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class CadastroScreen {
	
	private AndroidDriver driver;
	
	public CadastroScreen(AndroidDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextUserName']/child::*[1]")
	private WebElement txtbx_Username;

	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextEmail']/child::*[1]")
	private WebElement txtbx_Email;
	
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextPassword']/child::*[1]")
	private WebElement txtbx_Senha;
	
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextConfirmPassword']/child::*[1]")
	private WebElement txtbx_ConfirmarSenha;
	
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextLastName']/child::*[1]")
	private WebElement txtbx_Sobrenome;
	
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextFirstName']/child::*[1]")
	private WebElement txtbx_Nome;
	
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextPhoneNumber']/child::*[1]")
	private WebElement txtbx_Telefone;
	
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextState']/child::*[1]")
	private WebElement txtbx_Estado;
	
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextStreet']/child::*[1]")
	private WebElement txtbx_Endereco;
	
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextCity']/child::*[1]")
	private WebElement txtbx_Cidade;
	
	@FindBy(how = How.XPATH, using = "//*[@resource-id='com.Advantage.aShopping:id/AosEditTextZip']/child::*[1]")
	private WebElement txtbx_CEP;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/linearLayoutCountry")
	private WebElement listbx_Pais;
	
	@FindBy(how = How.ID, using = "com.Advantage.aShopping:id/buttonRegister")
	private WebElement btn_Registrar;
	
	public void escreveUser(String username) {
		txtbx_Username.click();
		txtbx_Username.sendKeys(username);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	
	public void escreveEmail(String email) {
		txtbx_Email.sendKeys(email);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	
	public void escreveSenha(String senha) {
		txtbx_Senha.sendKeys(senha);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	
	public void escreveConfirmaSenha(String senha) {
		txtbx_ConfirmarSenha.sendKeys(senha);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	
	public void escreveSobrenome(String sobrenome) {
		txtbx_Sobrenome.sendKeys(sobrenome);
	}
	
	public void escreveNome(String nome) {
		txtbx_Nome.click();
		txtbx_Nome.sendKeys(nome);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	
	public void escreveTelefone(String telefone) {
		txtbx_Telefone.sendKeys(telefone);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	
	public void escreveEstado(String estado) {
		txtbx_Estado.click();
		txtbx_Estado.sendKeys(estado);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	
	public void escreveEndereco(String endereco) {
		txtbx_Endereco.sendKeys(endereco);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	
	public void escreveCidade(String cidade) {
		txtbx_Cidade.click();
		txtbx_Cidade.sendKeys(cidade);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
	
	public void escreveCEP(String CEP) {
		txtbx_CEP.sendKeys(CEP);
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}
	
	public void click_Register() {
		Scroll.onlyScroll(driver, "REGISTER");
		Scroll.swipe(523, 1400, 523, 1300, driver);
		btn_Registrar.click();
	}
	
	public void escolhePais(String pais) {
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		Scroll.scrollAndClick(driver, pais);
	}
	
	public Boolean verificarBtnRegistrar() {
		return btn_Registrar.isEnabled();
	}
}
