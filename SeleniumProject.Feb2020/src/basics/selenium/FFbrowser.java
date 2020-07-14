package basics.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FFbrowser {

	public static void main(String[] args) {
	//1.  Get Firefox browser from Internet
	//Firefox is default browser of Selenium we do not need to set system.setProperty--geckodriver is use for Firefox.
		
		//System.setProperty("webdriver.geckodriver.driver","c:\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		//open Test Environment Website--not opening in my computer --try to open ufl.edu websit
		
		driver.get("http://ufl.edu/");
		//Store website Title in a string and string name is title. Method to get title is .gettitle()
		String title = driver.getTitle();
		System.out.println("Website title is "+title);
		
		//closed browser
		driver.quit();

	}

}
