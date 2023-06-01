package DatadrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FeachDataFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
            
		FileInputStream fis = new FileInputStream("./testdata/exceldata.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(0);
		String customerName2 = cell.getStringCellValue();
		System.out.println("the customer2 name is: "+customerName2);

	}

}
