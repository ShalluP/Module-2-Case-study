package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class Mod12HeadlessBrowser {

	public static void main(String[] args) throws InterruptedException {

		//	WebDriver driver = new HtmlUnitDriver(); // with HTML unit Driver as HeadLess browser
		
		
		  System.setProperty("phantomjs.binary.path",
		  "C:\\Users\\Shallu\\Desktop\\Selenium Training\\Installation Stuff\\Drivers Folder\\phantomjs.exe"
		  );
		  
		  WebDriver driver = new PhantomJSDriver();
		 
		driver.get("https://www.google.com/");

		String url1 = driver.getCurrentUrl();
		System.out.println("The url after openeing browser is:" + url1);

		String t1 = driver.getTitle();
		System.out.println("the page title on opening the AUT is :" + t1);

		WebElement SearchBox = driver.findElement(By.name("q"));
		SearchBox.click();

		SearchBox.sendKeys("Edureka");

		Thread.sleep(2000);
		SearchBox.submit();

		String url2 = driver.getCurrentUrl();
		System.out.println("The url after openeing browser is:" + url2);

		String t2 = driver.getTitle();
		System.out.println("the page title on opening the AUT is :" + t2);

		if (t1.equalsIgnoreCase(t2)) {
			System.out.println("The titles are same");
		} else {
			System.out.println("The titles are different");
		}

		driver.close();

	}

}
