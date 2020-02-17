package PractiseSelenium;// Page Object Class---Objects and Operation Logic

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumHomePage {

	public SeleniumHomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Download")
	WebElement ClickDownload;

	@FindBy(linkText = "Projects")
	WebElement ClickProjects;

	@FindBy(xpath = "//a[@title ='Return to Selenium home page']")
	WebElement SelHP;

	public void Download() {
		ClickDownload.click();
		
	}

	public void Projects() {
		ClickProjects.click();

	}

	public void HomePage() {
		SelHP.click();
	}

}
