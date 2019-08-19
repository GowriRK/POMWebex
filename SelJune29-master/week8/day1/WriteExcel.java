package week8.day1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {

	public static void main(String[] args) throws IOException {

		// Step 1: Load Excel File
		// Step 2: Go to the workbook
		XSSFWorkbook wb=new XSSFWorkbook();
				
		// Step 3: Go to the sheet
		XSSFSheet sheet = wb.createSheet("Sheet1");
		
		XSSFRow header = sheet.createRow(0);
		
		XSSFCell cell = header.createCell(0);
		
		cell.setCellValue("Testcase");
		
		FileOutputStream fos = new FileOutputStream(
				new File("./data/report.xlsx"));
		
		wb.write(fos);	
		
		
		wb.close();		
	}

}






