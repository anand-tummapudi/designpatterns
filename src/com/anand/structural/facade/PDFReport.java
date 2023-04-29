package com.anand.structural.facade;

import java.sql.Connection;

public interface PDFReport {
	
	public void generatePDFReport(Connection connection,String tableName);

}
