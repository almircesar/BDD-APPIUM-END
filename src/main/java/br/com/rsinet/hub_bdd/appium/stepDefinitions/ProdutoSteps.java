package br.com.rsinet.hub_bdd.appium.stepDefinitions;

import static org.junit.Assert.assertTrue;

import br.com.rsinet.hub_bdd.appium.manager.TestContext;
import br.com.rsinet.hub_bdd.appium.pageObject.ProdutoScreen;
import br.com.rsinet.hub_bdd.appium.util.Constant;
import br.com.rsinet.hub_bdd.appium.util.Data;
import br.com.rsinet.hub_bdd.appium.util.ExcelUtils;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class ProdutoSteps {

	private TestContext testContext;
	private ProdutoScreen produtos;

	public ProdutoSteps(TestContext context) throws Exception {
		testContext = context;
		produtos = testContext.getPageObjectManager().getProdutoScreen();
	}
	
	// Pesquisa por texto valida
	@E("^clicar no produto desejado$")
	public void clicar_no_produto_desejado() throws Throwable {
		produtos.click_ProdutoEscolhido(Data.getProduto());
	}
	
	// Pesquisa por categoria valida
	@E("^clicar no produto escolhido$")
	public void clicar_no_produto_escolhido() throws Throwable {
		produtos.click_ProdutoEscolhido(Data.getProduto());
	}

	// Pesquisas validas
	@Entao("^a tela do produto deverá ser exibida$")
	public void a_tela_do_produto_deverá_ser_exibida() throws Throwable {
		assertTrue(produtos.getTituloProduto().contains(Data.getProduto()));
	}
	
	// Pesquisa por texto invalida
	@Entao("^será exibido na tela uma mensagem dizendo que o produto não foi encontrado$")
	public void será_exibido_na_tela_uma_mensagem_dizendo_que_o_produto_não_foi_encontrado() throws Throwable {
		assertTrue(produtos.getMensagemErro().contains("No results for"));
	}

	// Pesquisa por categoria invalida
	@E("^filtrar a pesquisa$")
	public void filtrar_a_pesquisa() throws Throwable {
		Thread.sleep(2000);
		produtos.click_Filter();
		produtos.click_FiltroScroll();
		produtos.click_ScrollOpcao("Smart phone compatibility");
		produtos.click_FiltroScroll();
		produtos.click_FiltroConnector();
		produtos.click_ConnectorOpcao("BlueTooth");
		produtos.click_FiltroConnector();
		produtos.click_Apply();
	}

	@Entao("^nenhum produto será exibido$")
	public void nenhum_produto_será_exibido() throws Throwable {
		assertTrue(produtos.getMensagemErro().contains("No results"));
	}

}
