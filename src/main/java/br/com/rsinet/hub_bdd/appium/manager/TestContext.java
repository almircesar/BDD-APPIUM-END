package br.com.rsinet.hub_bdd.appium.manager;

public class TestContext {
	
	private AppManager appManager;
	private PageObjectManager pageObjectManager;
	
	public TestContext() {
		appManager = new AppManager();
		pageObjectManager = new PageObjectManager(appManager.getDriver());
	}
	
	public AppManager getAppManager() {
		 return appManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

}
