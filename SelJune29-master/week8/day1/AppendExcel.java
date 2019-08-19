package week8.day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AppendExcel {

	public static void main(String[] args) throws IOException {

		// Step 1: Load Excel File
		// Step 2: Go to the workbook
		FileInputStream fis= new FileInputStream(
				new File("./data/CreateLead.xlsx"));
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
				
		// Step 3: Go to the sheet
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		XSSFRow header = sheet.getRow(1);
		
		XSSFCell cell = header.createCell(2);
		
		cell.setCellValue("PASS");
		
		FileOutputStream fos = new FileOutputStream(
				new File("./data/CreateLead.xlsx"));
		
		wb.write(fos);	
		
		
		wb.close();		
	}

}






