package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class JavaScriptAlertsPage {
	private WebDriver driver;

	public JavaScriptAlertsPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"content\"]/div/ul/li[1]/button")
	WebElement clickjsalert;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/ul/li[2]/button")
	WebElement clickjsconfirm;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/ul/li[3]/button")
	WebElement clickjsprompt;
	
	public void navigateToJavaScriptAlertsPage() {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	}
	
	public void jsAlertButton() {
		
         clickjsalert.click();
          
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
          Alert alert = driver.switchTo().alert();
          String alertText = alert.getText();
          Assert.assertEquals(alertText, "I am a JS Alert");
          alert.accept();
	}
    public void jsConfirmButton() {
      		
              clickjsconfirm.click();
               
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               Alert alert = driver.switchTo().alert();
               String alertText = alert.getText();
               Assert.assertEquals(alertText, "I am a JS Confirm");
               alert.accept();
}
    
    public void jsPromptButton() {
  		
       clickjsprompt.click();
         
         try {
             Thread.sleep(1000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
         Alert alert = driver.switchTo().alert();
         String alertText = alert.getText();
         Assert.assertEquals(alertText, "I am a JS prompt");
         alert.sendKeys("Typed message");
         alert.accept();

         // Assert the result after typing a message
         WebElement result = driver.findElement(By.id("result"));
         String resultText = result.getText();
         Assert.assertTrue(resultText.contains("Typed message"));
}
}