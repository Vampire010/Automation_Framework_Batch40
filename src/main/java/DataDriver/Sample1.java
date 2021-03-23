package DataDriver;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sample1
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./Drivers/UserTestData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		Sheet sh=wb.getSheet("sname");
		Row r =sh.getRow(1);
		Cell c=r.getCell(0);
		String V=c.getStringCellValue();
		System.out.println(V);
		
	}


}
