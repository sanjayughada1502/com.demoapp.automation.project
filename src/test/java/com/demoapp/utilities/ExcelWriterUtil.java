package com.demoapp.utilities;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.demoapp.extendreports.ExtentTestManager;

public class ExcelWriterUtil {

	public static void writeListDataToExcel(List<String> headers, List<String> rowData, String filePath,
			String sheetName) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet(sheetName);

		// Header Row
		Row headerRow = sheet.createRow(0);

		for (int i = 0; i < headers.size(); i++) {
			headerRow.createCell(i).setCellValue(headers.get(i));
		}

		// Data Row
		Row dataRow = sheet.createRow(1);

		for (int i = 0; i < rowData.size(); i++) {
			dataRow.createCell(i).setCellValue(rowData.get(i));
		}

		// Auto-size columns
		for (int i = 0; i < headers.size(); i++) {
			sheet.autoSizeColumn(i);
		}

		FileOutputStream fos = new FileOutputStream(new File(filePath));

		workbook.write(fos);

		fos.close();
		workbook.close();

		ExtentTestManager.getTest().info("Excel file created successfully.");
	}
}