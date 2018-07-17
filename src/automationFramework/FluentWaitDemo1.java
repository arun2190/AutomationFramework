package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import com.google.common.base.Function;

public class FluentWaitDemo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenuim\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   
   // Start the application 
	    
   driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
   
   driver.findElement(By.xpath("//button[@onclick='timedText()']")).click();
   
 //Create object of FluentWait class and pass webdriver as input
  FluentWait <WebDriver> wait = new FluentWait<WebDriver>(driver);
  
  wait.pollingEvery(5,TimeUnit.SECONDS);
  wait.withTimeout(20,TimeUnit.SECONDS);
  wait.ignoring(NoSuchElementException.class);
  

  
  WebElement element = wait.until(new Function<WebDriver, WebElement>(){

	@Override
	public WebElement apply(WebDriver arg0) {
		
		
		WebElement ele = arg0.findElement(By.xpath("//p[@id='demo']"));
		
		if(ele.getAttribute("innerHTML").equalsIgnoreCase("WebDriver")) {
			
			System.out.println("Value is >>> " + ele.getAttribute("innerHTML"));
			return ele;
						
		}
		else {
		      System.out.println("Value is >>> " + ele.getAttribute("innerHTML"));
		         return null;
		     }
	 }
  });
  
//If element is found then it will display the status
  System.out.println("Final visible status is >>>>> " + element.isDisplayed());
  
}
}
  
			
		    		 
    		 
    		 
   



