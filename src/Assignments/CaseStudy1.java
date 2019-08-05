package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class CaseStudy1 {

	public static void main(String[] args) {
												// Setting path of driver executables of Chrome browser into webdriver
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shallu\\Desktop\\Selenium Training\\Installation Stuff\\Drivers Folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Instantiating object of class chromeDriver implementing all the methods/classes/objects of Interface webDriver
		
		// for Firefox driver
		
		
		  //System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shallu\\Desktop\\Selenium Training\\Installation Stuff\\Drivers Folder\\geckodriver.exe" );
		  
		 // WebDriver driver = new FirefoxDriver(); // Instantiating object of class chromeDriver implementing all the methods/classes/objects of Interface webDriver
		 
		
		
		driver.manage().deleteAllCookies();   // deleting the previous cookies
		driver.get("https://www.edureka.co"); // Opening the url of edureka
		driver.manage().window().fullscreen(); // maximizing the window
		
		WebElement searchBox = driver.findElement(By.id("search-inp")); // Inspecting the webelement searchBox
		searchBox.click();				// clicking it.
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicit wait
		
		WebElement logIn = driver.findElement(By.xpath("//a[text()='Log In']"));  // Inspecting the webelement Login bar
		logIn.click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicit wait
		
		WebElement email = driver.findElement(By.id("si_popup_email"));
		email.sendKeys("abc@gmail.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicit wait
		
		WebElement passWord = driver.findElement(By.id("si_popup_passwd"));
		passWord.sendKeys("abcdef");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicit wait
		
		driver.findElement(By.xpath("//button[text()='Login']")).click(); // clicking on the logIn button
		
		driver.close();
		
		
	}

}
