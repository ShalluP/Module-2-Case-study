package Assignments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TCMod8POM {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		 
		driver.get("https://accounts.google.com");
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		Mod8PageObjectModel M8page = new Mod8PageObjectModel(driver);
		
		M8page.LogIn("mod8pom@gmail.com", "Mod8_POMCaseStudy");
		
		String s1 = driver.getWindowHandle();
		System.out.println("The current window handle is :"+ s1);
		
		
		Set<String> set = driver.getWindowHandles();
		
		for (String s:set)
		{
			System.out.println("All the window handles are :" + s);
		}
		
		Thread.sleep(3000);
		
		M8page.EnterGmail();
		
		Thread.sleep(5000);
		
			
		M8page.ComposeEmail();
		
				
		Thread.sleep(5000);
		
		M8page.SelectTo("Shallupahwa@gmail.com");
		Thread.sleep(2000);
		
		M8page.LogOut();
		

	}

}
