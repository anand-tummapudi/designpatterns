package com.anand.structural.facade;

import java.sql.Connection;

public class FacadeClient {
	
	public static void main(String args[]) {
		Connection connetion = null;
		String tableName="student_marks";
		
		PDFReport pdfReport = new PDFReportImpl();
		pdfReport.generatePDFReport(connetion, tableName);
		
		HTMLReport htmlReport = new HTMLReportImpl();
		htmlReport.generateHTMLReport(connetion, tableName);
		
		ExcelReport excelReport = new ExcelReportImpl();
		excelReport.generateExcelReport(connetion, tableName);
		
		ReportFacade reportfacade = new ReportFacade();
		
		reportfacade.generatePDFReport(connetion, tableName);
		reportfacade.generateHTMLReport(connetion, tableName);
		reportfacade.generateExcelReport(connetion, tableName);
		
		
	}

}
