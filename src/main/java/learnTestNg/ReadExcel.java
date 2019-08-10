package learnTestNg;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static String[][] read(String fileName) throws IOException {
//		1. Locate excel file
		XSSFWorkbook book = new XSSFWorkbook("./data/" + fileName + ".xlsx");
		XSSFSheet sheet = book.getSheetAt(0);
		int rowNum = sheet.getLastRowNum();
		short cellNum = sheet.getRow(0).getLastCellNum();
		System.out.println(rowNum);
		System.out.println(cellNum);
		String[][] data = new String[rowNum][cellNum];
		for (int i = 1; i <= rowNum; i++) {
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < cellNum; j++) {
				XSSFCell cell = row.getCell(j);
				data[i - 1][j] = cell.getStringCellValue();
			}
		}
		book.close();
		return data;
	}

}
