package PractiseSelenium;
// contains all the keywords as methods and the actions to be done on it
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordDrivenFrameWorkActionKeywords {

	static WebDriver driver; // because no constructor or main method is used , so static is used.
	
	// Action keywords as methods
	public static void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
	}
	
	public  static void Navigate() {
		
		driver.get("https://www.google.com/");
	}
	
	public static void ClickGmail() {
		driver.findElement(By.linkText("Gmail")).click();
	}
	
	
}
