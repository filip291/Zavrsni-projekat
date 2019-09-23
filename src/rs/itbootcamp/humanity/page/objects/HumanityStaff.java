package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {
	// //a[@class='staff-employee'] klik na ime
	public static final String URL="https://srbijainc.humanity.com/app/staff/list/load/true/";
	private static final String ADD_EMPLOYEES_XPATH="//button[@id='act_primary']";
	private static final String firstnamep="//input[@id='_asf";
	private static final String lastnamep="//input[@id='_asl";
	private static final String emailp="//input[@id='_ase";
	private static final String drugideo="']";
	private static final String IME1="Lazar Car";
	private static final String IME2="Milos Obilic";
	private static final String IME3="Vuk Brankovic";
	private static final String SAVE_EMPLOYEE="//button[@id='_as_save_multiple']";
	
	
	public static WebElement getAddEmployees(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_EMPLOYEES_XPATH));
	}
	
	public static void clickAddEmployees(WebDriver driver) {
		getAddEmployees(driver).click();
	}
	
	public static WebElement getEmployee1(WebDriver driver) {
		String pd="//a[contains(text(),'";
		String dd="')]";
		String xpath=pd+IME1+dd;
		return driver.findElement(By.xpath(xpath));
		
	}
	public static void clickEmployee1(WebDriver driver) {
		getEmployee1(driver).click();
	}
	public static WebElement getEmployee2(WebDriver driver) {
		String pd="//a[contains(text(),'";
		String dd="')]";
		String xpath=pd+IME2+dd;
		return driver.findElement(By.xpath(xpath));
		
	}
	public static void clickEmployee2(WebDriver driver) {
		getEmployee2(driver).click();
	}
	public static WebElement getEmployee3(WebDriver driver) {
		String pd="//a[contains(text(),'";
		String dd="')]";
		String xpath=pd+IME3+dd;
		return driver.findElement(By.xpath(xpath));
		
	}
	public static void clickEmployee3(WebDriver driver) {
		getEmployee3(driver).click();
	}
	public static WebElement getAddEmployeeF(WebDriver driver, int index) {
		String xpath=firstnamep+index+drugideo;
		return driver.findElement(By.xpath(xpath));
	}
	public static WebElement getAddEmployeeL(WebDriver driver, int index) {
		String xpath=lastnamep+index+drugideo;
		return driver.findElement(By.xpath(xpath));
	}
	public static WebElement getAddEmployeeE(WebDriver driver, int index) {
		String xpath=emailp+index+drugideo;
		return driver.findElement(By.xpath(xpath));
	}
	public static void inputFirstName(WebDriver driver, int index, String name) {
		getAddEmployeeF(driver, index).sendKeys(name);
	}
	public static void inputLastName(WebDriver driver, int index, String name) {
		getAddEmployeeL(driver, index).sendKeys(name);
	}
	public static void inputEmail(WebDriver driver, int index, String name) {
		getAddEmployeeE(driver, index).sendKeys(name);
	}
	public static WebElement getSaveEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEE));
	}
	public static void clickSaveEmployee(WebDriver driver) {
		getSaveEmployee(driver).click();
	}
	
	
	
	
	
}
