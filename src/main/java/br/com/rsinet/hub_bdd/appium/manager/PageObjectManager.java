package br.com.rsinet.hub_bdd.appium.manager;

import br.com.rsinet.hub_bdd.appium.pageObject.CadastroScreen;
import br.com.rsinet.hub_bdd.appium.pageObject.HomeScreen;
import br.com.rsinet.hub_bdd.appium.pageObject.ProdutoScreen;
import io.appium.java_client.android.AndroidDriver;

public class PageObjectManager {

	private AndroidDriver driver;
	private HomeScreen home;
	private CadastroScreen cadastro;
	private ProdutoScreen produtos;
	
	public PageObjectManager(AndroidDriver driver) {
		this.driver = driver;
	}
	
	public HomeScreen getHomeScreen() {
		return (home == null) ? home = new HomeScreen(driver) : home;
	}

	public CadastroScreen getCadastroScreen() {
		return (cadastro == null) ? cadastro = new CadastroScreen(driver) : cadastro;
	}

	public ProdutoScreen getProdutoScreen() {
		return(produtos == null) ? produtos = new ProdutoScreen(driver) : produtos;
	}
	
}
