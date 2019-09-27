package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import rs.itbootcamp.humanity.page.objects.HumanityHome;

public class LoginTestNG {
	@Test

	public void LoginTesticNG() throws InterruptedException {
		// System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		try {
			HumanityHome.Login(driver, "beve@web-inc.net", "filip1234");
			Thread.sleep(3000);
			Assert.assertTrue(HumanityHome.LoginTest(driver));
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			Thread.sleep(5000);
			driver.quit();
		}
	}
}
