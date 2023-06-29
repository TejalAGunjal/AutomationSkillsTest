package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPage {
	private WebDriver driver;

	public DragAndDropPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "column-a")
	WebElement dragdropA;
	
	@FindBy(id = "column-b")
	WebElement dragdropB;
	
    public void navigateToDragAndDropPage() {
		
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
	}
	public void dragAndDrop() {
		
		String initialTextA = dragdropA.getText();
        String initialTextB = dragdropB.getText();
		
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragdropA, dragdropB).perform();
        
		String newTextA = dragdropA.getText();
        String newTextB = dragdropB.getText();

//        Assert.assertEquals(newTextA, initialTextB);
//        Assert.assertEquals(newTextB, initialTextA);
      
		try {
		    Thread.sleep(5000); 
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	}
	
}
