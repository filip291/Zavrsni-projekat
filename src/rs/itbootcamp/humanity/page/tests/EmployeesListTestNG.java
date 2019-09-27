package rs.itbootcamp.humanity.page.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;
import rs.itbootcamp.humanity.page.utility.ExcelUtils;

public class EmployeesListTestNG {

	@Test
	public void EmployeesTest() throws InterruptedException {
		// System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String DATA_SOURCE = "Data_zavrsni.xls";
		ExcelUtils.setExcell(DATA_SOURCE);
		ExcelUtils.setWorkSheet("Zaposleni");
		String ime, prezime, email;
		try {
			HumanityHome.Login(driver, "beve@web-inc.net", "filip1234");
			HumanityMenu.clickStaff(driver);
			Thread.sleep(3000);
			Random r = new Random();
			String imeM, prezimeM;
			imeM = "Milos";
			prezimeM = "Obilic";
			List<String> employees = new ArrayList<String>();
			employees.add(imeM + " " + prezimeM + " ");
			HumanityStaff.getAddEmployees(driver);
			HumanityStaff.clickAddEmployees(driver);
			for (int i = 1; i < ExcelUtils.getRowNumber(); i++) {
				ime = ExcelUtils.getDataAt(i, 0);
				prezime = ExcelUtils.getDataAt(i, 1);
				email = ExcelUtils.getDataAt(i, 2);
				email = r.nextInt(1000) + email;
				HumanityStaff.InputEmp(driver, i, ime, prezime, email);
				employees.add(ime + " " + prezime + " ");
			}
			Thread.sleep(1000);
			HumanityStaff.clickSaveEmployee(driver);
			Thread.sleep(3000);
			WebElement meni = driver.findElement(By.xpath("//div[@class='staff-submenu-link selected']"));
			meni.click();

			List<String> zaposleni = HumanityStaff.getEmployeesList(driver);
			for (String s : zaposleni) {
				Assert.assertTrue(employees.contains(s));
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			Thread.sleep(3000);
			driver.quit();
		}
	}

}
