package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		//driver.get("http://Facebook.com");
			
		// passing username and password in url to bypass Authentication popup
		// syntax
			//url:http://the-internet.herokuapp.com/basic_auth
		// syntax
			// http://<username>:<password>@the-internet.herokuapp.com/basic_auth
		
		String userName = "admin";
		String password = "admin";
		
		String url = "http://"+userName+":"+password+"@"+"the-internet.herokuapp.com/basic_auth";
		// http://admin:admin@the-internet.herokuapp.com/basic_auth
		System.out.println(url);
		
		driver.get(url);
		System.out.println(driver.getTitle());
		
		
		
		

	}

}
