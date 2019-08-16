package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Module3CaseStudy {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS); //Setting the pageload timeout for 120 seconds
		
		driver.get("https://www.edureka.co/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // Setting the implicit wait for all the activities
		
		driver.manage().timeouts().setScriptTimeout(100, TimeUnit.SECONDS); // Setting the script time out
		
	//	driver.setTimeout(arguments[arguments. Length - 1], 500);
		
		// Search for Selenium course in the search bar on the edureka website
		
		WebElement searchBox = driver.findElement(By.id("search-inp"));
		
		searchBox.sendKeys("Selenium");
		
		driver.findElement(By.id("search-button-top")).click(); // clicking on the search icon after selecting the course.
		
	// explicit wait on the page 8. Add explicit wait for page to navigate to selenium course and click on the course
		
		WebDriverWait wait = new WebDriverWait(driver, 40);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()='Selenium Certification Training ']"))).click();
		
		// get the title
		
		String title = driver.getTitle();
		System.out.println("The title of the page is : "+title);
		
		boolean titleValidate = title.equalsIgnoreCase("Selenium 3.0 WebDriver Online Training");
		
		System.out.println(titleValidate);
		
		// navigate back
		driver.navigate().back();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='Courses']")).click(); // click on all-courses
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		// Adding fluent wait for the whole page to load
		
		FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver);
		fwait.pollingEvery(30, TimeUnit.SECONDS);
		
		driver.close();
		
	}

}
