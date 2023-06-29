package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileDownloadPage {
	private WebDriver driver;

	public FileDownloadPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "sample.png")
	WebElement filelink;
	
	String filepath = "download/sample.png";
	
	public void navigateToFiledownloadPage() {
		driver.get("https://the-internet.herokuapp.com/download");
	}
	
	public void fileDownload() {
		
	filelink.click();
	try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
}
	}
}