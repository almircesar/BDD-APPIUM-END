package br.com.rsinet.hub_bdd.appium.stepDefinitions;

import static org.junit.Assert.assertTrue;

import br.com.rsinet.hub_bdd.appium.manager.TestContext;
import br.com.rsinet.hub_bdd.appium.pageObject.HomeScreen;
import br.com.rsinet.hub_bdd.appium.pageObject.ProdutoScreen;
import br.com.rsinet.hub_bdd.appium.util.Constant;
import br.com.rsinet.hub_bdd.appium.util.Data;
import br.com.rsinet.hub_bdd.appium.util.ExcelUtils;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class HomeSteps {

	private HomeScreen home;
	private TestContext testContext;
	private ProdutoScreen produtos;

	public HomeSteps(TestContext context) {
		testContext = context;
		home = testContext.getPageObjectManager().getHomeScreen();
		produtos = testContext.getPageObjectManager().getProdutoScreen();
	}

	@Dado("^que eu esteja com o app aberto$")
	public void que_eu_esteja_com_o_app_aberto() throws Throwable {

	}

	@Quando("^eu navegar até a página de cadastro$")
	public void eu_navegar_até_a_página_de_cadastro() throws Throwable {
		home.click_Menu();
		home.click_Login();
		home.click_SignUp();
	}

	@Quando("^eu pesquisar na barra de pesquisa por um produto valido$")
	public void eu_pesquisar_na_barra_de_pesquisa_por_um_produto_valido() throws Throwable {
		home.click_Lupa();
		home.escreverPesquisa(Data.getPesquisa());
		home.click_Lupa();
	}

	@Quando("^eu pesquisar na barra de pesquisa por um produto invalido$")
	public void eu_pesquisar_na_barra_de_pesquisa_por_um_produto_invalido() throws Throwable {
		home.click_Lupa();
		home.escreverPesquisa("Celular");
		home.click_Lupa();
	}

	
	@Quando("^eu clicar em uma categoria$")
	public void eu_clicar_em_uma_categoria() throws Throwable {
		home.click_Categoria(Data.getCategoria());
		
	}
}
