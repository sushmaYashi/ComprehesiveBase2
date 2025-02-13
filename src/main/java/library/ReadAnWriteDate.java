package library;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAnWriteDate {
	
	String xlfilePath = "E:\\Selenium Projects\\TestData.xlsx";
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	
	public ReadAnWriteDate ()
	{
		try {
		FileInputStream fis= new FileInputStream(new File(this.xlfilePath));
	System.out.println("File Input Stream Created successfully");
	wb = new XSSFWorkbook(fis);
	sheet = wb.getSheetAt(0);
	
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void readSheetData()
	{
		Iterator<Row> rows = sheet.iterator();
		while(rows.hasNext())
		{
			Row currRow = rows.next();
			Iterator<Cell> cells = currRow.cellIterator();
			while(cells.hasNext())
			{
			Cell currCell = cells.next();
			CellType cType = currCell.getCellType();
			
			
			String value = "";
			if(cType == CellType.STRING)
			{
			 value = currCell.getStringCellValue();
				System.out.println("Value for cell:"+value);
			}
			else if(cType == CellType.NUMERIC)
				
			{
				value = ""+ currCell.getNumericCellValue();
				System.out.println("Value for cell:"+value);
				}
			}
			
		}
		
		
	}
	public static void main(String args[])
	{
		ReadAnWriteDate xl = new ReadAnWriteDate();
		xl.readSheetData();
	}

}
