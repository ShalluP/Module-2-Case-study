package module10Assignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Mod10TestClassTestNg {
	WebDriver driver;
	Workbook wb;
	String Course = "Manual Testing";
	Sheet sh;
	int numRows;
	int numCols;
	/*
	 * String Path = "C:\\Users\\Shallu\\eclipse-workspace" +
	 * "\\Selenium Training Practice Edureka\\src\\module10Assignments\\Mod10LogInCred.xlsx"
	 * ; String SheetName = "Sheet1";
	 */

	@BeforeSuite
	public void OpenAUT() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
	}

	@AfterSuite
	public void CloseBrowser() throws InterruptedException {
		driver.navigate().back();
		Thread.sleep(2000);
		driver.close();
	}

	@Test(priority = 0)
	public void LogIn() {
		Mod10POMActionkeywords page1 = new Mod10POMActionkeywords(driver);
		page1.LogIn();
	}

	@Test(dataProvider = "FetchData", priority = 1)
	public void SendCred(String Uname, String pass) throws InterruptedException {
		Mod10POMActionkeywords page2 = new Mod10POMActionkeywords(driver);

		page2.SendCred(Uname, pass);
	}

	@DataProvider
	public Object[][] FetchData() throws Exception {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Shallu\\eclipse-workspace\\Selenium Training Practice Edureka\\src\\module10Assignments\\Mod10LogInCred.xlsx");
		wb = WorkbookFactory.create(fis);
		sh = wb.getSheet("Sheet1");

		numRows = sh.getLastRowNum() + 1;
		numCols = sh.getRow(1).getLastCellNum();

		Object[][] LogInCred = new Object[numRows][numCols];

		for (int row = 1; row < numRows; row++) {
			for (int col = 0; col < numCols; col++) {
				LogInCred[row][col] = sh.getRow(row).getCell(col).toString();
			}
		}
		return LogInCred;

	}

	@Test(priority = 2)
	public void Click() throws InterruptedException {

		Mod10POMActionkeywords page2 = new Mod10POMActionkeywords(driver);
		page2.Click();
	}

	@Test(priority = 3)
	public void SelectCourse() throws InterruptedException {

		Mod10POMActionkeywords page3 = new Mod10POMActionkeywords(driver);
		page3.SelectCourse();
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, 20);
		 * wait.until(ExpectedConditions.elementToBeClickable(SelCourse)).click();
		 */
	}

	@Test(priority = 4)
	public void ClickEnrol() throws InterruptedException {
		Mod10POMActionkeywords page4 = new Mod10POMActionkeywords(driver);
		page4.ClickEnrol();
	}

	@Test(priority = 5)
	public void payMent() throws InterruptedException {
		Mod10POMActionkeywords page3 = new Mod10POMActionkeywords(driver);
		page3.PayMent();

	}

}
