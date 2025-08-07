
package testcases;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static String[][] readData(String filename) throws IOException {
		// To open the workbook
		XSSFWorkbook wb = new XSSFWorkbook("./ExcelData/" +filename+".xlsx");

		// To open the worksheet
		// wb.getSheet("Sheet1");
		XSSFSheet ws = wb.getSheetAt(0);

		// To count the number of rows
		// including header
		int physicalNumberOfRows = ws.getPhysicalNumberOfRows();
		System.out.println("Including header: " + physicalNumberOfRows);

		// excluding header
		int rowCount = ws.getLastRowNum();
		System.out.println("The row count is: " + rowCount);

		// To count the column
		int columnCount = ws.getRow(0).getLastCellNum();
		System.out.println("The ColumnCount is: " + columnCount);

		// To retrieve a single data
		String row1Cell1Value = ws.getRow(1).getCell(1).getStringCellValue();
		System.out.println("The value is: " + row1Cell1Value);

		String[][] data = new String[rowCount][columnCount];

		// To retrieve the entire data
		// 1 2 rowCount=2
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow row = ws.getRow(i);
			// XSSFRow row2 = ws.getRow(2);
			// 0 1 2 columnCount=3
			for (int j = 0; j < columnCount; j++) {
				String allData = row.getCell(j).getStringCellValue();
				//// String allData = row1.getCell(2).getStringCellValue(); //R
				data[i - 1][j] = allData;
			
			}

		}
		wb.close();
		return data;
	}
}