package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownPage {
	
		private WebDriver driver;

		public DropDownPage(WebDriver driver) 
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id = "dropdown")
		WebElement dropdown;
		
	    public void navigateToDropDownPage() {
			
			driver.get("https://the-internet.herokuapp.com/dropdown");
		}
		public void dropDown() {
		
			Select selectOption = new Select(dropdown);
			
			selectOption.selectByValue("1");
			
			try {
			    Thread.sleep(5000); 
			} catch (InterruptedException e) {
			    e.printStackTrace();
			}
		    selectOption.selectByValue("2");
		    
		    Assert.assertTrue(selectOption.getFirstSelectedOption().getText().equals("Option 2"));
			
		    try {
			    Thread.sleep(5000); 
			} catch (InterruptedException e) {
			    e.printStackTrace();
			}
		}
		
}