package basics.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		
		//Static dropdown will have Select tag and we can use select class to handle static dropdowns
		//how we going to handle dynamic dropdown which does not have fixed values?
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.get("https://www.aa.com/homePage.do");
		
		WebElement from = driver.findElement(By.id("reservationFlightSearchForm.originAirport"));
		// click on this element
		from.click();
		// clear the value
		from.clear();
		//Thread.sleep(3000);
		from.sendKeys("wash");
		// list of dynamic dropdows opens
		List<WebElement> departure = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
		
		for (WebElement city : departure) {
			
			try {
				if (city.getText().trim().contains("WAS"))
					JSUtility.clickElementWithJS(city, driver);
			} catch (StaleElementReferenceException e) {
				e.printStackTrace();
			}
		}
		
		Thread.sleep(3000);
		
		
		//since you people are bored why you don't automate the arrival to las vegas and 
		//select 9 people so we can party
		//15 min
		//xpath for arrival and xpath for list of cities
		//xpath for arrival:
		//input[@id='reservationFlightSearchForm.destinationAirport']//
		
		//xpath for list of arrival city
		
		//ul[@id='ui-id-2']/li
		
		//xpath for number of passangers
		
		//*[@id='flightSearchForm.adultOrSeniorPassengerCount']

		
		WebElement to = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']"));
		to.click();
		to.sendKeys("las");
		
		List <WebElement> arrival = driver.findElements(By.xpath("//ul[@id='ui-id-2']/li"));
		
		for(WebElement cityArrival: arrival) {
			
			try {
			if (cityArrival.getText().trim().contains("LAS"))
				JSUtility.clickElementWithJS(cityArrival, driver);
			}catch(StaleElementReferenceException e) {
				e.printStackTrace();
			}
			
		}
		
		Thread.sleep(3000);
		
		// select passanger from static dropdown
		
		WebElement numPass = driver.findElement(By.xpath("//*[@id='flightSearchForm.adultOrSeniorPassengerCount']"));
		Select select = new Select(numPass);
		
		// select 9 passanger
		select.selectByVisibleText("9");
		
		Thread.sleep(3000);
		
		WebElement departureDate = driver.findElement(By.xpath("//input[@name='departDate']"));
		WebElement arrivalDate = driver.findElement(By.xpath("//input[@name='returnDate']"));
		WebElement searchButton = driver.findElement(By.xpath("//input[@id='flightSearchForm.button.reSubmit']"));
		
		// departure 06/20/2020
		String depDate = "06/20/2020";
		// arrival 07/31/2020
		String retDate = "07/31/2020";
		
		// Select calendar date with JSExecutor for Departure date
		JSUtility.selectCalendarDateWithJS(driver, depDate, departureDate);
		JSUtility.selectCalendarDateWithJS(driver, retDate, arrivalDate);
		
		Thread.sleep(3000);
		
		searchButton.click();
		
		
		// since you people are bored why you dont automate the arrival to las Vegas and
		// select 9 people so we can party
		// 15 min
		// xpath for arrival and xpath for list of cities
		// - xpath for arrival:
		// //input[@id='reservationFlightSearchForm.destinationAirport']
		// xpath for list of arrival city //ul[@id='ui-id-2']/li
		// unmber of paasangers xpath
		// //*[@id='flightSearchForm.adultOrSeniorPassengerCount']
		
		

	}

}
