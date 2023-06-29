package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class FramePage {
	private WebDriver driver;

	public FramePage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//*[@id=\"tinymce\"]")
	WebElement editor;
	
	
	public void navigateToFramePage() {
		driver.get("https://the-internet.herokuapp.com/iframe");
		try {
	        Thread.sleep(5000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	}
	}
	
	public void framePage(String text) {
	
		driver.switchTo().frame("mce_0_ifr");
	    editor.sendKeys(text);
	    driver.switchTo().defaultContent();
	
	try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
}
	}
	
	}

