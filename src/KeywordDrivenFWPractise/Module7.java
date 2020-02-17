package KeywordDrivenFWPractise;

public class TestCaseKDFW {

	public static void main(String[] args) throws Exception {

		String Path = "C:\\Users\\Shallu\\eclipse-workspace\\Selenium Training Practice Edureka\\src\\KeywordDrivenFWPractise\\ExcelSheetKWDFW.xlsx";
		String SheetName = "Sheet1";

		ExcelUtilityKDFW.FetchExcelSheet(Path, SheetName);

		for (int i = 1; i <= 7; i++)
		{
			String Keywords = ExcelUtilityKDFW.ReadExcelData(i, 1);
			
			if (Keywords.equals("OpenBrowser")) {
				ActionKeywordsKDFW.OpenBrowser();
			}
			else if (Keywords.equals("Navigate")) {
				ActionKeywordsKDFW.Navigate();
			}

			else if (Keywords.equals("Input_Username")) {
				ActionKeywordsKDFW.Input_Username();
			}

			else if (Keywords.equals("Input_Password")) {
				ActionKeywordsKDFW.Input_Password();
			}
			
			else if (Keywords.equals("Click_Login")) {
				ActionKeywordsKDFW.Click_Login();;
			}
			else if (Keywords.equals("Verify_Login")) {
				ActionKeywordsKDFW.Verify_Login();
			}
			else if (Keywords.equals("CloseBrowser")) {
				ActionKeywordsKDFW.CloseBrowser();
			}
		}

	}

}
