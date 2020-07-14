package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		
		//1.  Set System property for chrome browser
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
		
		//2.  Create object of WebDriver that instantiates ChromeBrowser
		WebDriver driver = new ChromeDriver();
		
		//3. Maximize browser
		driver.manage().window().maximize();
		
		//4.  set pageload time out
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		//5.  set implicit time out
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//6.  deleteAllCookes of the browser
		driver.manage().deleteAllCookies();
		
		//7.  driver.get---get us to website address--will wait until all the Elements of website populate
		driver.get("http://wellsfargo.com/");
		//wait for 5 seconds
		Thread.sleep(5000);
		//8.  driver.navigate.to----------get us to website address---will not wait for all the Elements of website to populate the site
		driver.navigate().to("https://facebook.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.close();
		driver.quit();
	
	}
		
}
