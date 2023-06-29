package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
public class CheckboxPage {
	private WebDriver driver;

	public CheckboxPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="input[type='checkbox']:nth-of-type(1)") 
	WebElement checkbox1;

	@FindBy(css="input[type='checkbox']:nth-of-type(2)")
	WebElement checkbox2;
	
	public void navigateToCheckboxPage() {
		
		driver.get("https://the-internet.herokuapp.com/checkboxes");
	}
	
	public void checkboxCheck() {
    
		if (!checkbox1.isSelected()) {
        checkbox1.click();
    }
		try {
		    Thread.sleep(5000); 
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}

        if (checkbox2.isSelected()) {
        checkbox2.click();
    }
	try {
	    Thread.sleep(5000); 
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
}
	public void isCheckboxChecked() {
		
		Assert.assertTrue(checkbox1.isSelected(), "Checkbox 1 should be checked.");
        Assert.assertFalse(checkbox2.isSelected(), "Checkbox 2 should be unchecked.");
}
}
	
	
	
	
