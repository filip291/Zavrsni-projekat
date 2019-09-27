package rs.itbootcamp.humanity.page.objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HumanitySettings {
	public static final String URL="https://srbijainc.humanity.com/app/admin/settings/";
	private static final String COUNTRY_XPATH="//select[@id='country']";
	private static final String DEFAULT_LANGUAGE_XPATH="//select[@name='language']";
	private static final String TIME_FORMAT_XPATH="//select[@name='pref_24hr']";
	
	public static Select getCountry (WebDriver driver) {
		return new Select(driver.findElement(By.xpath(COUNTRY_XPATH)));
	}
	public static void selectCountry(WebDriver driver, String zemlja) {
		getCountry(driver).selectByVisibleText(zemlja);
	}
	public static Select getDefaultLanguage (WebDriver driver) {
		return new Select(driver.findElement(By.xpath(DEFAULT_LANGUAGE_XPATH)));
	}
	public static void selectDefaultLanguge(WebDriver driver, String jezik) {
		getDefaultLanguage(driver).selectByVisibleText(jezik);
	}
	public static Select getTimeFormat (WebDriver driver) {
		return new Select(driver.findElement(By.xpath(TIME_FORMAT_XPATH)));
	}
	public static void selectTimeFormat(WebDriver driver, String vreme) {
		getTimeFormat(driver).selectByVisibleText(vreme);
	}
	public static boolean SelectAll(WebDriver driver, String zemlja, String jezik, String vreme) {
		selectCountry(driver, zemlja);
		selectDefaultLanguge(driver, jezik);
		selectTimeFormat(driver, vreme);
		return true;
		
	}
	
}
