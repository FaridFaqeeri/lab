package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToCanva {

	public static void main(String[] args) {
		
		//1.  set system property for chrome browser
		//2. open canvas page https://canvas.instructure.com/login/canvas
		//3.  Set implicit wait for 30 seconds
		//4.  maximize browser
		
		//1. set system property for chrome browser
		
				System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				//2. open canvas page https://canvas.instructure.com/login/canvas
				driver.get("https://canvas.instructure.com/login/canvas");
				//3. Set implicit wait for 30 sec
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				//4.  maximize browser 
				driver.manage().window().maximize();
				
				// To find Web Element in UI page we will use .findElement() method 
				
				WebElement email = driver.findElement(By.id("pseudonym_session_unique_id"));
				
				// find Webelment for password with using ID for locator
				
				//WebElement password = driver.findElement(By.id("pseudonym_session_password"));
				WebElement password = driver.findElement(By.id("pseudonym_session_password"));
				
				// find Webelment for Login button with using ID for locator
				//WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[2]/button"));
			   WebElement loginButton =  driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[2]/button"));
				
				// to send a value we will use sendKeys method ()
				// to click on a button or element we will use .click method()
				
				// sends email value
			   email.sendKeys("FaridFaqeeri278@gmail.com");
				//email.sendKeys("student@tekschool.us");
				// sends password value
			   password.sendKeys("Zaynabjan4$");
				//password.sendKeys("i am not sharing my password");
				
				// clicks on login button 
			   loginButton.click();
				//loginButton.click();

		
	}

}
