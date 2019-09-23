package rs.itbootcamp.humanity.page.tests;

import org.openqa.selenium.WebDriver;

public class HumanityLoginTest {
	public static String URL_TEST = "https://srbijainc.humanity.com/app/dashboard/";

	public static boolean LoginTest(WebDriver driver) {
		String url = driver.getCurrentUrl();
		if (url.equalsIgnoreCase(URL_TEST) ) {
			System.out.println("Logovanje uspesno.");
			return true;
		} else {
			System.out.println("Logovanje neuspesno.");
			System.out.println(url);
			return false;
		}
	}
}
