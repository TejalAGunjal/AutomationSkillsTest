package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPage {
	private WebDriver driver;

	public DynamicLoadingPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Example 1: Element on page that is hidden")
	WebElement clickpage;
	
	@FindBy(css = "#start button")
    WebElement clickstart;
	
	@FindBy(id = "finish")
    WebElement text;
	
	public void navigateToDynamicLoadingPage() {
		driver.get("https://the-internet.herokuapp.com/dynamic_loading");
	}
	
	public void dynamicLoading1() {
		
		clickpage.click();
		}
      
	public void dynamicLoading2() {
		
		clickstart.click();
		
		try {
	    Thread.sleep(5000); // Wait for 5 second (5000 milliseconds)
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	}

	public boolean isTextDisplayed() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOf(text));
		
		return text.isDisplayed();
		
		
	}
}
	



