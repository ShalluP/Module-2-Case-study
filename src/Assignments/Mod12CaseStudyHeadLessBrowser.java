package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/*Launch a headless Browser (phantomjs)
2. Navigate to Google search
3. Search for Edureka
4. Check if the page title has been changed
5. Capture the screenshot and save it in local
6. Repeat the same using HTML Unit Driver
*/
public class Mod12CaseStudyHeadLessBrowser {
	public static void main(String[] args) throws InterruptedException

	{

		WebDriver driver = new HtmlUnitDriver();

		driver.get("https://www.google.com/");

		String title1 = driver.getTitle();
		System.out.println("The title of the page before Edureka is :" + title1);

		WebElement SearchBox = driver.findElement(By.name("q"));
		SearchBox.click();

		SearchBox.sendKeys("Edureka");

		Thread.sleep(2000);
		
		SearchBox.submit();

		
		String title2 = driver.getTitle();
		System.out.println("The title of the page after Edureka is :" + title2);

		if (title1.equalsIgnoreCase(title2)) {
			System.out.println("No, the title has not changed");
		}

		else {
			System.out.println("Yes, the title has changed now ");
		}

		driver.close();
	}

}
