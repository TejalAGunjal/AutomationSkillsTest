package Pages;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContextMenuPage {
	private WebDriver driver;

	public ContextMenuPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="hot-spot")
	WebElement rightclick;
	
    public void navigateToContextMenuPage() {
		
		driver.get("https://the-internet.herokuapp.com/context_menu");
	}
	public void contextMenu() {
		
		Actions actions = new Actions(driver);
		actions.contextClick(rightclick).build().perform();
		
		try {
		    Thread.sleep(5000); 
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	}
	
	public void assertAlertMenuText(String expectedText) {
    
        Alert alert = driver.switchTo().alert();
        String actualText = alert.getText();
        assertEquals(expectedText, actualText);
        alert.accept();
    }
}
