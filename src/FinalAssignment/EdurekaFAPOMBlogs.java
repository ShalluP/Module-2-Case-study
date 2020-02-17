package FinalAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/* Login to the portal 2. Navigate to blogs page 3. Refine the search for selenium blogs.
 *  4. Explore the blogs on interview questions 5. Close all the blogs tab. 

*/
public class EdurekaFAPOMBlogs {

	// Step 1: LogIn to the portal
	@FindBy(xpath = "//a[@data-gi-action=\"Login\" and contains(text(),'Log In')]")
	WebElement LogIn; // click

	@FindBy(id = "si_popup_email")
	WebElement UserName; // send keys

	@FindBy(id = "si_popup_passwd")
	WebElement Password;

	@FindBy(xpath = "//button[text()='Login']")
	WebElement ClickLogIn;

	// Step 2: Navigate to the Blogs
	@FindBy(xpath = "(//button[@class='dropdown-toggle'])[3]")
	WebElement Community;

	@FindBy(xpath = "(//a[text()='Blog'])[1]")
	WebElement Blog;

	@FindBy(xpath = "//button[text()='No thanks']")
	WebElement Alert;

	@FindBy(xpath = "//div[@class='category-box'] //h3[(text()='Software Testing')]")
	WebElement SoftwareTesting;

	// @FindBy(className = "count-tile interview-questions")

	@FindBy(xpath = "/html/body/section[2]/div/div/div[10]/div/div/a/img")
	WebElement SelIntVQues;

	// Creating a constructor for this page

	public EdurekaFAPOMBlogs(WebDriver driver) {

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
	public void ClickLogIn() throws InterruptedException {
		ClickLogIn.click();
		Thread.sleep(3000);
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

	}
}
