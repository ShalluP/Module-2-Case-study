package PractiseSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractise {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shallu\\Desktop\\Selenium Training\\Installation Stuff\\Drivers Folder\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(
				"https://seleniumautomationpractice.blogspot.com/2017/10/functionisogramigoogleanalyticsobjectri.html");

		driver.manage().window().maximize();
		
				// getting the headings with contains fn of xpath
		
		String H= driver.findElement(By.xpath("//a[contains(text(),'um Automation P')]")).getText();
		System.out.println(H);
		
		String H1 = driver.findElement(By.xpath("//*[contains(text(),'or demonstrating Sel')]")).getText();
		System.out.println(H1);
		
		String H2 = driver.findElement(By.xpath("//*[starts-with(text(),'Fri')]")).getText();
		System.out.println(H2);
		
		String H3 = driver.findElement(By.xpath("//h3[contains(text(),'nt Inte')]")).getText();
		System.out.println(H3);
		
		String H4 = driver.findElement(By.xpath("//*[starts-with(text(),'Pra')]")).getText();
		System.out.println(H4);
		
		String H5 = driver.findElement(By.xpath("//strong[contains(text(),'AL INFOR')]")).getText();
		System.out.println(H5);
		
		// FILLING THE TEXT BOXES
		
		driver.findElement(By.name("firstname")).sendKeys("Shallu");
		driver.findElement(By.name("lastname")).sendKeys("Bassi");
		
		// radio Button
		driver.findElement(By.id("sex-1")).click();
		
		// Practicing Preceding and Following in Xpath
		
		driver.findElement(By.id("tool-2")).click(); // Selecting the Selenium Webdriver option
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='tool-2']//preceding::input[3]")).click(); //choosing the previous photo button
		
		driver.findElement(By.xpath("//*[@id='tool-2']//preceding::input[4]")).click(); //Selecting the automation tester option 
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='tool-2']//preceding::input[6]")).sendKeys("31/01/1982");
		
		driver.findElement(By.xpath("//input[@id='tool-2']//preceding::input[13]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Selenium Automation Hybrid Framework")).click();
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id='tool-2']//following::input[1]")).sendKeys("Selenium automation"); 
		
		driver.findElement(By.xpath("//*[@id='tool-2']//following::input[2]")).click(); 
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='tool-2']//following::input[3]")).sendKeys("abc@gmail.com"); 
		
		driver.findElement(By.xpath("//*[@id='tool-2']//following::input[4]")).click(); 
		
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		// window handles
		String S1 = driver.getWindowHandle();
		System.out.println("THe current window handle is  -"+S1);
		
		driver.close();
		
			
		
		
	}

}
