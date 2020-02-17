package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//A person wants to check for the one-wayflights from Bengaluru to Lucknow for 5 
//passengers(3 Adults and 2 children) on Indigo portal for the current date. 
//Automate the same using (https://www.goindigo.in/?linkNav=home_header) portal.
//The steps are as below.Steps:1.Launch the browser with “https://www.goindigo.in/?linkNav=home_header”2.Select “One way” in the option
//3.Fill all the details specified above
//4.Click on search button
//5.Wait for the page to load and list all the flights available

public class Module4CaseStudy {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		// Open Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		// Open AUT
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.goindigo.in/?linkNav=home_header");
		driver.manage().window().maximize();
		
		//Implicitly wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		String url1 = driver.getCurrentUrl();
		System.out.println("The url of home page is :" +url1);
		
		// Selecting Destination
		driver.findElement(By.xpath("//*[@id=\"bookFlightTab\"]/form/div[2]/div[1]/label/label"));

		WebElement From = driver.findElement(By.name("or-src"));
				//driver.findElement(By.xpath("(//input[@placeholder='From'])[1]"));
		//driver.findElement(By.xpath("//div[text()='Bengaluru, India']")).submit();
		From.clear();
		Thread.sleep(1000);
		From.sendKeys("bla");
		
		From.sendKeys("Bengaluru");
		driver.findElement(By.xpath("(//div[text()='Bengaluru, India'])[1]")).click();
		
		WebElement To = driver.findElement(By.xpath("(//input[@placeholder='To'])[1]"));
		To.clear();
		Thread.sleep(1000);
		To.sendKeys("Lucknow");
		driver.findElement(By.xpath("(//div[text()='Lucknow, India'])[1]")).click();
		
		// Selecting date of travel
		
		
		  WebElement Date = driver.findElement(By.name("or-depart"));
		  //driver.findElement(By.xpath("(//input[@placeholder=\"Departure Date\"])[1]" ));
		  Date.click(); Thread.sleep(2000);
		  
		  driver.findElement(By.xpath("(//a[text()='19'])[1]")).click(); //
		/*
		 * driver.findElement(By.xpath(
		 * "//*[@id=\"dp1566162686314\"]/div/div[1]/table/tbody/tr[4]/td[2]/a")).click()
		 * ;
		 */
		  Thread.sleep(1000); WebElement Done =driver.findElement(By.xpath("(//button[text()='Done'])[1]"));
		  
		  driver.findElement(By.xpath("//a[text()='Done']")); Done.click();
		 
		
		// Selecting Passengers
		
		WebElement Passenger = driver.findElement(By.name("passenger"));
		
		Passenger.click();
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("//div[@id='bookFlightTab']//li[@class='adult-pax-list']//button[contains(@class, 'pax-plus')]")).click();  
	
		//driver.findElement(By.name("passenger")).click();
		
		
		  WebElement Adult2 =
		  driver.findElement(By.xpath("(//button[@title ='Up'])[1]")); 
		  Adult2.click();
		  WebElement Adult3 =
				  driver.findElement(By.xpath("(//button[@title ='Up'])[1]")); 
		  Adult3.click();// Adult.click();
		 
		  WebElement Child1 =driver.findElement(By.xpath("(//li[@class='child-pax-list']"
		  		+ "//button[@class ='pax-plus btn btn-info' and @title='Up'])[1]"));

		  Child1.click();
		  
		  Thread.sleep(1000);
	//	WebElement Child2 = driver.findElement(By.xpath("(//button[text()='Done'])[1]"));
		  WebElement Child2 =driver.findElement(By.xpath("(//li[@class='child-pax-list']"
			  		+ "//button[@class ='pax-plus btn btn-info' and @title='Up'])[1]"));

		Child2.click();

		WebElement SearchFlight = driver.findElement(By.xpath("//span[text()='Search Flight']"));
		SearchFlight.click();
		
		String url2 = driver.getCurrentUrl();
		System.out.println("The url of home page is :" +url2);
		
	}

}
