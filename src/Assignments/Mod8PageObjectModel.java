package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*Automate the Gmail webpage to login, send a mail and logout using page object model 
 * testing of selenium,without Page factory.Repeat the same with page factory 
 * concept.Steps:1.Login to the Gmailaccount2.Compose and send a mail
 * 3.Logout from GmailUse Page object model to test the above scenario with page factory.
 * Note:Make sure that you are logged out of your Gmail account while performing this practical
 */


public class Mod8PageObjectModel {
	
	@FindBy(id = "identifierId")
	WebElement EmailId;
	
	@FindBy(xpath = "//span[text()='Næste']")
//	@FindBy(xpath = "//span[text()='Next']")
	WebElement ClickNext1;
	
	@FindBy(xpath = "//input[@type ='password']")
	WebElement Pass;
	
	@FindBy(xpath = "//span[text()='Næste']")
	WebElement ClickNext2;
	
	//@FindBy(xpath = "//div[@id ='gbwa']//a[@role ='button']")
	@FindBy(id = "gbwa")
	WebElement Button; // Button to show all the features of google account
	
	@FindBy(xpath = "//a[@id ='gb23']//span[@class='gb_m']")
	WebElement Gmail; // click on this button to enter gmail
	
	/*
	 * @FindBy(name = "welcome_dialog_next") WebElement InnerNext;
	 * 
	 * @FindBy(xpath = "//button[@name = 'ok']") WebElement ViewButton;
	 */
		
	//@FindBy(xpath = "(//div[@role='button'])[1]")
	//WebElement MainMenu;
	
	@FindBy(xpath = "(//div[@role='button' and contains(@style,'user-select: none;')])[1]]")
	//@FindBy(xpath = "(//div[@role='button'])[7]")
//	@FindBy(xpath = "(//input[@name='q']//following::div[@role='button'])[4]")
	WebElement Compose ;
	
	@FindBy(xpath = "//div[@class='oj']//textarea[@name ='to']")
	//@FindBy(name = "to")
	//@FindBy(xpath = "//textarea[@name ='to']")    //send keys
	WebElement WriteTo;
	
	@FindBy(className = "aoD az6" )
	WebElement WriteSub; // send keys
	
	@FindBy(xpath = "//div[@class = 'Am Al editable LW-avf']")
	WebElement WriteText ;
	
	@FindBy(xpath = "//div[@aria-label='Send ‪(Ctrl-Enter)‬']")
	WebElement Send ;
	
	@FindBy(xpath = "//a[@class= 'gb_z gb_Ia gb_g']//span[@class='gb_Ba gbii']")
	WebElement ForLogOut ;
	
	@FindBy(xpath = "//a[text()='Sign out']")
	WebElement LogOut ;
	
	public Mod8PageObjectModel(WebDriver driver)
	{
		PageFactory.initElements(driver, this); // constructory to link page factory with POM
	}	
		
	//Define Methods/ actions/ operations to be performed
	public void LogIn(String SId, String pas) throws InterruptedException
	{
		EmailId.sendKeys(SId);
		Thread.sleep(1000);
		ClickNext1.click();
		Thread.sleep(1000);
		Pass.sendKeys(pas);
		Thread.sleep(1000);
		ClickNext2.click();
	}
	
	public void EnterGmail() throws InterruptedException
	{
		Button.click();
		Gmail.click();
	//	Thread.sleep(1000);
		/*
		 * InnerNext.click(); ViewButton.click();
		 */
	}
	public void ComposeEmail() throws InterruptedException 
	{
	//	MainMenu.click();
		Thread.sleep(2000);
		Compose.click();
	}
		
	public void SelectTo(String RId) throws Exception 
	{
		
		
		//WriteTo.clear();
		
		WriteTo.sendKeys(RId);
		
		Thread.sleep(3000);
		
		WriteSub.sendKeys("Test Email");
		
		Thread.sleep(3000);
		WriteText.sendKeys("Module 8 page Object Model Case study for Edureka");
		
		Thread.sleep(3000);
		Send.click();
	}
	public void LogOut()
	{
		ForLogOut.click();
		LogOut.click();
	}
}
