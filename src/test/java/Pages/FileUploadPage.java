package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPage {
	private WebDriver driver;

	public FileUploadPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "file-upload")
	WebElement choosefile;
	
	@FindBy(id = "file-submit")
	WebElement fileupload;
	
	public void navigateToFileUploadPage() {
		driver.get("https://the-internet.herokuapp.com/upload");
	}
	
	public void filechoose() {
		
	choosefile.sendKeys("C:\\Users\\ASHUTOSH\\Downloads\\sample.png");
	
	try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
}
	}
	
	public void fileUpload() {
		
		fileupload.click();
		
		try {
	        Thread.sleep(5000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	}
		}
}

