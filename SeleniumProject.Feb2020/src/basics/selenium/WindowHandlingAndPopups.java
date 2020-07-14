package basics.selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingAndPopups {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://ksrtc.in/oprs-web/");
		String pagetitle;
		
		 // handle window pop ups ( webpage based popup)
		// Switch method and then Alert method.
		// we can either accept an alert or deny if decline option is available
		// we can print out the alert message too
		
		WebElement searchBus = driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']"));
		searchBus.click();
		
		// we will get text of alert and store in a string
		String alertText =driver.switchTo().alert().getText();
		System.out.println(alertText);
		//Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		
		
		Thread.sleep(5000);
		
		pagetitle = driver.getTitle();
		System.out.println("This is before switching windows  " + pagetitle);
		// click on CRM element on UI
		WebElement crm = driver.findElement(By.xpath("//p[text()='CRM']"));
		
		crm.click();
		// we to get window handles when we want to switch between windows or tabs
		Set <String> WindowsHandles = driver.getWindowHandles();
		
		// Iterator will iterate through the SET to get next index
		Iterator <String> it =WindowsHandles.iterator();
		
		String parentWindow = it.next();
		String childwindow = it.next();
		
		driver.switchTo().window(childwindow);
		pagetitle = driver.getTitle();
		System.out.println("This is After switching windows  " + pagetitle);
		
		// Enter User name dammy data
		WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Enter User Name']"));
		// Enter Password  dammy data
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter Password']"));
		// click on Login Button
		WebElement loginin = driver.findElement(By.xpath("//input[@value='Log in']"));
		
		userName.sendKeys("test@test.com");
		password.sendKeys("wrongPassword");
		loginin.sendKeys(Keys.ENTER);  // same action as .click()
		//Wait for 5 sec
		Thread.sleep(5000);
		// Take Scrrenshot
		
		String outputPath =  "C:\\Users\\Fareed\\eclipse-workspace\\SeleniumProject.Feb2020\\output\\";
		ScreenShotUtility.screenShot(driver, outputPath, "ksrtc");
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle());
		
		driver.quit();	

	}

}
