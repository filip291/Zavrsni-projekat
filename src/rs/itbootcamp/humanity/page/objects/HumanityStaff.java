package rs.itbootcamp.humanity.page.objects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {
	// //a[@class='staff-employee'] klik na ime
	public static final String URL = "https://srbijainc.humanity.com/app/staff/list/load/true/";
	private static final String ADD_EMPLOYEES_XPATH = "//button[@id='act_primary']";
	private static final String firstnamep = "//input[@id='_asf";
	private static final String lastnamep = "//input[@id='_asl";
	private static final String emailp = "//input[@id='_ase";
	private static final String drugideo = "']";
	private static final String EMPLOYEE_XPATH = "//a[contains(text(),'";
	private static final String EMPLOYEES_TABLE_XPATH = "//table[contains(@class,'employeesList')]//tbody";
	private static final String SAVE_EMPLOYEE = "//button[@id='_as_save_multiple']";

	public static WebElement getAddEmployees(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_EMPLOYEES_XPATH));
	}

	public static void clickAddEmployees(WebDriver driver) {
		getAddEmployees(driver).click();
	}

	// first name input
	public static WebElement getAddEmployeeF(WebDriver driver, int index) {
		String xpath = firstnamep + index + drugideo;
		return driver.findElement(By.xpath(xpath));
	}

	public static void inputFirstName(WebDriver driver, int index, String name) {
		getAddEmployeeF(driver, index).sendKeys(name);
	}

	// last name input
	public static WebElement getAddEmployeeL(WebDriver driver, int index) {
		String xpath = lastnamep + index + drugideo;
		return driver.findElement(By.xpath(xpath));
	}

	public static void inputLastName(WebDriver driver, int index, String name) {
		getAddEmployeeL(driver, index).sendKeys(name);
	}

	// email input
	public static WebElement getAddEmployeeE(WebDriver driver, int index) {
		String xpath = emailp + index + drugideo;
		return driver.findElement(By.xpath(xpath));
	}

	public static void inputEmail(WebDriver driver, int index, String name) {
		getAddEmployeeE(driver, index).sendKeys(name);
	}

	// save employees
	public static WebElement getSaveEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_EMPLOYEE));
	}

	public static void clickSaveEmployee(WebDriver driver) {
		getSaveEmployee(driver).click();
	}

	// employees list
	public static List<String> getEmployeesList(WebDriver driver) {
		List<WebElement> el = driver.findElement(By.xpath(EMPLOYEES_TABLE_XPATH))
				.findElements(By.className("staff-employee"));
		List<String> zaposleni = new ArrayList<String>();
		for (WebElement e : el) {
			zaposleni.add(e.getAttribute("innerHTML"));
		}
		return zaposleni;
	}

	// input employees info
	public static void InputEmp(WebDriver driver, int index, String ime, String prezime, String email) {
		inputFirstName(driver, index, ime);
		inputLastName(driver, index, prezime);
		inputEmail(driver, index, email);
	}

	// get employee
	public static WebElement getEmpByName(WebDriver driver, String ime) {
		return driver.findElement(By.xpath(EMPLOYEE_XPATH + ime + drugideo));
	}

	public static void clickEmpByName(WebDriver driver, String ime) {
		getEmpByName(driver, ime).click();

	}

}
