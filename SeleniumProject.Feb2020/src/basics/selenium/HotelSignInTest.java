package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelSignInTest {

	public static void main(String[] args) throws InterruptedException {
		
		       //1.  Open  http://canvas.instructure.com/login/canvas  in chrome browser
				//2.  Print out the title
				//3.  Take screen shot from home page
				//4.  Click on sign in button on top left side
				//5.  Wait for 5 seconds
				//6.  Take screenshot of Sign in page
				//7.  Enter email
				//8.  Enter password
				//9.  Click on sign in button
				//10.  Take screenshot of failing sign in
				//11.  Close the browser
		
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://canvas.instructure.com/login/canvas");
		
		//String siteTitle = driver.getTitle(); System.out.println(siteTitle);  or the below code.
		System.out.println(driver.getTitle());
		
		String outputPath = "C:\\Users\\Fareed\\eclipse-workspace\\SeleniumProject.Feb2020\\output\\";
		ScreenShotUtility.screenShot(driver, outputPath, "canvas");
		
		WebElement Email = driver.findElement(By.id("pseudonym_session_unique_id"));
		Email.click();
		Thread.sleep(5000);
		
		ScreenShotUtility.screenShot(driver, outputPath, "canvas1");
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='pseudonym_session_password']"));
		Password.click();
					
		Email.sendKeys("FaridFaqeeri299@gmail.com");
		Password.sendKeys("Fareeed1234");
		
		WebElement LogIn = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/div[2]/button"));
		LogIn.click();
		
				ScreenShotUtility.screenShot(driver, outputPath, "canvas2");
		
		driver.close();
		driver.quit();

		
		
		

	}

}
