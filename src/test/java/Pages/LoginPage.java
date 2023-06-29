package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	private WebDriver driver;

	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	WebElement username;

	@FindBy(id="password")
	WebElement password;

	@FindBy(className="radius")
	WebElement submitButton;
	
	@FindBy(id = "flash")
	WebElement loggedInMessage;
	
	@FindBy(id = "flash-messages")
	WebElement loggedInFailureMessage;
	
	public void navigateToLogin() {
		driver.get("https://the-internet.herokuapp.com/login");
	}
	
	public void login(String user, String pass) {
		
		username.sendKeys(user);
		password.sendKeys(pass);
		submitButton.click();
		try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
	
	public boolean isUserLoggedIn() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOf(loggedInMessage));
		
		return loggedInMessage.isDisplayed();
		
	}
	
	public boolean isLoginFailed() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.visibilityOf(loggedInFailureMessage));
		
		return loggedInFailureMessage.isDisplayed();
		
	}


}
