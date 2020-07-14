package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectClassPractice {

	public static void main(String[] args) throws InterruptedException {
		
	//	Time: 25 min
	//  As a: User of Tek school Test environment
	//	I want to: see “ Laptops & Notebooks” section
	//	So that: I can sort By : “Name(A-Z)” and Show “100”
	//	Requirement Description:
	//	When user navigate to Tek school Test Environment page using
	//	“http://tek-school.com/retail/” website. Then user open ““ Laptops & Notebooks”  section of page and selects
	//	“Show All Laptops & Notebooks” a page with All Laptops & Notebooks showed be displayed. User should be
	//	able to sort by Name(A-Z)  and change Show to “100”.
	//	Test Data:
	//	url: http://tek-school.com/retail/
	//	sort By: “Name(A-Z)”
	//	Show: 100
	//	Browser: chrome
	//	Execution report: Screenshot to show successful execution of this user Story.
	//	tek-school.com
		
		System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://tek-school.com/retail/");
		System.out.println(driver.getTitle());
		WebElement laptop_notebookXpath =driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
		
		//Functions of Action Class in Selenium:  we can perform Right click on the mouse, drag and drop, and
		//Mouse Movement to an Element on User Interface (UI)
		
		Actions action = new Actions(driver);
		//move to an element
		action.moveToElement(laptop_notebookXpath).build().perform();
		//WebElement of Show All Laptops and Notebook by xpath
		WebElement showAllL_N = driver.findElement(By.xpath("//a[text()='Show All Laptops & Notebooks']"));
		//showAllL_N.click();
		// we have two options:
				// 1. use .click method()
				// 2. action class method() to click on WebElement
			action.click(showAllL_N).build().perform();
			Thread.sleep(3000);
			//Interview question:  how to you handle a static drop down menu? Answer:  By using Select Class.
			WebElement sortby = driver.findElement(By.xpath("//select[@id='input-sort']"));
			Select select;
			select= new Select(sortby);
			select.selectByVisibleText("Name (A - Z)");
			
			WebElement Show = driver.findElement(By.xpath("//select[@id='input-limit']"));
			//Show.click();
			select = new Select(Show);
			select.selectByVisibleText("100");
			
			String outputPath = "C:\\Users\\Fareed\\eclipse-workspace\\SeleniumProject.Feb2020\\output\\";
			
			ScreenShotUtility.screenShot(driver, outputPath , "dropdown");
			
			driver.close();
			
			}

}
