package FinalAssignment;
/* Login to the portal 2. Navigate to “All Course” page 3. Refine the search for selenium 4. Add the selenium course to wishlist. 
 * 5. Check that selenium course s added in the users wishlist 
 * 
 * */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EdurekaFAPOMSeleniumCourse {

	@FindBy(xpath = "//a[@data-gi-action=\"Login\" and contains(text(),'Log In')]")
	WebElement LogIn; // click

	@FindBy(id = "si_popup_email")
	WebElement UserName; // send keys

	@FindBy(id = "si_popup_passwd")
	WebElement Password;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement ClickLogIn;
	
	////a[text()='Home']
	
	//Goto All courses page
	@FindBy(xpath = "(//button[@class='dropdown-toggle'])[2]")
	WebElement Courses;
	
	@FindBy(xpath = "//a[@class='dropdown-item' and text()='All Courses']")
	WebElement AllCourses;
	
	/*
	 * @FindBy(xpath = "//a[text()='My Courses']") WebElement MyCourse;
	 */
	
	//Select Course
	//@FindBy(xpath = "//div[@class=\"search_course\"]//input[@class=\"dropdown-toggle search_input\"]")
	@FindBy(id = "search-inp") ////input[@id="search-inp"]
	WebElement SearchBox; // click + sendkeys "Selenium Certification training"
	
	@FindBy(xpath = "//a[@class='title']//span[@class='title']//strong[text()='Selenium']")
	//@FindBy(xpath = "(//a[@href=\"https://www.edureka.co/software-testing\"])[1]")
	WebElement ClickCourse;
	
	@FindBy(xpath = "(//button[text()='ENROLL NOW'])[3]")
	WebElement EnrolNow;
	
	@FindBy(xpath = "(//button[contains(text(),'PROCEED TO PAYMENT') and @class='pymt_btn pymt_btn_batch osp_ga'])[2]")
	WebElement ProceedPay;
	
	@FindBy(xpath = "//div[@data-funding-source=\"credit\"]")
	WebElement PayPal;
	
	@FindBy(xpath = "//div[@class='paypal-checkout-continue']//a[text()='Click to Continue']")
	WebElement ClickCont;
	
	@FindBy(id = "id=\"btnLogin\"")
	WebElement PayLogIn;
	
	public EdurekaFAPOMSeleniumCourse(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void LogIn() {
		LogIn.click();
	}

	public void SendCred(String Uname, String pass) throws InterruptedException
	{
		UserName.clear();
		Thread.sleep(2000);
		UserName.sendKeys(Uname);
		
		Thread.sleep(2000);
		Password.clear();
		Password.sendKeys(pass);
		
	}
	public void Click() throws InterruptedException {
		ClickLogIn.click();
		Thread.sleep(3000);
	}
	
	public void ClickAllCourses() throws InterruptedException
	{
	//	MyCourse.click();
		Courses.click();
		Thread.sleep(2000);
		AllCourses.click();
	}
	
	public void SelectCourse()throws InterruptedException
	{
		Thread.sleep(5000);
		SearchBox.click();
		Thread.sleep(3000);
		
		SearchBox.sendKeys("Selenium");
		Thread.sleep(3000);
		
		ClickCourse.click();
		Thread.sleep(5000);
		//SelCourse.click();
	}
	public void ClickEnrol() throws InterruptedException
	{
		//Thread.sleep(2000);
		EnrolNow.click();
		Thread.sleep(2000);
	}	
	
	public void PayMent() throws InterruptedException
	{
		ProceedPay.click();
		Thread.sleep(2000);
		
		PayPal.click();
		Thread.sleep(2000);
		
		ClickCont.click();
		Thread.sleep(2000);
		
		PayLogIn.click();}
	

}
