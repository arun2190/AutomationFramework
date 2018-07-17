package automationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenuim\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("http://money.rediff.com/gainers/bsc/dailygroupa?");
	    
	    
	  
	    		
	  List <WebElement> col = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/thead/tr/th"));
	  
	  System.out.println(col.size());
	  
	  List <WebElement> rows = driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr/td[1]")); 
		        System.out.println("No of rows are : " + rows.size());

		        
		  driver.quit();      
	}

}
