package week8.day1;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {

		// Step 1: Load Excel File
		// Step 2: Go to the workbook
		XSSFWorkbook wb=new XSSFWorkbook("./data/Status.xlsx");
				
		// Step 3: Go to the sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		// How many rows?
		int lastRowNum = sheet.getLastRowNum();
		System.out.println(lastRowNum);
		
		for (int i = 1; i <= lastRowNum; i++) {
			
			// Step 4: Go to the row
			XSSFRow firstRow = sheet.getRow(i);
			short lastCellNum = firstRow.getLastCellNum();
			
			for (int j = 0; j < lastCellNum; j++) {
				// Step 5: Read the cell
				XSSFCell author = firstRow.getCell(j);
				// Step 6: Print
				String stringCellValue = author.getStringCellValue();
				System.out.println(stringCellValue);
			}
		}
		// Step 7: Close
		wb.close();		
	}

}
