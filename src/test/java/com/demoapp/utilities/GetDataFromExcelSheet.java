package com.demoapp.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetDataFromExcelSheet {

    private GetDataFromExcelSheet() {
        // Utility class - prevent object creation
    }

    /**
     * Get data from a specific cell.
     *
     * @param filePath  Excel file path
     * @param sheetName Sheet name
     * @param rowNumber Row number (0-based)
     * @param columnNumber Column number (0-based)
     * @return Cell value as String
     */
    public static String getCellData(
            String filePath,
            String sheetName,
            int rowNumber,
            int columnNumber) {

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);

            if (sheet == null) {
                throw new RuntimeException(
                        "Sheet not found: " + sheetName);
            }

            Row row = sheet.getRow(rowNumber);

            if (row == null) {
                throw new RuntimeException(
                        "Row not found: " + rowNumber);
            }

            DataFormatter formatter = new DataFormatter();

            return formatter.formatCellValue(
                    row.getCell(columnNumber));

        } catch (IOException e) {
            throw new RuntimeException(
                    "Unable to read Excel file: " + filePath, e);
        }
    }

    /**
     * Get complete Excel data.
     *
     * @param filePath  Excel file path
     * @param sheetName Sheet name
     * @return 2D String array containing Excel data
     */
    public static String[][] getExcelData(
            String filePath,
            String sheetName) {

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);

            if (sheet == null) {
                throw new RuntimeException(
                        "Sheet not found: " + sheetName);
            }

            int rowCount = sheet.getPhysicalNumberOfRows();
            int columnCount = sheet.getRow(0).getLastCellNum();

            String[][] data = new String[rowCount - 1][columnCount];

            DataFormatter formatter = new DataFormatter();

            // Skip header row
            for (int i = 1; i < rowCount; i++) {

                Row row = sheet.getRow(i);

                for (int j = 0; j < columnCount; j++) {

                    if (row != null && row.getCell(j) != null) {
                        data[i - 1][j] =
                                formatter.formatCellValue(row.getCell(j));
                    } else {
                        data[i - 1][j] = "";
                    }
                }
            }

            return data;

        } catch (IOException e) {
            throw new RuntimeException(
                    "Unable to read Excel file: " + filePath, e);
        }
    }

    /**
     * Get total number of rows excluding header.
     */
    public static int getRowCount(
            String filePath,
            String sheetName) {

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);

            if (sheet == null) {
                throw new RuntimeException(
                        "Sheet not found: " + sheetName);
            }

            return sheet.getPhysicalNumberOfRows() - 1;

        } catch (IOException e) {
            throw new RuntimeException(
                    "Unable to read Excel file: " + filePath, e);
        }
    }

    /**
     * Get total number of columns.
     */
    public static int getColumnCount(
            String filePath,
            String sheetName) {

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);

            if (sheet == null) {
                throw new RuntimeException(
                        "Sheet not found: " + sheetName);
            }

            return sheet.getRow(0).getLastCellNum();

        } catch (IOException e) {
            throw new RuntimeException(
                    "Unable to read Excel file: " + filePath, e);
        }
    }
}