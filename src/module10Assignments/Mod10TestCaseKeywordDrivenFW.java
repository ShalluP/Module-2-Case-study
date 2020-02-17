package module10Assignments;

import java.io.IOException;

import KeywordDrivenFWPractise.Mod10ExcelUtilityFile;

public class Mod10TestCaseKeywordDrivenFW {

	public static void main(String[] args) throws IOException, Exception {
		
		String Path = "C:\\Users\\Shallu\\eclipse-workspace"
				+ "\\Selenium Training Practice Edureka\\src\\module10Assignments\\Mod10ExcelSheet.xlsx";
		String SheetName ="Sheet1";
		
		//call Excel Sheet Method to reach the excel sheet
		//Static methods created, can be called directly without creating objects for the class
		//just using class name and method name
		
		Mod10ExcelUtilityFile.LocateExcelFile(Path, SheetName); 
	
		//Read the data from the excel file/sheet and check for methods/keywords/actions to be executed on the AUT
		
		/*OpenBrowser
		OpenAUT
		LogIn
		UserName
		Password
		ClickLogIn
		SearchBox
		SelCourse
		EnrolPay
		ProceedPay
		PayPal
		ClickCont
		PayLogIn*/

		 for (int i =0; i<=14; i++)
		 {
		String keywordsString = Mod10ExcelUtilityFile.ReadExcelData(i, 1);
			
		if(keywordsString.equals("OpenBrowser"))
		{
			Mod10ActionKeywords.OpenBrowser();
		}
		else if (keywordsString.equals("OpenAUT"))
		{
			Mod10ActionKeywords.OpenAUT();
		}
		else if (keywordsString.equals("LogIn"))
		{
			Mod10ActionKeywords.LogIn();
		}
		else if (keywordsString.equals("UserName"))
		{
			Mod10ActionKeywords.UserName();
		}
		else if (keywordsString.equals("Password"))
		{
			Mod10ActionKeywords.Password();
		}
		else if (keywordsString.equals("ClickLogIn"))
		{
			Mod10ActionKeywords.ClickLogIn();
		}
		else if (keywordsString.equals("SearchBox"))
		{
			Mod10ActionKeywords.SearchBox();
		}
		else if (keywordsString.equals("SelCourse"))
		{
			Mod10ActionKeywords.SelCourse();
		}
		else if (keywordsString.equals("EnrolPay"))
		{
			Mod10ActionKeywords.EnrolPay();
		}
		else if (keywordsString.equals("ProceedPay"))
		{
			Mod10ActionKeywords.ProceedPay();
		}
		else if (keywordsString.equals("PayPal"))
		{
			Mod10ActionKeywords.PayPal();	
		}
		else if (keywordsString.equals("ClickCont"))
		{
			Mod10ActionKeywords.ClickCont();
		}
		else if (keywordsString.equals("PayLogIn"))
		{
			Mod10ActionKeywords.PayLogIn();	
		}
		
		}
	
	}

}
