package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicControlsPage {
	private WebDriver driver;
	
	public DynamicControlsPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@type='button'][1]")
	WebElement removebutton;
	
	@FindBy(xpath = "//*[@id=\"checkbox-example\"]/button")
	WebElement addbutton;
	
	@FindBy(xpath = "//*[@id=\"input-example\"]/button")
	WebElement enablebutton;
	
	@FindBy(xpath = "//*[@id=\"input-example\"]/button")
	WebElement disablebutton;
	
	@FindBy(id = "checkbox")
	WebElement checkboxdisable;
	
	public void navigateToDynamicControlPage() {
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
	}
	
	public void testRemoveButton() {
		
		removebutton.click();
		try {
	        Thread.sleep(5000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	}
	}
		
		public void testAddButton() {
			addbutton.click();
			try {
		        Thread.sleep(5000);
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		}
		}
		public void testEnableButton() {
			enablebutton.click();
			try {
		        Thread.sleep(5000);
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		}
		}	
			public void testDisableButton() {
				disablebutton.click();
				try {
			        Thread.sleep(5000);
			    } catch (InterruptedException e) {
			        e.printStackTrace();
			}
		}
}
