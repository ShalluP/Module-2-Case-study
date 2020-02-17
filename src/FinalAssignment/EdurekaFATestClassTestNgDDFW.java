package FinalAssignment;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EdurekaFATestClassTestNgDDFW {
	WebDriver driver;
	Workbook wb;
	Sheet sh;
	int rownum;
	int colnum;

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

	@Test(priority = 0, groups = "LogIn")
	public void LogIn() {
		EdurekaFAPOMBlogs BlogsPage = new EdurekaFAPOMBlogs(driver);
		BlogsPage.LogIn();
	}

	@Test(dataProvider = "FetchData", groups = "LogIn")
	public void SendCred(String Uname, String pass) throws InterruptedException {
		EdurekaFAPOMBlogs BlogsPage = new EdurekaFAPOMBlogs(driver);
		BlogsPage.SendCred(Uname, pass);

	}

	@DataProvider()
	public Object[][] FetchData() throws Exception, IOException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Shallu\\eclipse-workspace\\Selenium Training Practice Edureka"
						+ "\\src\\module10Assignments\\Mod10LogInCred.xlsx");
		wb = WorkbookFactory.create(fis);
		sh = wb.getSheet("Sheet1");

		rownum = sh.getLastRowNum() + 1;
		colnum = sh.getRow(1).getLastCellNum();

		Object[][] LogInCred = new Object[rownum][colnum]; // rownum , colnum: size of the array
		for (int r = 0; r < rownum; r++) {
			for (int c = 0; c < colnum; c++)

			{
				LogInCred[r][c] = sh.getRow(r).getCell(c).toString();
			}
		}

		return LogInCred;

	}

	@Test(priority = 1, groups = "LogIn")
	public void ClickLogIn() throws InterruptedException {
		EdurekaFAPOMBlogs BlogsPage = new EdurekaFAPOMBlogs(driver);
		BlogsPage.ClickLogIn();
		String Url1 = driver.getCurrentUrl();
		System.out.println("The url1 after Blogs Page is: " + Url1);
	}

	@Test(priority = 2, groups = "Blogs")
	public void ExploreBlogs() throws InterruptedException {
		EdurekaFAPOMBlogs BlogsPage = new EdurekaFAPOMBlogs(driver);
		BlogsPage.ExploreBlogs();

		String Url1 = driver.getCurrentUrl();
		System.out.println("The url2 after Blogs Page is: " + Url1);

		driver.navigate().back();
		driver.navigate().back();

		String Url2 = driver.getCurrentUrl();
		System.out.println("The url3 after navigating back from Blogs Page is: " + Url2);

	}

	@Test(priority = 3, groups = "Profile")
	public void EditProfile() throws InterruptedException {
		EdurekaFAPOMEditProfile EditPage = new EdurekaFAPOMEditProfile(driver);
		EditPage.EditProfile();
	}

	@Test(priority = 4, groups = "Profile")
	public void EditProfDetails() throws InterruptedException {
		EdurekaFAPOMEditProfile EditPage = new EdurekaFAPOMEditProfile(driver);

		EditPage.EditProfDetails();
	}

	@Test(priority = 5, groups = "Profile")
	public void ClickNext() throws InterruptedException {
		EdurekaFAPOMEditProfile EditPage = new EdurekaFAPOMEditProfile(driver);
		EditPage.ClickNext();

		String url1 = driver.getCurrentUrl();
		System.out.println("The url after Editing profile is :" + url1);
	}

	@Test(priority = 6, groups = "SelCourse")
	public void ClickAllCourses() throws InterruptedException {
		EdurekaFAPOMSeleniumCourse SelCoursePage = new EdurekaFAPOMSeleniumCourse(driver);
		SelCoursePage.ClickAllCourses();
		String url1 = driver.getCurrentUrl();
		System.out.println("The url after Selecting course is :" + url1);
	}

	@Test(priority = 7, groups = "SelCourse")
	public void SelectCourse() throws InterruptedException {
		EdurekaFAPOMSeleniumCourse SelCoursePage = new EdurekaFAPOMSeleniumCourse(driver);
		SelCoursePage.SelectCourse();
	}

	@Test(priority = 8, groups = "SelCourse")
	public void ClickEnrol() throws InterruptedException {
		EdurekaFAPOMSeleniumCourse SelCoursePage = new EdurekaFAPOMSeleniumCourse(driver);

		SelCoursePage.ClickEnrol();
	}

	@Test(priority = 9, groups = "SelCourse")
	public void PayMent() throws InterruptedException {
		EdurekaFAPOMSeleniumCourse SelCoursePage = new EdurekaFAPOMSeleniumCourse(driver);
		SelCoursePage.PayMent();
	}

	@Test(priority = 10)
	public void MyCourse() throws InterruptedException {
		EdurekaFAPOMCourses ValdCourse = new EdurekaFAPOMCourses(driver);

		ValdCourse.MyCourse();

		String EnrCourse = driver.getCurrentUrl();
		boolean Validate = EnrCourse.equals("https://learning.edureka.co/my-classroom/testing-with-selenium-webdriver/"
				+ "coursecontent?courseId=535&fromMasterCourse=0");
		System.out.println("the Course is selected and validated: " + Validate);

	}

	@Test(priority = 11)
	public void LogOut() {
		EdurekaFAPOMCourses LogOut = new EdurekaFAPOMCourses(driver);
		LogOut.LogOut();
	}
}
