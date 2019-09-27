package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanitySettings;

public class SelectSettingsTestNG {
	@Test
	public void testSelection() throws InterruptedException {
		// System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String zemlja = "Serbia";
		String jezik = "Serbian (machine)";
		String vreme = "24 hour";

		try {
			HumanityHome.Login(driver, "beve@web-inc.net", "filip1234");
			Thread.sleep(1000);
			HumanityMenu.clickSettings(driver);
			Thread.sleep(1000);
			HumanitySettings.SelectAll(driver, zemlja, jezik, vreme);
			Thread.sleep(1000);
			Assert.assertTrue(HumanitySettings.SelectAll(driver, zemlja, jezik, vreme));
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			Thread.sleep(3000);
			driver.quit();
		}
	}
}