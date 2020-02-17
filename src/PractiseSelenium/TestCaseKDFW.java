package PractiseSelenium;

public class TestCaseKDFW {

	public static void main(String[] args) throws Exception {

		String Path = "C:\\Users\\Shallu\\eclipse-workspace\\Selenium Training Practice Edureka\\src\\PractiseSelenium\\MyDataEngine.xlsx";
	
		String SheetName ="Sheet1";
	
	ExcelUtilityKDFW.SetUpExcel(Path, SheetName); 
	
	for (int i =0 ; i<4; i++)  // or i<=3; first row =0 th row  //read data from excel file and move it to the container 
	{
		String keyWords = ExcelUtilityKDFW.getdata(i, 1); // col A =0; col b= 1
	
		if (keyWords.equalsIgnoreCase("OpenBrowser"))
		{
			KeywordDrivenFrameWorkActionKeywords.OpenBrowser();
		}
		else if (keyWords.equals("Navigate"))
		{
			KeywordDrivenFrameWorkActionKeywords.Navigate();
		}
		else if (keyWords.equals("ClickGmail"))
		{
			KeywordDrivenFrameWorkActionKeywords.ClickGmail();
		}
	}
	
	}

}
