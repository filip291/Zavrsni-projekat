package rs.itbootcamp.humanity.start;

import java.beans.Expression;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.touch.ScrollAction;
import org.testng.Assert;
import org.testng.TestNG;

import rs.itbootcamp.humanity.page.objects.HumanityEditStaff;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;
import rs.itbootcamp.humanity.page.objects.HumanitySettings;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;
import rs.itbootcamp.humanity.page.tests.EmployeesListTestNG;
import rs.itbootcamp.humanity.page.tests.GetSettingsTestNG;
import rs.itbootcamp.humanity.page.tests.HumanityGetVersionTestNG;
import rs.itbootcamp.humanity.page.tests.LoginTestNG;
import rs.itbootcamp.humanity.page.tests.SelectSettingsTestNG;
import rs.itbootcamp.humanity.page.utility.ExcelUtils;

public class testerisanje {

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		// WebDriver driver = new ChromeDriver();

		TestNG testng = new TestNG();
		List<String> suites = new ArrayList<>();
		suites.add("C:\\Users\\User\\Desktop\\sel\\testng.xml");
		testng.setTestSuites(suites);
		testng.run();

	}

}
