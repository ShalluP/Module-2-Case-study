package PractiseSelenium;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

// Read Excel files and import the data from the excel file
// set up method for location of sheet
// another method to read the data from the excel file

public class ExcelUtilityKDFW {
	
	static Workbook wb; // because these are to be used in the main file/method
	static Sheet sh;

	public static void SetUpExcel(String Path, String SheetName) throws Exception // to interact with excel file
	// give the location of the excel file, like File I/P Stream or Excel path
	{
		FileInputStream fis = new FileInputStream(Path); // path can be put from Test case class file
		
		wb = WorkbookFactory.create(fis);
		
		sh = wb.getSheet(SheetName); // sheet name can be defined from any test case file
		
	}
	
	public static String getdata(int rowno , int colno) {
		
		String Data = sh.getRow(rowno).getCell(colno).toString(); // content of the cell is taken in Data container as String data type.
	
	return Data;
	
	}

}
