package PractiseSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHPObjectClassPractise
{
	public GoogleHPObjectClassPractise(WebDriver driver) // parameters of constructor
	{
		PageFactory.initElements(driver, this);// Initialize the element on this page with webdriver
	}
	
	@FindBy(name = "q")
	WebElement SearchText ; // defining the elements with locators
	
	@FindBy(xpath = "//div[text()='Selenium - Web Browser Automation']")
	//@FindBy(linkText = "Selenium - Web Browser Automation")
	WebElement LinkSelenium;

	
	// Create methods to display what to perform ... operation logic
	public void SearchOnGoogle(String SearchInput) // declaring the parametrers so that they can be initialized/used through the test cases.
	{
		SearchText.clear();
		SearchText.sendKeys(SearchInput);
	//	SearchText.sendKeys("Selenium HQ"); //directly putting the text in the search box
		SearchText.submit();
	}
	
	public void ClickSeleniumLink()
	{
		LinkSelenium.click();
	}
}

