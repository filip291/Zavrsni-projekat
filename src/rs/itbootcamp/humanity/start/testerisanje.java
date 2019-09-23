package rs.itbootcamp.humanity.start;

import java.beans.Expression;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;
import rs.itbootcamp.humanity.page.tests.HumanityLoginTest;

public class testerisanje {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//1. test
		try {
		HumanityHome.getLogin(driver);
		HumanityHome.clickLogin(driver);
		HumanityHome.getEmail(driver);
		HumanityHome.inputEmail(driver, "beve@web-inc.net");
		HumanityHome.getPassword(driver);
		HumanityHome.inputPassword(driver, "filip1234");
		HumanityHome.getSLogin(driver);
		HumanityHome.clickSLogin(driver);
		Thread.sleep(3000);
		HumanityLoginTest.LoginTest(driver); 
		System.out.println(HumanityLoginTest.LoginTest(driver));
		} catch (Exception e) {
			System.out.println(e);
		}
		
		//2. test
		try {
		HumanityMenu.getStaff(driver);
		HumanityMenu.clickStaff(driver);
		Thread.sleep(3000);
		HumanityStaff.clickAddEmployees(driver);
		int index=1;
		HumanityStaff.getAddEmployeeF(driver, index);
		HumanityStaff.inputFirstName(driver, index, "Marko");
		HumanityStaff.getAddEmployeeL(driver, index);
		HumanityStaff.inputLastName(driver, index, "Kraljevic");
		HumanityStaff.getAddEmployeeE(driver, index);
		HumanityStaff.inputEmail(driver, index, "asdas@gmail.com");
		HumanityStaff.clickSaveEmployee(driver); } 
		catch (Exception e) { 
			System.out.println();
		}
		

	}

	

}
