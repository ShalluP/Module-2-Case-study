package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProjectPage {

	@FindBy(linkText = "Selenium Grid")
	WebElement SelGrid;

	@FindBy(linkText = "Selenium IDE")
	WebElement SelIDE;

	@FindBy(linkText = "Selenium Remote Control")
	WebElement SelRC;

	public ProjectPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void ClickOnSelGrid() 
{
		SelGrid.click();
		
	}
	
	public void ClickOnSelIDE() {
		SelIDE.click();}
	
	
	public void ClickOnSelRC()  {
		SelRC.click();
	}

}
