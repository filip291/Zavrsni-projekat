package rs.itbootcamp.humanity.page.objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityHome {
	public static final String URL="https://www.humanity.com/";
	private static final String FULL_NAME_XPATH="//div[@class='input-wrapper']//input[@placeholder='Full Name']";
	private static final String WORK_EMAIL_XPATH="//div[@class='input-wrapper']//input[@placeholder='Work Email']";
	private static final String START_FREE1_XPATH="//input[@id='free-trial-link-01']";
	private static final String LOGIN_XPATH="//p[contains(text(),'LOGIN')]";
	private static final String SUBMIT_LOGIN_XPATH="//button[contains(text(),'Log in')]";
	private static final String START_FREE2_XPATH="//div[@id='tryForFree']";
	private static final String ABOUT_US_XPATH="//div[@class='header-holder']";
	private static final String EMAIL_XPATH="//input[@id='email']";
	private static final String PASSWORD_XPATH="//input[@id='password']";
	private static final String URL_TEST="https://srbijainc.humanity.com/app/dashboard/";
	
	// hvatanje full name polja
	public static WebElement getFullName(WebDriver driver) {
		return driver.findElement(By.xpath(FULL_NAME_XPATH));
	}
	public static void clickFullName(WebDriver driver) {
		getFullName(driver).click();
	}
	public static void inputFullName(WebDriver driver, String data) {
		getFullName(driver).sendKeys(data);
	}
	// hvatanje work email polja
	public static WebElement getWorkEmail(WebDriver driver) {
		return driver.findElement(By.xpath(WORK_EMAIL_XPATH));
	}
	public static void clickWorkEmail(WebDriver driver) {
		getWorkEmail(driver).click();
	}
	public static void inputWorkEmail(WebDriver driver, String data) {
		getWorkEmail(driver).sendKeys(data);
	}
	// start free 1
	public static WebElement getStartFree1(WebDriver driver) {
		return driver.findElement(By.xpath(START_FREE1_XPATH));
	}
	public static void clickStartFree1(WebDriver driver) {
		getStartFree1(driver).click();
	}
	// start free 2
	public static WebElement getStartFree2(WebDriver driver) {
		return driver.findElement(By.xpath(START_FREE2_XPATH));
	}
	public static void clickStartFree2(WebDriver driver) {
		getStartFree2(driver).click();
	}
	// about us
	public static WebElement getAboutUs(WebDriver driver) {
		return driver.findElement(By.xpath(ABOUT_US_XPATH));
	}
	public static void clickAboutUs(WebDriver driver) {
		getAboutUs(driver).click();
	}
	// login dugme
	public static WebElement getLogin(WebDriver driver) {
		return driver.findElement(By.xpath(LOGIN_XPATH));
	}
	public static void clickLogin(WebDriver driver) {
		getLogin(driver).click();
	}
	// email set
	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_XPATH));
	}
	public static void inputEmail(WebDriver driver, String data) {
		getEmail(driver).sendKeys(data);
	}
	// password
	public static WebElement getPassword(WebDriver driver) {
		return driver.findElement(By.xpath(PASSWORD_XPATH));
	}
	public static void inputPassword(WebDriver driver, String data) {
		getPassword(driver).sendKeys(data);
	}
	// submit login
	public static WebElement getSLogin(WebDriver driver) {
		return driver.findElement(By.xpath(SUBMIT_LOGIN_XPATH));
	}
	public static void clickSLogin(WebDriver driver) {
		getSLogin(driver).click();
	}
	// login sve zajedno 
	public static void Login(WebDriver driver, String email, String password) {
		driver.get(HumanityHome.URL);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		getLogin(driver).click();
		inputEmail(driver, email);
		inputPassword(driver, password);
		getSLogin(driver).click();
	}
	// test login
	public static boolean LoginTest(WebDriver driver) {
		String url = driver.getCurrentUrl();
		if (url.equalsIgnoreCase(URL_TEST)) {
			System.out.println("Logovanje uspesno.");
			return true;
		} else {
			System.out.println("Logovanje neuspesno.");
			System.out.println(url);
			return false;
		}
	}
	
	
	
}
