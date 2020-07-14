package basics.selenium;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	//Steps. 1 and 2 create and name the new class--LunchWellsFargoBank
public class LunchWellsFargoBank {

	public static void main(String[] args) throws InterruptedException {
		
	//Step3.  Set System Property for chrome browser
		System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
	//Step4.  We need to use WebDriver Interface to lunch chrome Browser
		WebDriver driver = new ChromeDriver();
	//Step5.  Manage driver
		driver.manage().window().maximize();
	//Step6.  Set pageload Timeout to 15 seconds
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	//Step7.  Set Implicit wait for 20 seconds
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//Step8.  Open your favorite Website
		driver.get("http://wellsfargo.com/");
	//Step9.  The Website's Title
		String siteTitle =  driver.getTitle();
		System.out.println(siteTitle);
	//Step10.  Write an if condition
		if (siteTitle.equals(siteTitle)) {
		System.out.println(siteTitle + "\r" + "Test Passed!");
		} else {
			System.out.println("Test Failed");
		}
	//Step11.  Write a Switch statement
		switch(siteTitle) {
		case "WellsFargoBank - page title" :
			System.out.println(siteTitle+ "\r" + "Matched Page Title = Test Passed!");
			break;
		case " " :
			System.out.println("Not Matching Title = Test Failed");
			break;
		}
	//Step12.  Wait for 5 seconds
			Thread.sleep(5000);
	//Step13.  Close the front window
			driver.close();
	//Step14.  Close all the cascade of windows from front to back
			 driver.quit();
			
		}
	
}
