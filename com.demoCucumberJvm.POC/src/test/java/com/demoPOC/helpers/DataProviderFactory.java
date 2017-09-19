package com.demoPOC.helpers;

import com.demoPOC.helpers.ExcelDataProvider;

public class DataProviderFactory {

	
	public static ExcelDataProvider getExcel() {
		ExcelDataProvider excel = new ExcelDataProvider();
		return excel;
	}
}
