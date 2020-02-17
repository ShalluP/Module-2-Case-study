package KeywordDrivenFWPractise;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtilityKDFW {

	static Workbook wb;static Sheet sh; 
	
	public static void FetchExcelSheet(String Path, String SheetName) throws Exception 
	{
	FileInputStream  fis = new FileInputStream(Path);
	
	wb = WorkbookFactory.create(fis);
	sh = wb.getSheet(SheetName);
	
	}
	
	public static String ReadExcelData(int row, int col) 
	{
		String ExcelData = sh.getRow(row).getCell(col).toString();
		
		return ExcelData;
		
	}
	
}
