package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewTabPage {
	private WebDriver driver;

	public NewTabPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Click Here")
	WebElement newtab;
	
	@FindBy(className = "/html/body/div/h3")
	WebElement newWindow;
	
	public void navigateToNewTabPage() {
		driver.get("https://the-internet.herokuapp.com/windows");
	}
	
	public void newTabPage() {
		
          newtab.click();
          
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
          
          String currentWindowHandle = driver.getWindowHandle();
          for (String windowHandle : driver.getWindowHandles()) {
              if (!windowHandle.equals(currentWindowHandle)) {
                  driver.switchTo().window(windowHandle);
                  break;
              }
          }
	}
}
	

