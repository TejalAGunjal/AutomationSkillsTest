package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MouseHoverPage {
	private WebDriver driver;

	public MouseHoverPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/img")
	WebElement movemouseimage1;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/img")
	WebElement movemouseimage2;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[3]/img")
	WebElement movemouseimage3;
	
	
	public void navigateToMouseHoverPage() {
		driver.get("https://the-internet.herokuapp.com/hovers");
	}
	
	public void mouseHover1() {
		
		Actions actions = new Actions(driver);
	    actions.moveToElement(movemouseimage1).build().perform();
	
	    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
}
	}
	
public void mouseHover2() {
		
		Actions actions = new Actions(driver);
	    actions.moveToElement(movemouseimage2).build().perform();
	try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
}
	}

public void mouseHover3() {
	
	Actions actions = new Actions(driver);
    actions.moveToElement(movemouseimage3).build().perform();
try {
    Thread.sleep(5000);
} catch (InterruptedException e) {
    e.printStackTrace();
}
}
}
