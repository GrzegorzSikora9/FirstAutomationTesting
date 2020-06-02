package utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import pageObjects.AcordionPage;
import pageObjects.Action_Page;
import pageObjects.Ajax_Loader_Page;
import pageObjects.AutocompleteFileDatepicker_Page;
import pageObjects.Button_click_Page;
import pageObjects.DropdownMenu_Page;
import pageObjects.HiddenElements_Page;
import pageObjects.IFrame_Page;
import pageObjects.PopupAllert_Page;
import pageObjects.Scrolling_Page;
import pageObjects.TodoList_Page;



public class DriverFactory {
	public static WebDriver driver;
	public static Button_click_Page buttonClickPage;
	public static TodoList_Page todolist_page; 
	public static AcordionPage acordionpage; 
	public static DropdownMenu_Page dropdownmenuPage; 
	public static Ajax_Loader_Page ajaxloaderPage; 
	public static Action_Page actionpage; 
	public static Scrolling_Page scrollingpage; 
	public static PopupAllert_Page popupallertPage; 
	public static IFrame_Page iframepage; 
	public static HiddenElements_Page hiddenelementsPage; 
	public static AutocompleteFileDatepicker_Page autocompeletePage;

	@SuppressWarnings("deprecation")
	public WebDriver getDriver() {
		try {
			// Read Config
			Properties p = new Properties();
			FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\properties\\config.properties");
			p.load(fi);
			String browserName = p.getProperty("browser");

			switch (browserName) {

			case "firefox":
				// code
				if (null == driver) {
					System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
					DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					capabilities.setCapability("marionette", true);
					driver = new FirefoxDriver();
					driver.manage().window().maximize();
				}
				break;

			case "chrome":
				// code
				if (null == driver) {
					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
					// CHROME OPTIONS
					// DesiredCapabilities for unexpected alert
					DesiredCapabilities dc = new DesiredCapabilities();
					dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
					driver = new ChromeDriver(dc);
					driver.manage().window().maximize();
				}
				break;

			case "ie":
				// code
				if (null == driver) {
					// DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
					System.setProperty("webdriver.ie.driver", Constant.IE_DRIVER_DIRECTORY);
					// capabilities.setCapability("ignoreZoomSetting", true);
					 driver = new EdgeDriver(); 
					driver.manage().window().maximize();
				}
				break;
			}
		} catch (Exception e) {
			System.out.println("Unable to load browser: " + e.getMessage());
		} finally {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			buttonClickPage = PageFactory.initElements(driver, Button_click_Page.class);
			todolist_page = PageFactory.initElements(driver, TodoList_Page.class);
			acordionpage = PageFactory.initElements(driver, AcordionPage.class);
			dropdownmenuPage = PageFactory.initElements(driver, DropdownMenu_Page.class);
			ajaxloaderPage = PageFactory.initElements(driver, Ajax_Loader_Page.class);
			actionpage = PageFactory.initElements(driver, Action_Page.class);
			scrollingpage = PageFactory.initElements(driver, Scrolling_Page.class);
			popupallertPage = PageFactory.initElements(driver, PopupAllert_Page.class);
			iframepage = PageFactory.initElements(driver, IFrame_Page.class);
			hiddenelementsPage = PageFactory.initElements(driver, HiddenElements_Page.class);
			autocompeletePage = PageFactory.initElements(driver, AutocompleteFileDatepicker_Page.class);
			}
		return driver;
	}
}
