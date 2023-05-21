package readDataFromExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadexcelData {
    //read dat from ipl excel sheet
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
    
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");//provid the path of excel fiel
		Workbook wb = WorkbookFactory.create(fis);// make the file ready for read
		Sheet sheet = wb.getSheet("IPL");//get into the sheet
		Row row = sheet.getRow(3);//get into desired row
		Cell cell = row.getCell(1);//get into desired cell
		String data = cell.getStringCellValue();//read the value from cell
		System.out.println(data);
		
		
		

	}

}
