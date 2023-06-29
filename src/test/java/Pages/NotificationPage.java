package Pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.Assert;

public class NotificationPage {
	private WebDriver driver;

	public NotificationPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Click here")
	WebElement notificationmessage;
	
	@FindBy(id = "flash")
     WebElement message;
	
	public void navigateToNotificationPage() {
		driver.get("https://the-internet.herokuapp.com/notification_message_rendered");
	}
	
	public void notificationMessage() {
		
		for (int i = 0; i < 5; i++) {
            notificationmessage.click();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
}
		
	}
}

//		public void isMessageDispalyed() {
//			String messageText = driver.findElement(By.id("flash")).getText();
//            Assert.assertTrue(
//                    messageText.contains("Action Successful") ||
//                    messageText.contains("Action unsuccessful, please try again") ||
//                    messageText.contains("Action Unsuccessful"),
//                    "Expected notification message not found");
//		}
//}
