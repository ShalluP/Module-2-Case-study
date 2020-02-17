package FinalAssignment;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/* Login to the portal 2. Navigate to My Profile 3. Click on Edit Profile for the user 
 * 4. Update all the Professional details 5. Save the data and ensure that the data is updated. 6. Close the browser 
 */
public class EdurekaFAPOMEditProfile {
	WebDriver driver;
	// Step 1: LogIn to the portal

	@FindBy(xpath = "//a[@data-gi-action=\"Login\" and contains(text(),'Log In')]")
	WebElement LogIn; // click

	@FindBy(id = "si_popup_email")
	WebElement UserName; // send keys

	@FindBy(id = "si_popup_passwd")
	WebElement Password;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement ClickLogIn;

	// Navigate to MyProfile

	@FindBy(xpath = "(//button[@class='dropdown-toggle'])[5]")
	WebElement MyProfile;

	@FindBy(xpath = "//a[@class='dropdown-item' and  contains(text(),'My Profile')]")
	WebElement ClickMyProfile;

//  Edit Professional Details
	@FindBy(id = "professional_details")
	WebElement EditButton;

	@FindBy(name = "currentjob")
	WebElement JobTitle; // select class

	@FindBy(name = "userSkill")
	WebElement UpdateSkills;

	////*[@id="onboarding"]/div/div[1]/div[2]/div[2]/app-onboarding-professional-details/accordion/accordion-group/div/div[2]/div/form/button[2]
	@FindBy(xpath = "//button[@class=\"btn pull-right onboarding-primary-button\"and contains(text(),'Next')]")
	WebElement ClickNext1;

	@FindBy(xpath = "//button[@class='btn onboarding-primary-button pull-right' and text()='Next']")
	WebElement ClickNext2;

	@FindBy(xpath = "//button[@class=\"btn pull-right onboarding-primary-button\" and text()='Save']")
	WebElement Save;

	public EdurekaFAPOMEditProfile(WebDriver driver) {
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
	public void EditProfile() throws InterruptedException
	{
		Thread.sleep(3000);
		MyProfile.click();
		Thread.sleep(2000);
		
		ClickMyProfile.click();
		Thread.sleep(2000);
		
		EditButton.click();
		Thread.sleep(2000);
	}
	public void EditProfDetails() throws InterruptedException {
		Select sel = new Select(JobTitle);
		sel.selectByValue("Entry Level");
		
		JobTitle.click();
		
		Thread.sleep(2000);
		UpdateSkills.clear();
		UpdateSkills.sendKeys("Selenium Automation Tester");
		
	}
	 public void ClickNext() throws InterruptedException {
		Thread.sleep(5000);
		
		ClickNext1.click();
		Thread.sleep(2000);
		
		ClickNext2.click();
		Thread.sleep(2000);
		Save.click();
		
	}
	
	
	
}
