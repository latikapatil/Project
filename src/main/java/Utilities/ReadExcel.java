package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ReadExcel{
	
	int row,col;
	
	public static String readExcel(int row,int col) throws IOException {
	File path = new File("C:\\Users\\Latika\\eclipse-workspace\\ZerodhaProject\\src\\test\\resources\\BA032A10.xlsx");
	FileInputStream input = new FileInputStream(path);
	XSSFWorkbook wb = new XSSFWorkbook(input);
	XSSFSheet sheet = wb.getSheet("Login");
	String value = sheet.getRow(row).getCell(col).getStringCellValue();
	return value;
}
	
	public static void readExcelforloop() throws IOException
	{
		File path = new File("C:\\Users\\Latika\\eclipse-workspace\\ZerodhaProject\\src\\test\\resources\\BA032A10.xlsx");
		FileInputStream input = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(input);
		XSSFSheet sheet = wb.getSheet("Login");
		int rowcount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		for(int i=1;i<=rowcount;i++)
		{
			String value = sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}
		
		
		
		
	}
	
	
	

	
	

}	



	

