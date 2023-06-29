package Testcases;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Pages.LoginPage;
import Pages.ContextMenuPage;
import Pages.CheckboxPage;
import Pages.*;

public class FunctionalityTests {
	
	private WebDriver driver;
	
	@Before
    public void setUp() {
        // Initialize the WebDriver and open the browser
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ASHUTOSH\\eclipse-workspace\\AmazonShopping\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
    }
	
	@Test
	public void loginSuccessTest() {
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.navigateToLogin();
		loginpage.login("tomsmith", "SuperSecretPassword!");
		Assert.assertTrue("You logged into a secure area!", loginpage.isUserLoggedIn());
		System.out.println("login Successful");
	}
	
	@Test
	public void loginFailureTest() {
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.navigateToLogin();
		loginpage.login("ABC", "123");
		Assert.assertTrue("Your username is invalid!", loginpage.isLoginFailed());
		System.out.println("login Failed");
	}
	
	@Test
     public void checkboxTest() {
		
		CheckboxPage checkboxpage = new CheckboxPage(driver);
		checkboxpage.navigateToCheckboxPage();
		checkboxpage.checkboxCheck();
	    checkboxpage.isCheckboxChecked();
	    System.out.println("Boxes are properly checked and unchecked");
	}
	
	@Test
	public void contextMenuTest() {
		
		ContextMenuPage contextmenupage = new ContextMenuPage(driver);
		contextmenupage.navigateToContextMenuPage();
		contextmenupage.contextMenu();
	    contextmenupage.assertAlertMenuText("You selected a context menu");
	}
	
	@Test
	public void dragAndDropTest() {
		
		DragAndDropPage draganddroppage = new DragAndDropPage(driver);
		draganddroppage.navigateToDragAndDropPage();
		draganddroppage.dragAndDrop();
	}
	
	@Test
	public void dropDownTest() {
		
		DropDownPage dropdownpage = new DropDownPage(driver);
		dropdownpage.navigateToDropDownPage();
		dropdownpage.dropDown();
		System.out.println("Option 1 and Option 2 are selected.");
	}
	
	@Test
	public void dynamicContentTest() {
		
		DynamicContentPage dynamiccontentpage = new DynamicContentPage(driver);
		dynamiccontentpage.navigateToDynamicContentPage();
		dynamiccontentpage.pageRefresh();
		dynamiccontentpage.isContentChanged();
		System.out.println("Content changes on each refresh");
	}
	
	@Test
	public void dynamicControlsTest() {
		
		DynamicControlsPage dynamiccontrolpage = new DynamicControlsPage(driver);
		 dynamiccontrolpage.navigateToDynamicControlPage();
		 dynamiccontrolpage.testRemoveButton();
		 dynamiccontrolpage.testAddButton();
		 dynamiccontrolpage.testEnableButton();
		 dynamiccontrolpage.testDisableButton();
	}
	
	@Test
	public void dynamicLoadingTest() {
		
		DynamicLoadingPage dynamicloadingpage = new DynamicLoadingPage(driver);
		
	    dynamicloadingpage.navigateToDynamicLoadingPage();
		dynamicloadingpage.dynamicLoading1();
		dynamicloadingpage.dynamicLoading2();
		Assert.assertTrue("Hello World!", dynamicloadingpage.isTextDisplayed());
	}
	
	@Test
	public void fileDownloadTest() {
		
		FileDownloadPage filedownloadpage = new FileDownloadPage(driver);
		filedownloadpage.navigateToFiledownloadPage();
		filedownloadpage.fileDownload();
	}
	
	@Test
	public void fileUploadTest() {
		
		FileUploadPage fileuploadpage = new FileUploadPage(driver);
		fileuploadpage.navigateToFileUploadPage();
		fileuploadpage.filechoose();
		fileuploadpage.fileUpload();
	}
	
	@Test
	public void floatingMenuScrollTest() {
		
		FloatingMenuScrollPage floatingmenupage = new FloatingMenuScrollPage(driver);
		floatingmenupage.navigateToFloatingMenuPage();
		floatingmenupage.testFloatingMenuPage();
		System.out.println("Floating Menu is dispalyed after scroll");
		floatingmenupage.isFloatingMenuDisplayed();
	}
	
	@Test
	public void frameTest() {
		
		FramePage framepage = new FramePage(driver);
		framepage.navigateToFramePage();
		framepage.framePage("Hello World");
		System.out.println("Typed Text is expected");
	}
	
	@Test
	public void mouseHoverTest() {
		
		MouseHoverPage mousehoverpage = new MouseHoverPage(driver);
		mousehoverpage.navigateToMouseHoverPage();
		mousehoverpage.mouseHover1();
		mousehoverpage.mouseHover2();
		mousehoverpage.mouseHover3();
	}
	
	@Test
	public void jsAlertTest() {
		
		JavaScriptAlertsPage jsscriptalertspage = new JavaScriptAlertsPage(driver);
		jsscriptalertspage.navigateToJavaScriptAlertsPage();
		jsscriptalertspage.jsAlertButton();
		System.out.println("Alert Message Pop-up");
		jsscriptalertspage.jsConfirmButton();
		System.out.println("Alert Message Pop-up");
		jsscriptalertspage.jsPromptButton();
		System.out.println("Message contains the typed message");
	}
	
	@Test
	public void jsErrorTest() {
		
		JavascriptErrorPage jserror = new JavascriptErrorPage(driver);
		jserror.navigateToJavaScriptErrorPage();
	}
	@Test
	public void newTabTest() {
		
		NewTabPage newtabpage = new NewTabPage(driver);
		newtabpage.navigateToNewTabPage();
		newtabpage.newTabPage();
		System.out.println("New Window is opened");
	}
	
	@Test
	public void messageNotificationTest() {
		
		NotificationPage notificationpage = new NotificationPage(driver);
		notificationpage.navigateToNotificationPage();
		notificationpage.notificationMessage();
		System.out.println("Message is Displayed");
	}
	
	@After
	public void tearDown() {
		
		driver.quit();
		
	}
	
}
