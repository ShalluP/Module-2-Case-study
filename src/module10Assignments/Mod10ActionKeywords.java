package module10Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
// ActionKeywords class contains all the methods with locators
//which later can be compared with excel file entries and executed
public class Mod10ActionKeywords {
static WebDriver driver;

	public static void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void OpenAUT() 
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.edureka.co/");
		driver.manage().window().maximize();
	}
	
	public static void LogIn() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@data-gi-action=\"Login\" and contains(text(),'Log In')]") ).click();
		Thread.sleep(2000);
	}
	public static void UserName() 
	{
	driver.findElement(By.id("si_popup_email")).sendKeys("vinitbassi@gmail.com");
	}
	public static void Password()
	{
		driver.findElement(By.id("si_popup_passwd")).sendKeys("India15Great");
	}
	public static void ClickLogIn()
	{
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}
	public static void SearchBox() throws InterruptedException
	{
		Thread.sleep(3000);
		
		WebElement SearchBox = driver.findElement(By.xpath("//input[@ placeholder='Search for a skill you wish to master']"));
		SearchBox.click();
		
		Thread.sleep(3000);
		SearchBox.sendKeys("Manual Testing");
		
	}
	public static void SelCourse() throws Exception
	{ Thread.sleep(2000);
		//WebDriverWait wait = new WebDriverWait(driver, 40);
	
	//	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href=\\\"https://www.edureka.co/software-testing\\\"])[2]"))).click();
	
	driver.findElement(By.xpath("(//a[@href='https://www.edureka.co/software-testing'])[2]")).click();
	//	driver.findElement(By.xpath("//div[@data-gi-action='course click - Manual Testing Certification Training']")).click();
	
	}
	public static void EnrolPay() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='head dp_hd_bx duq-new-head']//img[@alt='toggle']")).click();
		
	WebDriverWait wait = new WebDriverWait(driver, 60);
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//(//button[text()='ENROLL NOW' ])[1]")))).click();
		//	driver.findElement(By.xpath("(//button[text()='ENROLL NOW'])[1]")).click();
	}
	public static void ProceedPay() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[contains(text(),'PROCEED TO PAYMENT') and @class='pymt_btn pymt_btn_batch osp_ga'])[2]")).click();
	}
	public static void PayPal()
	{
		driver.findElement(By.xpath("//div[@data-funding-source='credit']")).click();
	}
	public static void ClickCont() 
	{
		driver.findElement(By.xpath("//div[@class='paypal-checkout-continue']//a[text()='Click to Continue']")).click();
	}
	public static void PayLogIn()
	{ //btnLogin
		driver.findElement(By.xpath("//button[@id='btnLogin' and contains(text(),'Log In')]")).click();
	}

	
	
	
	
	
}
