package basics.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		
		//By.id  -Fastest Locator
		//By.name -
		//By.className
		//By.Css selector - faster
		//By.Xpath--Xpath slows but you can travel from parent to child and child to parent and siblings
		//By.linkText
		
		// syntax for locators 
				//WebElement elementname = driver.findElement(By.id("value of ID" );
				//WebElement elementname = driver.findElement(By.name("value of Name" );
				//WebElement elementname = driver.findElement(By.classname("value of class " );
				//WebElement elementname = driver.findElement(By.cssSelector("CssSelector );
				//WebElement elementname = driver.findElement(By.Xpath("Xpath" );
				//WebElement elementname = driver.findElement(By.LinkText("linktext" );
				
				System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
				
				// by id 
				//WebElement username = driver.findElement(By.id("email"));
				// by name 
				//WebElement username = driver.findElement(By.name("email"));
				// by classname 
				//WebElement username = driver.findElement(By.className("inputtext login_form_input_box"));
				// by xpath 
				// Syntax for xpath    //Tag[@attribute='value']       OR          //*[@attribute='value']
				// two type of xpath 
				
					//1. Absolute Xpath
						//- starts with single slash (/)
						//- Starts from head of the HTML node and goes all the way to element location
						// - NOT Recommended for Automation at all
								//Example:   /html/body/header/div/div/div[1]/div/h1/a
					//2. Relative Xpath 
						//- Starts with double slash 
						// starts mainly from element tag 
						// 95% used in automation - UI Automation
							//Relative Xpath example:  //*[@id='logo']/h1/a  OR     //Tag[@id='logo']/h1/a
				// by Relative Xpath ----Using Facebook site as an example
				//WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
				
				//Finding xpath with text():  these xpath has no attribute and it only has text.
				//	The syntax is //tag[text()='text of element']
						//Example:     //a[text='TEST ENVIRONMENT']
				//For Dynamic Element Xpath Syntax is   //tag[contains(text(), 'portion of text value')]
							//Example:  //a[contains(text(), 'ENVIRONMENT']
				
				// by CSS selector 
				
				// syntax for CSS Selector--  tag[attribute=value]  for id , name and class 
				
				//What are the differences between Xpath and CssSelector?
				//Xpath is slow, and it can travel from parent to child
				//CssSelector is fast, and it can not travel from parent to child.
				//If a locator has an id that is unique we go for that first, if it does not have an id we go for xpath.
				
				//WebElement username = driver.findElement(By.cssSelector("input[name='email']"));
				//WebElement username = driver.findElement(By.cssSelector("input[name='email']"));
	}

}
