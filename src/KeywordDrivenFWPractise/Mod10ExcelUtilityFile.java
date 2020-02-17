package KeywordDrivenFWPractise;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

// this file contains methods to locate and read data from EXcel file
public class Mod10ExcelUtilityFile {

	static Workbook wb;
	static Sheet sh;

// method to locate an Excel file 
	public static void LocateExcelFile(String Path, String SheetName) throws Exception, IOException {

		FileInputStream fis = new FileInputStream(Path);

		wb = WorkbookFactory.create(fis);

		sh = wb.getSheet(SheetName);

	}

	// method to read data from the file
	// IMP: Need to Mention the row and col.
	// read the data and put it in a string container
	
//	 static int rownum; static int colnum; // max limit // trying for generic data reader
	 
	public static String ReadExcelData(int row, int col)
	{
		/*
		 * rownum = sh.getLastRowNum()+1; colnum = sh.getRow(0).getLastCellNum();
		 * 
		 * String Data = sh.getRow(rownum).getCell(colnum).toString();
		 */
				
		String ReadData = sh.getRow(row).getCell(col).toString();

		return ReadData;

	}
}
