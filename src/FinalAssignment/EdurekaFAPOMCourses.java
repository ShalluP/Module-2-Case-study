package FinalAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*Login to the Portal 2. Navigate to the My Course Page 
 *  3. Validate if any courses have been enrolled for the user 4. Logout of the Portal
*/
public class EdurekaFAPOMCourses {
// Step 1: LogIn to the portal
	@FindBy(xpath = "//a[@data-gi-action=\"Login\" and contains(text(),'Log In')]")
	WebElement LogIn; // click

	@FindBy(id = "si_popup_email")
	WebElement UserName; // send keys

	@FindBy(id = "si_popup_passwd")
	WebElement Password;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement ClickLogIn;

//Step 2: Navigate to my course
	
	@FindBy(xpath = "//a[ contains(text(),'My Courses')]")
	WebElement MyCourse;

	@FindBy(xpath = "//span[text()='Selenium Certification Training ']")
	WebElement CapCourse;
	
	// Checking the already enrolled course and later validating it
	@FindBy(xpath = "//button[text()='Go to Course']")
	WebElement GoToCourse;

	@FindBy(xpath = "//div[@class='btn-group']//span[text()='Shallu Bass']")
	WebElement ShaBas;

	@FindBy(xpath = "//a[text()='Log Out']")
	WebElement LogOut;

	public EdurekaFAPOMCourses(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void LogIn() {
		LogIn.click();
	}

	public void SendCred(String Uname, String Pass) throws Exception {
		UserName.clear();
		UserName.sendKeys(Uname);

		Password.clear();
		Password.sendKeys(Pass);

		Thread.sleep(3000);

	}

	public void Click() throws InterruptedException {
		ClickLogIn.click();
		Thread.sleep(1000);
	}

	public void MyCourse() throws InterruptedException {
		
		MyCourse.click();
		Thread.sleep(3000);
		GoToCourse.click();
		Thread.sleep(2000);
		
	}
	
	public void LogOut() {
		ShaBas.click();
		LogOut.click();
	}
	}

