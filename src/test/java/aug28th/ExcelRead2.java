package aug28th;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis1=new FileInputStream("D:\\010LiveTech\\jars\\Book1.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis1);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		XSSFRow  row=null;
		
		for(int i=0;i<=ws.getLastRowNum();i++)
		{
			row=ws.getRow(i);
			
			for(int j=0;j<row.getLastCellNum();j++)
			{
				CellType cType=row.getCell(j).getCellType();
				if(cType==CellType.STRING)
				{
					System.out.println(row.getCell(j)+" is a String");
				}
				else if(cType==CellType.NUMERIC)
				{
					System.out.println(row.getCell(j)+" is a Number");
				}
				else if(cType==CellType.BOOLEAN)
				{
					System.out.println(row.getCell(j)+" is a boolean");
				}
					
				
			}
			
		}
		
		
		System.out.println("End of program..");

	}

}
