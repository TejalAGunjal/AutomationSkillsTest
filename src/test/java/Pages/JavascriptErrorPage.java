package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JavascriptErrorPage {
	private WebDriver driver;

	public JavascriptErrorPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "JavaScript onload event error")
	WebElement clickjserror;
	
	
	public void navigateToJavaScriptErrorPage() {
		driver.get("https://the-internet.herokuapp.com");
		
		clickjserror.click();
		
		try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}
