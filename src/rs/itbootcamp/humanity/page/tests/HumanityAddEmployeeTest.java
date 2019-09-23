package rs.itbootcamp.humanity.page.tests;

import org.openqa.selenium.WebDriver;

public class HumanityAddEmployeeTest {
	public static final String URL_TEST="https://srbijainc.humanity.com/app/staff/assignstaff&new=1&first=";
	public static boolean EmpAddTest(WebDriver driver) {
		String url=driver.getCurrentUrl();
		if (url.contains(URL_TEST)) {
			System.out.println("Uspesno dodat radnik");
			return true;
		} else {
			System.out.println("Neuspesno dodat radnik");
			return false;
		}
	}
}
