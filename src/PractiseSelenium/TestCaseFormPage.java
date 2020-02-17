package PractiseSelenium;
import PractiseSelenium.FrameworkFormPage;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// Use testNg to execute and data provider to fetch the data from excel sheet and 
//feed it to the web application. the page oBject model of AUT is to be connected to the test cases
// using TestNg and not with page factory
//Open browser
//Open AUT
//FormFill - Fetch the data from Excel File
//Close Browser

public class TestCaseFormPage {
	WebDriver driver;
	Workbook wb; // wb and sh are to be used outside the dataprovider annotations in the test
					// annotation,
	// so declared globally

	Sheet sh; // Take workbook and sheet from ss.usermodel file
	int numrows;
	int numcols;

	@BeforeSuite
	public void OpenAUT() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://seleniumautomationpractice.blogspot.com/2017/10/automation-testing-sample_28.html");
	}

	@Test(dataProvider = "FeedDataToAUT")	// to give the connectivity between the dataprovider
	
	public void FormFill(String fName, String lName, String add) throws Exception // using the same method as created in POM class file
	{
		FrameworkFormPage Fpage = new FrameworkFormPage(driver); // creating object class for POM class file

		Fpage.FormFill(fName, lName, add);

	}

				 // Fetches the data and @test uses the data provided by the data provider.
						// Object[][] ;; array is used to take the data from the excel sheet.
	// Arrays will be used to fetch the bytes(data) from the excel
	// sheets and feed it to the AUT

// Step1: Give the location of the excel sheet, FIS imported fro iojava

	@DataProvider
	public Object[][] FeedDataToAUT() throws Exception 
		{FileInputStream fis = new FileInputStream(
				"C:\\Users\\Shallu\\eclipse-workspace\\Selenium Training Practice Edureka\\src\\PractiseSelenium\\TestData.xlsx");

		// Workbook = Excel file is created. Open up the Workbook

		wb = WorkbookFactory.create(fis);

		// Sheet which inside the Excel file = Workbook// workbook is an interface in
		// Apache POI ss.usermodel

		// Open up the sheet

		sh = wb.getSheet("Sheet1");

		// Read the data and run it in the loop
		// get the total number of rows and total number of columns
		numrows = sh.getLastRowNum() + 1;
		
		System.out.println(numrows);
		
		numcols = sh.getRow(0).getLastCellNum();
		System.out.println(numcols);

		Object[][] formData = new Object[numrows][numcols];

		for (int row = 0; row < numrows; row++) // i =row l; j = col
		{
			for (int col = 0; col < numcols; col++) 
			{
				formData[row][col] = sh.getRow(row).getCell(col).toString();
			}
		}
									// creates an array with name formData
									// i and j (== row and col )are to be taken from the excel sheet inside the
									// workbook
									// instead of column, cell is used
									// the value from row and col is taken as a String variable, We also created
									// String as variable to be filled in the form in pOM

		return formData; // change this later
	}

	@AfterSuite
	public void CloseBrowser() {
		driver.quit();

	}

}
