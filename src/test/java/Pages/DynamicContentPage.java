package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DynamicContentPage {
	private WebDriver driver;

	public DynamicContentPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "click here") 
	WebElement refresh;
	
    public void navigateToDynamicContentPage() {
    	
    	driver.get("https://the-internet.herokuapp.com/dynamic_content");
    	try {
		    Thread.sleep(5000); 
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
    }
    
    public void pageRefresh() {
    	
    	for (int i = 0; i < 2; i++) {
    		refresh.click();
        
    	try {
    		    Thread.sleep(5000); 
    		} catch (InterruptedException e) {
    		    e.printStackTrace();
    		}
        }
    }
    
    public void isContentChanged() {
    	
    	WebElement dynamicContentElement = driver.findElement(By.xpath("//div[@class='row']"));
        String initialContent = dynamicContentElement.getText();
        String refreshedContent = dynamicContentElement.getText();
        Assert.assertEquals(initialContent, refreshedContent);
    }
}
