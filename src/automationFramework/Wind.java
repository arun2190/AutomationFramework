package automationFramework;

import java.util.Set;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@SuppressWarnings("unused")
public class Wind {

		public static WebDriver driver;

		public static void main(String[] args) {

			// Create a new instance of the Firefox driver

			System.setProperty("webdriver.chrome.driver","C:\\Selenuim\\chromedriver_win32\\chromedriver.exe");
		       
		       WebDriver driver = new ChromeDriver();

		    // Alert Message handling
       		
	            driver.get("http://demo.guru99.com/V4/");			
	                                		
	            driver.findElement(By.name("uid")).sendKeys("mngr30127");					
	            driver.findElement(By.name("password")).sendKeys("EzAtAqy");					
	            driver.findElement(By.name("btnLogin")).submit();			
	            driver.findElement(By.linkText("Delete Customer")).click();			
	            driver.findElement(By.name("cusid")).sendKeys("53920");					
	            driver.findElement(By.name("AccSubmit")).submit();			
	            		
	                // Switching to Alert        
	            Alert alert=driver.switchTo().alert();		
	            		
	            // Capturing alert message.    
	            String alertMessage=driver.switchTo().alert().getText();		
	            		
	            // Displaying alert message		
	            System.out.println(alertMessage);			
	            		
	            // Accepting alert		
	            alert.accept();

	}

}