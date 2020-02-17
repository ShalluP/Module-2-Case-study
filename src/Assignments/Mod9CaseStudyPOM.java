package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mod9CaseStudyPOM {
	/*
	 * Launch browser and navigate to the Edureka portal 2. Log In with your
	 * credentials, reading the data from excel sheet (username, password) 3. Open
	 * blogs in a new tab 4. Filter for selenium blogs 5. Navigate to interview
	 * questions in the blog 6. Automate using Framework mechanism, create a generic
	 * framework for reading and writing data to excel
	 */

	// Locating WebElements as Object and THus creating a Page Object Model

	@FindBy(xpath = "//a[@data-gi-action=\"Login\" and contains(text(),'Log In')]")
	WebElement LogIn; // click

	@FindBy(id = "si_popup_email")
	WebElement UserName; // send keys

	@FindBy(id = "si_popup_passwd")
	WebElement Password;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement ClickLogIn;

	@FindBy(xpath = "(//button[@class='dropdown-toggle'])[3]")
	WebElement Community;

	@FindBy(xpath = "(//a[text()='Blog'])[1]")
	WebElement Blog;
	
	@FindBy(xpath = "//button[text()='No thanks']")
	WebElement Alert;
	
	@FindBy(xpath = "//div[@class='category-box'] //h3[(text()='Software Testing')]")
	WebElement SoftwareTesting;

	//@FindBy(className = "count-tile interview-questions")
//	WebElement InterViewQue;

	/*
	 * @FindBy(xpath = "//a[text()='Explore Online Courses']") WebElement Explore;
	 * 
	 */	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[10]/div/div/a/img")
	WebElement SelIntVQues;

	public Mod9CaseStudyPOM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Creating Methods
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

	public void ExploreBlogs() throws InterruptedException {
		Community.click();
		Thread.sleep(1000);
		
		Blog.click();
		Thread.sleep(2000);
		
		Alert.click();
		Thread.sleep(3000);
		
		SoftwareTesting.click();
		Thread.sleep(3000);
		
		/*
		 * Explore.click(); Thread.sleep(2000);
		 
		
		InterViewQue.click();
		Thread.sleep(3000);
	*/
		SelIntVQues.click();
	}

}
