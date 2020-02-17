package PractiseSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Assignments.ProjectPage;

public class GoogleSearchPractise {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		GoogleHPObjectClassPractise page = new GoogleHPObjectClassPractise(driver);
		
		page.SearchOnGoogle("Selenium");
		Thread.sleep(1000);
		page.SearchOnGoogle("Edureka");
		
		page.SearchOnGoogle("Shallu Pahwa");
		
		page.SearchOnGoogle("SeleniumHQ");
		
		page.ClickSeleniumLink();
		
		//create an object for 2nd page object class file
		
		SeleniumHomePage page2 = new SeleniumHomePage(driver);
		
		page2.Download();
		
		Thread.sleep(2000);
		
		page2.HomePage();
		
		Thread.sleep(3000);
		
		page2.Projects();
		
		Thread.sleep(3000);
		
		ProjectPage ProjPage = new ProjectPage (driver);
		
		ProjPage.ClickOnSelGrid();
		
		Thread.sleep(2000);
		
		ProjPage.ClickOnSelIDE();
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		ProjPage.ClickOnSelRC();
		Thread.sleep(3000);
		
		driver.close();
		
}
}