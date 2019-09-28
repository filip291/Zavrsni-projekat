package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.DisplayAction;

public class HumanityProfile {
	public static final String URL = "https://srbijainc.humanity.com/app/dashboard/";
	private static final String PROFILE_XPATH = "//img[@id='tr_avatar']";
	private static final String PROFILE_LINK_XPATH = "//a[contains(text(),'Profile')]";
	private static final String SETTINGS_LINK_XPATH = "//a[@href='https://srbijainc.humanity.com/app/staff/edit/5093157/'][contains(text(),'Settings')]";
	private static final String AVAILABILITY_LINK_XPATH = "//a[@href='https://srbijainc.humanity.com/app/staff/availability/5093157/']";
	private static final String SIGN_OUT_XPATH = "//a[contains(text(),'Sign Out')]";
	private static final String VERSION_XPATH = "//div[@id='humanityAppVersion']";
	private static final String EDIT_DETAILS_XPATH = "//a[contains(text(),'Edit Details')]";
	private static final String SAVE_CHG_XPATH = "//td[@colspan='2']//input[@value='Save Employee']";
	private static final String NO_AVATAR_URL = "https://d3l54fgzztlejs.cloudfront.net/app/layout/images/no_avatar.png";
	//private static final String NO_AVATAR_CLASS = "j-user-avatar-settings";

	public static WebElement getDetails(WebDriver driver) {
		return driver.findElement(By.xpath(EDIT_DETAILS_XPATH));
	}

	public static void clickDetails(WebDriver driver) {
		getDetails(driver).click();
	}

	public static WebElement getProfile(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILE_XPATH));
	}

	public static void clickProfile(WebDriver driver) {
		getProfile(driver).click();
	}

	public static WebElement getProfileLink(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILE_LINK_XPATH));
	}

	public static void clickProfileLink(WebDriver driver) {
		getProfileLink(driver).click();
	}

	public static WebElement getSettings(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_LINK_XPATH));
	}

	public static void clickSettings(WebDriver driver) {
		getSettings(driver).click();
	}

	public static WebElement getAvailability(WebDriver driver) {
		return driver.findElement(By.xpath(AVAILABILITY_LINK_XPATH));
	}

	public static void clickAvailability(WebDriver driver) {
		getAvailability(driver).click();
	}

	public static WebElement getSignOut(WebDriver driver) {
		return driver.findElement(By.xpath(SIGN_OUT_XPATH));
	}

	public static void clickSignOut(WebDriver driver) {
		getSignOut(driver).click();
	}

	public static WebElement getVersion(WebDriver driver) {
		return driver.findElement(By.xpath(VERSION_XPATH));
	}

	public static String printVersion(WebDriver driver) {
		WebElement e = driver.findElement(By.xpath(VERSION_XPATH)).findElement(By.tagName("b"));
		String s = e.getText();
		return s.toString();
	}

	public static WebElement getSaveChg(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_CHG_XPATH));
	}

	public static void clickSaveChg(WebDriver driver) {
		getSaveChg(driver).click();
	}

	public static void uploadPhoto(WebDriver driver, String putanja) {
		String xpathSlika = "//input[@id='fileupload']";
		WebElement izaberifajl = driver.findElement(By.xpath(xpathSlika));
		izaberifajl.sendKeys(putanja);
	}

	public static boolean testPhoto(WebDriver driver) {
		if (driver.findElement(By.xpath("//img[@id='userAvatar5093157']")).getAttribute("src")
				.equals("NO_AVATAR_URL")) {
			return false;
		} else
			return true;
	}

}
