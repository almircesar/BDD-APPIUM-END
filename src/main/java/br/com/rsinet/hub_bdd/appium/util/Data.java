package br.com.rsinet.hub_bdd.appium.util;

public class Data {
	
	public static String getCategoria() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "produtos");
		return ExcelUtils.getCellData(1, 1);
	}

	public static String getPesquisa() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "produtos");
		return ExcelUtils.getCellData(1, 2);
	}
	
	public static String getProduto() throws Exception {
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "produtos");
		return ExcelUtils.getCellData(1, 0);
	}

}
