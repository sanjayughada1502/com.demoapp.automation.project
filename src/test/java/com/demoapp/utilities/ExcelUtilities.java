package com.demoapp.utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {

	private String filePath = ".\\testdata\\testdata.xlsx"; // Change as needed
	private String sheetName = "ebay_testdata";

	public String getCellData(int rowNum, int colNum) throws IOException {
		String value = "";
		try (FileInputStream fis = new FileInputStream(filePath); Workbook workbook = new XSSFWorkbook(fis)) {
			Sheet sheet = workbook.getSheet(sheetName);
			Row row = sheet.getRow(rowNum);
			if (row == null) {
				return "";
			}
			Cell cell = row.getCell(colNum);
			if (cell == null) {
				return "";
			}
			// Handle all cell types
			switch (cell.getCellType()) {
			case STRING:
				value = cell.getStringCellValue();
				break;
			case NUMERIC:
				value = String.valueOf(cell.getNumericCellValue());
				break;
			case BOOLEAN:
				value = String.valueOf(cell.getBooleanCellValue());
				break;
			case FORMULA:
				value = cell.getCellFormula();
				break;
			default:
				value = "";
			}
		}
		return value;
	}

	public void writeListDataToExcel(int rowIndex, int cellIndex, List<String> dataList) {

		try {
			FileInputStream fis = new FileInputStream(filePath);
			Workbook workbook = new XSSFWorkbook(fis);
			Sheet sheet = workbook.getSheet(sheetName);

			// Create Sheet if not exists
			if (sheet == null) {

				sheet = workbook.createSheet(sheetName);
			}

			// Create row if not exists (Example: Row 1)
			Row row = sheet.getRow(rowIndex);
			if (row == null) {
				row = sheet.createRow(rowIndex);
			}

			// Create cell if not exists (Example: Column 0)
			Cell cell = row.getCell(cellIndex);
			if (cell == null) {
				cell = row.createCell(cellIndex);
			}

			// Write Header
			sheet.createRow(1).createCell(2).setCellValue("Product Names");

			// Write List Data
			for (int i = 1; i < dataList.size(); i++) {

				sheet.createRow(i + 1).createCell(2).setCellValue(dataList.get(i));
			}

			// Set value
			// cell.setCellValue(cellData);

			fis.close();

			// Write back to Excel
			FileOutputStream fos = new FileOutputStream(filePath);
			workbook.write(fos);

			fos.close();
			workbook.close();

			System.out.println("Data saved successfully: ");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
