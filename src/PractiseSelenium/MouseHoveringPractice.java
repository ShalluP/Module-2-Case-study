package PractiseSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoveringPractice {

	static WebDriver driver;
	
		public static void main(String[] args) throws InterruptedException {
			//launch the browser
			
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get("https://www.myntra.com/"); //open the AUT	
			
			// select the men category
			driver.findElement(By.xpath("(//*[@data-group = 'men' ])[1]")).click();
			driver.findElement(By.xpath("(//a[text() = 'Jackets'])[2]")).click();
		
			// selecting the image at 3 rd place in the jackets section
			//driver.findElement(By.xpath("//*[@class='desktop-searchBar']//following::img[3]")).click();
			
			// selecting the image by its title.. making it hard -corded
			//img[@title = 'Duke Men Green Colourblocked Bomber Jacket']
		WebElement mh =	driver.findElement(By.xpath("//*[@class='desktop-searchBar']//following::img[3]"));
		
		Actions act  = new  Actions(driver);
		 
		act.moveToElement(mh).perform();
		
		Thread.sleep(2000);
		// mouse hovering 2nd example
		//locating men
		WebElement men = driver.findElement(By.xpath("(//*[@data-group = 'men' ])[1]"));
		
		WebElement women = driver.findElement(By.xpath("(//*[@data-group = 'women' ])[1]"));
		
		Actions act2 = new Actions(driver);
		
		act2.moveToElement(men).perform();
		
		Thread.sleep(1000);
		act2.moveToElement(women).perform();
		
		
		}

}
