package Assignments;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Module2CaseStudy {

	public static void main(String[] args) throws InterruptedException {
 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shallu\\Desktop\\Selenium Training\\Installation Stuff\\Drivers Folder\\chromedriver.exe");
		 
		WebDriver driver = new ChromeDriver(); // Instantiating class Chromedriver by object driver 
		
		driver.get("https://www.edureka.co"); // Opening the url of edureka
	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicit wait

		// Inspecting searchbox by id locator
		
		WebElement searchBox = driver.findElement(By.id("search-inp")); // Inspecting the webelement searchBox by locator id
		searchBox.click();				// clicking it.
		if (searchBox!= null)
		{
			System.out.println("element inspected by id locator");
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicit wait

		//Inspecting login by Linktext or partial linktext
		
		
		  WebElement logIn = driver.findElement(By.linkText("Log In"));
		  logIn.click();
		 
		 if (logIn!= null) {
		 System.out.println("element inspected by linktext locator"); } 
		 
		
		/*
		 * // WebElement logIn = driver.findElement(By.partialLinkText("og I"));
		 * //logIn.click();
		 * 
		 * // if (logIn!= null) // { //
		 * System.out.println("element inspected by partial linktext locator"); // }
		 * 
		 * 
		 * WebElement logIn = driver.findElement(By.tagName("a")); // Inspecting the
		 * webelement searchBox logIn.click(); // clicking it. WebElement logIn =
		 * driver.findElement(By.
		 * className("signin top-signin giTrackElementHeader hidden-xs")); // Inspecting
		 * the webelement searchBox logIn.click(); // clicking it.
		 * 
		 * WebElement logIn= driver.findElement(By.
		 * cssSelector("#header-II > section > nav > div > a.signin.top-signin.giTrackElementHeader.hidden-xs"
		 * )); logIn.click(); // inspecting the logIn button and clicking it.
		 */		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicit wait
		
		// sending keys to type in the email.
		
		//WebElement email = driver.findElement(By.tagName("input")); // Inspecting the webelement searchBox
		//email.sendKeys("abc@gmail.com");				// clicking it.
			
	   WebElement email = driver.findElement(By.className("control_place popusreml")); // Inspecting the webelement searchBox
		email.sendKeys("abc@gmail.com"); // sending name
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.id("si_popup_email")); // Inspecting the webelement email
		email.sendKeys("abc@gmail.com"); // sending email id 
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicit wait
		
		// Inspecting password and sending in keys for password.
		//WebElement passWord = driver.findElement(By.className("si_popup_email")); // Result:Cannot locate an element using class name=si_popup_email
		//passWord.sendKeys("abce");
		
		WebElement pass = driver.findElement(By.cssSelector("#si_popup_passwd"));
		pass.sendKeys("abce");
		
	// Inspecting the login button and clicking on it.
		
		//WebElement logInButton = driver.findElement(By.className("clik_btn_log btn-block"));
		//logInButton.click();
		Thread.sleep(1000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicit wait
		
		//driver.findElement(By.tagName("button")).click();
		
		//driver.findElement(By.className("signin top-signin giTrackElementHeader hidden-xs")).click();
		
		driver.findElement(By.xpath("//button[text()='Login']")).click(); // clicking on the logIn button
		
		Thread.sleep(1000);
		
		List<WebElement> list = driver.findElements(By.tagName("div"));
		System.out.println(list.size());
		driver.close();
		
		
	}

}
