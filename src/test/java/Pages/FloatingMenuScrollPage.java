package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.openqa.selenium.By;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

public class FloatingMenuScrollPage {
	private WebDriver driver;
	
	public FloatingMenuScrollPage(WebDriver driver) 
	{
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	public void navigateToFloatingMenuPage() {
		driver.get("https://the-internet.herokuapp.com/floating_menu");
		try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
	public void testFloatingMenuPage() {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0, 400)");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
    }
	}
        
        public void isFloatingMenuDisplayed() {
        	
        	WebElement floatingMenu = driver.findElement(By.xpath("//*[@id=\"menu\"]"));
            Assert.assertTrue(floatingMenu.isDisplayed(), "Floating menu is not displayed");
        }
        
	}

