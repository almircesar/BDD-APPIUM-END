package br.com.rsinet.hub_bdd.appium.util;

import java.io.File;

public class CriarPastaPrint {

	private static String diretorioPasta = System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + HoraData.horas();

	public static void PastaScreenshot() {
		File pastaPrint = new File(diretorioPasta);
		pastaPrint.mkdir();
	}

}
