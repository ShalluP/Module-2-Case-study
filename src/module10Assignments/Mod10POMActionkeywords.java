package module10Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/*Write a hybrid Test framework that can Login to edureka portal, select a course of your choice,
 *  checkout the course with all the valid address details and at the end of payment ,
 *   cancel the product that was selected. Use Modularisation techniques to club series of actions into Modules . 
 *   Use POM, TestNG, log4j to create the TestFramework. 
 Steps 1. Create different Modules using POM for each action to be performed (Login, search course, Add the course, 
 Checkout, Update the Address, Cancel before payment) 
 2. Login to the edureka portal 3. Search for the course of your choice and add to the list
  4. Checkout at the end adding all the details and cancel just before payment.
   5. Use Hybrid Framework, so that it can be used in multiple testcases. */

// combine keyword + data driven; may be take the methods from keyword by reading the excel
//and data from another excel using the data drivenFW

public class Mod10POMActionkeywords {
	
	@FindBy(xpath = "//a[@data-gi-action=\"Login\" and contains(text(),'Log In')]")
	WebElement LogIn; // click

	@FindBy(id = "si_popup_email")
	WebElement UserName; // send keys

	@FindBy(id = "si_popup_passwd")
	WebElement Password;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement ClickLogIn;

	@FindBy(xpath = "//input[@ placeholder='Search for a skill you wish to master']")
	//@FindBy(xpath = "//div[@class='search_course_container']//input[@class='dropdown-toggle search_input']")
	WebElement SearchBox; // click + sendkeys "Selenium Certification training"
	
	
	
	@FindBy(xpath = "(//a[@href=\"https://www.edureka.co/software-testing\"])[2]")
	WebElement ClickCourse;
	
	//@FindBy(xpath = "(//span[text()='View Details'])[2]")
	//WebElement SelCourse;
	@FindBy(xpath = "(//button[text()='ENROLL NOW'])[3]")
	WebElement EnrolNow;
	/*
	 * @FindBy(xpath = "(//a[@data-ctaction='Course page Enroll'])[3]") // click
	 * WebElement EnrolPay;
	 */
	@FindBy(xpath = "(//button[contains(text(),'PROCEED TO PAYMENT') and @class='pymt_btn pymt_btn_batch osp_ga'])[2]")
	WebElement ProceedPay;
	
	@FindBy(xpath = "//div[@data-funding-source=\"credit\"]")
	WebElement PayPal;
	
	@FindBy(xpath = "//div[@class='paypal-checkout-continue']//a[text()='Click to Continue']")
	WebElement ClickCont;
	
	@FindBy(id = "id=\"btnLogin\"")
	WebElement PayLogIn;
	// alert accept /reject
	
	public Mod10POMActionkeywords(WebDriver driver) 
	{
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
	
	public void SelectCourse()throws InterruptedException
	{
		SearchBox.click();
		Thread.sleep(3000);
		
		SearchBox.sendKeys("Manual testing");
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
	
