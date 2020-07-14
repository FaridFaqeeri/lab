package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelLoginWithJSE {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		String url = "http://tek-school.com/hotel/";
		driver.get(url);

		WebElement signIn = driver.findElement(By.xpath("//span[@class='hide_xs']"));
		JSUtility.clickElementWithJS(signIn, driver);

		JSUtility.sendKeysWithJS(driver, "email", "Test@test.com");
		JSUtility.sendKeysWithJS(driver, "passwd", "WrongPassword");

		WebElement signINButton = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span"));
		JSUtility.clickElementWithJS(signINButton, driver);


	}

}
