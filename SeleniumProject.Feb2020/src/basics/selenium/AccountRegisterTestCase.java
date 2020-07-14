package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountRegisterTestCase {

	public static void main(String[] args) {
		
		
		//Set basic system property for chrome
				//set pageload to 30 seconds
				//set implicit wait to 30 
				//set window to maximize
				//open test 
				//open register form -----------15 min to write the code
				//-----------
				
				//check if Yes radio button is not selected return false
				//click on Yes radio button j
				//verify yes radio button is selected
				//verify privacy policy is displayed
				//verify continue button is enabled.
				
				System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
				
				driver.get("http://tek-school.com/retail");
				
				WebElement myAccount = driver.findElement(By.xpath("//span[text()='My Account']"));
				myAccount.click();
				
				WebElement Register = driver.findElement(By.xpath("//a[text()='Register']"));
				Register.click();
				
				WebElement yesRadioButton = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
				
				System.out.println(yesRadioButton.isSelected());
				
				if (!yesRadioButton.isSelected()) {
					
					yesRadioButton.click();
					System.out.println(yesRadioButton.isSelected());
					WebElement privacyPolicy = driver.findElement(By.xpath("//b[text()='Privacy Policy']"));
					System.out.println(privacyPolicy.isDisplayed());
					WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
					System.out.println(continueButton.isEnabled()); }
				
				
		}

}
