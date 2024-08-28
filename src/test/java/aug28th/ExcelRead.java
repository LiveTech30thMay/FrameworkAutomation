package aug28th;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis1=new FileInputStream("D:\\010LiveTech\\jars\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis1);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		System.out.println("Last row number "+ws.getLastRowNum());
		
		System.out.println("No of rows "+ws.getPhysicalNumberOfRows());
		
		System.out.println("last cell number "+ws.getRow(2).getLastCellNum());	
		
		System.out.println("last cell number "+ws.getRow(2).getPhysicalNumberOfCells());	
		
		
		System.out.println(ws.getRow(2).getCell(0));
		
		
		System.out.println("End of program..");

	}

}
