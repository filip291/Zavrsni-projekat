package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMenu {
	public static final String URL = "https://srbijainc.humanity.com/app/dashboard/";
	private static final String SETTINGS_URL="https://srbijainc.humanity.com/app/admin/settings/";
	private static final String DASHBOARD_XPATH = "//a[@id='sn_dashboard']//span[@class='primNavQtip__inner']";
	private static final String SHIFT_PLANNING_XPATH = "//a[@id='sn_schedule']//span[@class='primNavQtip__inner']";
	private static final String CLOCK_XPATH = "//a[@id='sn_timeclock']//span[@class='primNavQtip__inner']";
	private static final String LEAVE_XPATH = "//a[@id='sn_requests']//span[@class='primNavQtip__inner']";
	private static final String TRAINING_XPATH = "//a[@id='sn_training']//span[@class='primNavQtip__inner']";
	private static final String STAFF_XPATH = "//a[@id='sn_staff']//span[@class='primNavQtip__inner']";
	private static final String PAYROLL_XPATH = "//a[@id='sn_payroll']//span[@class='primNavQtip__inner']";
	private static final String REPORTS_XPATH = "//a[@id='sn_reports']//span[@class='primNavQtip__inner']";
	private static final String SETTINGS_XPATH= "//a[@id='sn_admin']";

	// click dashboard
	public static WebElement getDashboard(WebDriver driver) {
		return driver.findElement(By.xpath(DASHBOARD_XPATH));
	}

	public static void clickDashboard(WebDriver driver) {
		getDashboard(driver).click();
	}

	// click shift planning
	public static WebElement getShiftPlanning(WebDriver driver) {
		return driver.findElement(By.xpath(SHIFT_PLANNING_XPATH));
	}

	public static void clickShiftPlanning(WebDriver driver) {
		getShiftPlanning(driver).click();
	}

	// click clock
	public static WebElement getClock(WebDriver driver) {
		return driver.findElement(By.xpath(CLOCK_XPATH));
	}

	public static void clickClock(WebDriver driver) {
		getClock(driver).click();
	}

	// click leave
	public static WebElement getLeave(WebDriver driver) {
		return driver.findElement(By.xpath(LEAVE_XPATH));
	}

	public static void clickLeave(WebDriver driver) {
		getLeave(driver).click();
	}

	// click training
	public static WebElement getTraining(WebDriver driver) {
		return driver.findElement(By.xpath(TRAINING_XPATH));
	}

	public static void clickTraining(WebDriver driver) {
		getTraining(driver).click();
	}

	// click staff
	public static WebElement getStaff(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF_XPATH));
	}

	public static void clickStaff(WebDriver driver) {
		getStaff(driver).click();
	}

	// click payroll
	public static WebElement getPayroll(WebDriver driver) {
		return driver.findElement(By.xpath(PAYROLL_XPATH));
	}

	public static void clickPayroll(WebDriver driver) {
		getPayroll(driver).click();
	}

	// click reports
	public static WebElement getReports(WebDriver driver) {
		return driver.findElement(By.xpath(REPORTS_XPATH));
	}

	public static void clickReports(WebDriver driver) {
		getReports(driver).click();
	}
	// click settings 
	public static WebElement getSettings(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_XPATH));
	}
	public static void clickSettings(WebDriver driver) {
		getSettings(driver).click();
	}
	public static boolean getSettingsTest(WebDriver driver) {
		clickSettings(driver);
		String url;
		url=driver.getCurrentUrl();
		if (url.contains(SETTINGS_URL)) {
			return true;
		}else return false;
	}
	
}
