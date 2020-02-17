package PractiseSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrameworkFormPage {

	@FindBy(id = "ts_first_name")
	WebElement Fname;

	@FindBy(id ="ts_last_name" )
	WebElement Lname;
	
	@FindBy(id = "ts_address" )
	WebElement Add;
	
	

	public FrameworkFormPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void FormFill(String fName, String lName, String add) throws Exception
	{
		Fname.clear();
		Fname.sendKeys(fName);
		
		Lname.clear();
		Lname.sendKeys(lName);
		
		Add.clear();
		Add.sendKeys(add);
		
		Thread.sleep(5000);
	}
	
}
