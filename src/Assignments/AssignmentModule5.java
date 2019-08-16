package Assignments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//Explore the blogs and Navigate to Main page
public class AssignmentModule5 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//open the uRL
		driver.get("https://www.edureka.co/");
		
		// Implicitly wait
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		// clicking on the log in web element an then logging in with personal credentials
		WebElement logIn =  driver.findElement(By.xpath("//a[text()='Log In']"));
		logIn.click();

		//Thread.sleep(2000);
		
		driver.findElement(By.id("si_popup_email")).sendKeys("vinitbassi@gmail.com");
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("si_popup_passwd")).sendKeys("India15Great");
		driver.findElement(By.xpath("//button[text()= 'Login']")).click();
		
		// navigating to My Profile
		//WebElement user = driver.findElement(By.xpath("//*[@id=\"footauto\"]/app-root/app-profile-main/app-header/header/nav/div/div[3]/ul/li[8]/div/button/span"));
		//user.click();
		
		driver.findElement(By.xpath("//*[text()= 'Shallu Bass']")).click();
		
		// creating selector class to select from the drop downs 
		
		WebElement MyProfile = driver.findElement(By.xpath("(//a[text()= 'My Profile'])[1]"));
		MyProfile.click();
		
		// navigating and updating personal details
		
		 driver.findElement(By.id("personal_details")).click();
		 
		 String url1 = driver.getCurrentUrl();
		 System.out.println("THe url for personal details is : "+ url1);
		 
		 // editing experience in the personal profile
		
		WebElement exp =  driver.findElement(By.id("experience"));
		 
		Thread.sleep(1000);
		 Select oSelect = new Select(exp);
		 oSelect.selectByVisibleText("2-4 years");
		 
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("(//button[text()='Continue'])[1]")).click();
		  //driver.findElement(By.xpath("(//*[@type = 'button'])[3]")).click();
		 
		 Thread.sleep(1000);
		 String url2 = driver.getCurrentUrl();
		 System.out.println("THe url for professional details is : "+ url2);
		
		 Select sel = new Select(driver.findElement(By.name("currentjob")));
		 
		 sel.selectByVisibleText("Senior Management");
		  
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 
		 driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-profe"
		 		+ "ssional-details/accordion/accordion-group/div/div[2]/div/form/button[2]")).click();
		 
		 driver.findElement(By.xpath("//button[text() = 'Next']")).click();
		  
		WebElement EmpType= driver.findElement(By.name("elementType"));
		  
		  Select sel2 = new Select(EmpType);
		  
		  sel2.selectByIndex(0);
		  
		  Thread.sleep(2000);
		  
		//  driver.findElement(By.xpath("//button[text() = 'Next']")).click();
		  driver.findElement(By.xpath("//*[@id=\"onboarding\"]/div/div[1]/div[2]/div[2]/app-onboarding-professional-details/"
		  		+ "accordion/accordion-group/div/div[2]/div/form/button[2]")).click();
		  WebElement save =
		  driver.findElement(By.xpath("(//button[text() = 'Save'])[1]")); save.click();
		  
		 		  // exploring the blogs, clicking on community button:  
		  
		  WebElement community = driver.findElement(By.xpath("(//button[@class='dropdown-toggle'])[3]"));
		  community.click();
		 
		  // Selecting blogs from the drop down menu 
		  WebElement blog =
		  driver.findElement(By.xpath("(//a[text()='Blog'])[1]")); blog.click();
		  
		  // get url
			 String burl = driver.getCurrentUrl(); 
			 System.out.println(burl);
			 
		 // To check the alert
		  driver.findElement(By.xpath("//button[text()='No thanks']")).click(); 
		  
		  // clicking on Online courses-- opens up new page, use Window Handles 
		  // go to new Window
		  
		  WebElement Explore= driver.findElement(By.xpath("//a[text()='Explore Online Courses']"));
	  	  Explore.click();
	  	  
	  	  // trying window handles... get window handles of all the  windows
	  	  Set<String> set = driver.getWindowHandles();
	  	  
	  	  System.out.println("the window handles are: "+ set);
	  	  
	  	  // switch to previous window using for loop, 
	  	  
	  	  for(String s : set)
	  	  
          {driver.switchTo().window(s);} // as active page is all courses, so switch shall move to previous window of main page
		  
		  // get current url for main page
		  String url4 = driver.getCurrentUrl();
		  System.out.println("The url after switching is, blog page :"+url4);
		  
		  // returning to the main profile page, new 
		  
		  driver.navigate().back();
		  
		  driver.findElement(By.xpath("//span[text()= 'Shallu Bass']")).click();
		  
		  
		  // log out WebElement logOut =
		  WebElement logOut= driver.findElement(By.xpath("//a[text() = 'Log Out']"));
		  logOut.click();
		  
		  driver.close();
		 

	}

}
