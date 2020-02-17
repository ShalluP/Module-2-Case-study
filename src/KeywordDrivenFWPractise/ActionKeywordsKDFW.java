package KeywordDrivenFWPractise;
// this class file has the launch of web driver


//all the methods/actions to be done on the web elements or objects
//name of methods should be same as the methods declared in the Excel sheet under keyword heading..thus keyword driven FW
//the web elements or objects to be acted open by methods should be located here, like POM but as normally in .class file.

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywordsKDFW {

	public static WebDriver driver;

	public static void OpenBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	public static void Navigate()
 {
	//	driver.manage().deleteAllCookies();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
	}

	public static void Input_Username() {

		driver.findElement(By.name("userName")).sendKeys("mercury");
	}

	public static void Input_Password() {

		driver.findElement(By.name("password")).sendKeys("mercury");
	}

	public static void Click_Login() {

		driver.findElement(By.name("login")).click();
	}

	public static void Verify_Login() {
		String url1 = driver.getCurrentUrl();
		System.out.println("the verified login gives new url" + url1);

		String PageTitle = driver.getTitle();
		Assert.assertEquals(PageTitle, "Find a Flight: Mercury Tours:");
//	 Assert.assertEquals(PageTitle, "Find a Flight: Mercury Tours:");
	}

	public static void CloseBrowser() {
		driver.close();
	}
}
