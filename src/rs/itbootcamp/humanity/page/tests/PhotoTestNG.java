package rs.itbootcamp.humanity.page.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;

public class PhotoTestNG {
	@Test
	public void testPhoto() throws InterruptedException {
		// System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			HumanityHome.Login(driver, "beve@web-inc.net", "filip1234");
			Thread.sleep(3000);

			String putanja = "C:\\Users\\User\\Desktop\\sel\\jaje.jpg";
			HumanityProfile.clickProfile(driver);
			HumanityProfile.clickSettings(driver);
			Thread.sleep(3000);
			HumanityProfile.clickDetails(driver);
			Thread.sleep(3000);
			HumanityProfile.uploadPhoto(driver, putanja);
			Thread.sleep(3000);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,2000)");
			Thread.sleep(1000);
			HumanityProfile.clickSaveChg(driver);
			Assert.assertTrue(HumanityProfile.testPhoto(driver));
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			Thread.sleep(5000);
			driver.quit();
		}
	}
}
