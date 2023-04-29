package com.anand.structural.facade;

import java.sql.Connection;

public interface ExcelReport {
	
	public void generateExcelReport(Connection connection,String tableName);

}
