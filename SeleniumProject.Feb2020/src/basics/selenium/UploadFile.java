package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		
		// To upload a file using Selenium we use sendKeys method

				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				String url = "http://xndev.com/display-image/";
				driver.get(url);

				// we need to find Locator of WebElement

				WebElement uploadFile = driver.findElement(By.xpath("//input[@type='file']"));

			//String filePath = "C:\\Users\\Fareed\\Desktop\\Homework page 1.png";
			//String filePath = "C:\\Users\\Fareed\\Pictures\\2019-11\\9da6c532.jpg";
				String filePath = "C:\\Users\\Fareed\\Documents\\Car.java";
			
			

				// upload the file
				uploadFile.sendKeys(filePath);


	}

}
