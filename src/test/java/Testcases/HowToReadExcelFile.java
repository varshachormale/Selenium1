package Testcases;

import java.io.File;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.testng.annotations.Test;

public class HowToReadExcelFile {
	@Test
	public void readExcel() throws IOException{
		File file=new File("./src/test/resources/Excel.xls");
		
	
		HSSFWorkbook hssfWorkbook= new HSSFWorkbook();
		
		HSSFSheet sheet = hssfWorkbook.getSheet("Sheet1");
		int lastrowNum=sheet.getLastRowNum();
		
		for(int i=1;i<=lastrowNum;i++) {
			
			HSSFRow row=sheet.getRow(i);
			
			
			int lastCellNum=row.getLastCellNum();
			
			for(int j=0;j<lastCellNum;j++) {
				
				System.out.println(row.getCell(j).getStringCellValue()+":");
				
				System.out.println();
			}
			
			
		}
		
		
		
		
		
	}

}
