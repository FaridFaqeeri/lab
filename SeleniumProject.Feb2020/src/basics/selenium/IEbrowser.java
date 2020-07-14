package basics.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEbrowser {

	public static void main(String[] args) {
		
		//Setup System.setProperty for IE Browser
		System.setProperty("webdriver.ie.driver","C:\\IEDriverServer.exe");
		//Tasks to finish in 5 minutes:  1.  Create object of WebDriver that references to InternetExplorerDriver()
		WebDriver driver = new InternetExplorerDriver();
		//open Test Environment Website--not opening in my computer --try to open ufl.edu websit	
		driver.get("http://wellsfargo.com/");
		//wait for 5 seconds
		
			
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//Always write the Thread.sleep(5000) method and then choose from drop down menu 
				//either "Add throws declaration" or choose this other option "Surround with try/catch".  Make sure there is no 
				//red lines in the code below it.  If there is red mark in the code line below the drop down menu will not appear.
		
				// close the browser
				
				driver.close();//Make sure you put this method inside the main method
				driver.quit();//Make sure you put this method inside the main method
	
	
	}
				
}
	


