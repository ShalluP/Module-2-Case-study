package PractiseSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropPractice {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Inspect frames using iframe
				 
		WebElement Iframe = driver.findElement(By.tagName("iframe"));
				
		driver.switchTo().frame(Iframe); // webelement
		 
		WebElement Source = driver.findElement(By.id("draggable"));
		
		WebElement Target = driver.findElement(By.id("droppable"));
		
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		
		act.dragAndDrop(Source, Target).perform();
		
		
		
		
		
		
		
	}

}
