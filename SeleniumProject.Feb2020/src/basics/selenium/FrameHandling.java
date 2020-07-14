package basics.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args)  {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		
		WebElement headerFrame = driver.findElement(By.xpath("//frame[@name='main']"));
		
		driver.switchTo().frame(headerFrame);
		//driver.switchTo().frame("main");
		
		WebElement header = driver.findElement(By.xpath("//h2[text()='Title bar ']"));
		
		System.out.println(header.getText());
		
		driver.switchTo().defaultContent();
		
		//driver.close();
		
		
		// practice
		// click on home text
		// print the footer
		
		//WebElement footerFrame = driver.findElement(By.xpath("/html/body"));	
		//driver.close();
		
		WebElement NavigationFrame = driver.findElement(By.xpath("//frame[@name='navbar']"));
		driver.switchTo().frame(NavigationFrame);
		
		WebElement Home = driver.findElement(By.xpath("//a[text()='Home']"));
		Home.click();
		
		driver.switchTo().defaultContent();
		
		WebElement FooterFrame = driver.findElement(By.xpath("//frame[@name='bot']"));
		
		driver.switchTo().frame(FooterFrame);
		
		WebElement Footer = driver.findElement(By.xpath("//h2[text()='Footer ']"));
		System.out.println(Footer.getText());
		
		driver.close();
		
		

	}

}
