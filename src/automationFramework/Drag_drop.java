package automationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drag_drop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Selenuim\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();

	    driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
	    
	    driver.findElement(By.xpath(".//*[@id='menu1']")).click();
	    
	    Thread.sleep(2000);
	    
	  //a[@href='http://www.learn-automation.com']
	    
	       List<WebElement> list = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
	       
	       for ( WebElement ele : list ){
	    	   
	    	   System.out.println(ele.getAttribute("innerHTML"));
	    	   
	    	   if(ele.getAttribute("innerHTML").contains("JavaScript")){
	    		   
	    		   ele.click();
	    		   
	    		   System.out.println("Javascript element clicked..!");
	    		   break;
	    	   }
	      	   
	    	   
	       }
	       driver.close();
	       
	}

}
