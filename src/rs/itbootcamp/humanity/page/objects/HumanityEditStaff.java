package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditStaff {
	public static final String URL="https://srbijainc.humanity.com/app/staff/detail/5093157/";
	private static final String ADD_EMP_XPATH="//button[@id='act_primary']";
	private static final String EDIT_DETAILS_XPATH="//a[contains(text(),'Edit Details')]";
	private static final String PHOTO_UPLOAD_XPATH="//input[@id='fileupload']";
	private static final String NICK_NAME_XPATH="//input[@id='nick_name']";
	
	public static WebElement getAddEmp(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_EMP_XPATH));
	}
	public static void clickAddEmp(WebDriver driver) {
		getAddEmp(driver).click();
	}
	public static WebElement getEditDetails(WebDriver driver) {
		return driver.findElement(By.xpath(EDIT_DETAILS_XPATH));
	}
	public static void clickEditDetails(WebDriver driver) {
		getEditDetails(driver).click();
	}
	// zika slika
	public static WebElement getPhotoUpload(WebDriver driver) {
		return driver.findElement(By.xpath(PHOTO_UPLOAD_XPATH));
	}
	
	public static void clickPhotoUpload(WebDriver driver) {
		getPhotoUpload(driver).click();
	}
	
	public static WebElement getNickName(WebDriver driver) {
		return driver.findElement(By.xpath(NICK_NAME_XPATH));
	}
	public static void clickNickName(WebDriver driver) {
		getNickName(driver).click();
	}
	public static void inputNickName(WebDriver driver, String data) {
		getNickName(driver).sendKeys(data);
	}
	
	
}
